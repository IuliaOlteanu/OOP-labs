Problema 2
Pornind de la ierarhia definită anterior, declarati un obiect de tip Rectangle. Verificați dacă puteți instanția un astfel de obiect folosind unul din constructorii clasei Shape și unul din cei existenți în clasa Square. Declarați și instanțiați un obiect de tip Square, apoi incercați să îi faceți cast la un obiect de tip: Rectangle, Shape și Circle. Eliminați erorile apărute, folosind instanceof pentru a determina dacă este validă operația pe care incercați să o realizați.

Determinați tipurile conversiilor, din blocul de cod de mai jos, indicând dacă sunt sau nu posibile.

//Conversie 1
Circle c1 = new Circle();
Square sq = (Square) c1;
//Conversie 2
Rectangle r = new Rectangle(5.0, 5.0);
sq = (Square) r;
//Conversie 3
sq = new Square(7.0);
r = sq;

Problema 3
Pornind de la interfața propusă, creați o clasă Student care implementează interfața Persoana și conține ca membri privați numele studentului și un vector cu elemente de tip Double, reprezentând mediile acestuia. Compararea se va realiza crescator dupa nume, iar dacă există doi studenți care au același nume, primul este cel cu media mai mare.

Scrieți o metodă main care construiește un vector (obiect din clasa Vector) cu elemente de tip Student, îl ordonează, conform criteriului anterior, folosind Collectios.sort, și apoi îl afișează!

interface Persoana extends Comparable {
    public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(double medie);
}

Problema 5
Să se modeleze o garnitură de tren. Se va defini în acest scop o clasă Tren. Un obiect de tip Tren conține mai multe referințe spre obiecte de tip Vagon care sunt păstrate într-un obiect de tip Vector. Un vagon poate fi de 3 tipuri: CalatoriA, CalatoriB și Marfa. Despre garnitura de tren și vagoane mai cunoaștem următoarele:

un tren poate conține mai multe tipuri de vagoane;
un vagon de tip CalatoriA:
are capacitatea de 40 pasageri și 300 colete poștale;
furnizează două servicii pentru deschiderea, respectiv închiderea automată a ușilor.
un vagon de tip CalatoriB:
are capacitatea de 50 pasageri și 400 colete poștale;
furnizează două servicii pentru deschiderea, respectiv închiderea automată a ușilor;
fiind un vagon mai nou, furnizează un serviciu automat pentru blocarea geamurilor.
un vagon de tip Marfa:
are capacitatea de 400 colete poștale;
nu furnizează servicii pentru deschiderea, respectiv închiderea automată a ușilor, aceste operații executându-se manual.
Implementați clasa abstractă care modelează conceptul de vagon împreună cu clasele sale derivate. Se menționează că apelurile serviciilor pentru deschiderea, respectiv închiderea ușilor și blocarea geamurilor vor afișa pe ecran un mesaj corespunzător.

Implementați clasa Tren conform specificațiilor. Obiectele de tip Tren trebuie să fie comparabile, două trenuri fiind considerate egale dacă pot transporta același număr de colete. Această clasă conține o metodă pentru afișarea tipurilor de vagoane existente în componența trenului.