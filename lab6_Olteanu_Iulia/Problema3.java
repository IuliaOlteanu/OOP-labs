import java.util.Collections;
import java.util.Vector;

import static java.util.Collections.*;

interface Persoana extends Comparable {
    public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(double medie);
}

class Student implements Persoana {
    private String nume;
    private Vector<Double> medie = new Vector<Double>();

    public Student(String nume, Vector<Double> medie) {
        this.nume = nume;
        this.medie = medie;
    }
    public Student(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Vector<Double> getMedie() {
        return medie;
    }

    public void setMedie(Vector<Double> medie) {
        this.medie = medie;
    }
    public double calculMedieGenerala() {
        double s = 0;
        for(int i = 0; i < medie.size(); i++)
            s = s + medie.get(i);
        return s/medie.size();
    }
    public void addMedie(double medie) {
        this.medie.addElement(medie);

    }
    public int compareTo(Object obj) {
        Student s = (Student)obj;
        if(this.nume.equals(s.nume)) {
            if((s.calculMedieGenerala() - this.calculMedieGenerala()) < 0)
                return -1;
            return 1;
        }
        return this.nume.compareTo(s.nume);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", medie=").append(medie);
        sb.append(", medie generala=").append(calculMedieGenerala());
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
}

public class Problema3 {
    public static void main(String args[]) {
        Vector<Student> students = new Vector<>();
        Student s1 = new Student("Ionescu");
        s1.addMedie(6);
        s1.addMedie(7.89);

        Student s2 = new Student("Ion");
        s2.addMedie(9.45);
        s2.addMedie(6.45);

        Student s3 = new Student("Vasile");
        s3.addMedie(5.89);
        s3.addMedie(6.66);

        Student s4 = new Student("Vasile");
        s4.addMedie(7.56);
        s4.addMedie(9.10);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println("Afisare studenti : ");
        for(int i = 0; i < students.size(); i++)
            System.out.println(students.get(i).getNume() + " " + students.get(i).calculMedieGenerala());

        Collections.sort(students);
        System.out.println("Afisare studenti dupa ordonare : ");
        for(int i = 0; i < students.size(); i++)
            System.out.println(students.get(i).getNume() + " " + students.get(i).calculMedieGenerala());

        System.out.println(students);

    }
}