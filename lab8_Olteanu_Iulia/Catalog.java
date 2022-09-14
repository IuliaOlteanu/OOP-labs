import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Catalog extends TreeSet<Catalog.Student> {

    public Catalog() {
        super();
    }

    public Catalog(Comparator<? super Student> comparator) {
        super(comparator);
    }
    public void addStudent(String name, double media, int clazz) {
        Catalog.Student nou = new Catalog.Student(name, media, clazz);
        add((Student) nou);
    }
    public Catalog.Student getStudent(String name) {
        for(Iterator itr = iterator(); itr.hasNext();) {
            Catalog.Student stud = (Catalog.Student) itr.next();
            if(stud.name.equals(name))
                return stud;
        }
        return null;
    }

    public void removeStudent(String name) {
        Student stud = (Student) getStudent(name);
        if(stud != null)
            remove(stud);
    }
    public Catalog byClass(int clazz) {
        Catalog nou = new Catalog(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for(Student s : this) {
            if(s.clazz == clazz)
                nou.addStudent(s.name, s.media, s.clazz);
        }
        return nou;
    }
    class Student implements Comparable<Catalog.Student> {
        String name;
        double media;
        int clazz;

        public Student(String name, double media, int clazz) {
            this.name = name;
            this.media = media;
            this.clazz = clazz;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMedia() {
            return media;
        }

        public void setMedia(double media) {
            this.media = media;
        }

        public int getClazz() {
            return clazz;
        }

        public void setClazz(int clazz) {
            this.clazz = clazz;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Student{");
            sb.append("name='").append(name).append('\'');
            sb.append(", media=").append(media);
            sb.append(", clazz=").append(clazz);
            sb.append('}');
            return sb.toString();
        }

        public int compareTo(Catalog.Student o) {
             if(media == o.media)
                 return name.compareTo(o.name);
             return Double.compare(media, o.media);
        }
    }
}
