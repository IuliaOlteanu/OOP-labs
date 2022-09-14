import java.util.*;
public class Person {
    String name;
    String address;

    public Person(String name,String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {

        return address;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String toString() {
        return "Person : " +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
class Student extends Person {
    Vector<String> cursuri = new Vector<String>();
    Vector<Integer> note = new Vector<Integer>();
    public Student(String name, String address) {

        super(name, address);
    }

    @Override
    public String toString() {
        return "Student : " +
                "nume ='" + name + '\'' +
                ", adresa ='" + address + '\'' +
                ", cursuri =" + cursuri +
                ", note =" + note +
                "\n" + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        cursuri.addElement(course);
        note.addElement(grade);
    }

    public void printGrades() {
        int i;
        for(i = 0; i < note.size(); i++){
            System.out.println("nota : " + note.get(i));
        }
    }

    public double getAverageGrade() {
        int i;
        double s=0;
        for(i = 1; i <= note.size(); i++){
            s = s + note.get(i);
        }
        return s/note.size();
    }
}
class Teacher extends Person {
    Vector<String> cursuri = new Vector<String>();

    public Teacher(String name, String address) {

        super(name, address);
    }

    public String toString() {
        return "Teacher : " +
                "nume ='" + name + '\'' +
                ", adresa ='" + address + '\'' +
                ", cursuri =" + cursuri +
                " " + super.toString();
    }
    public boolean addCourse(String course) {
        if(cursuri.contains(course))
            return false;
        cursuri.addElement(course);
        return true;
    }
    public boolean removeCourse(String course) {
        if(cursuri.contains(course)) {
            cursuri.remove(course);
            return true;
        }
        return false;
    }
}
class Test4 {
    public static void main(String args[]) {
        Person student, teacher, person;
        student = new Student("Popescu Ion", "Bucuresti");
        teacher = new Teacher("Ionescu Gigel", "Bucuresti");
        person = new Person("Maria", "Iasi");
        assert (person.getName().equals("Maria")) : "Metoda getName din clasa Person nu este implementata corect";
        assert (((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Algoritmica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Matematica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).removeCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        ((Student) student).addCourseGrade("Programare", 10);
        ((Student) student).addCourseGrade("Algoritmica", 9);
        ((Student) student).addCourseGrade("Matematica", 8);
        assert (Math.abs(((Student) student).getAverageGrade() - 9.00) <= 0.001) : "Metoda getAverageGrade din clasa " +
                "Student nu a fost implementat corect";
        ((Student) student).printGrades();
        //Ce metoda toString se va apela? Din ce clasa?
        System.out.println(student);
        System.out.println(person);
        System.out.println("Felicitari! Problema a fost rezolvata corect!");
    }
}