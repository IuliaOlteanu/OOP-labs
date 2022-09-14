Problema 1
Se ofera clasa de baza Patrulater care descrie o figura geometrica reprezentata printr-un patrulater convex. Pornind de la clasa oferita, implementati urmatoarea ierarhie de clase, alegand constructorii considerati potriviti pentru fiecare clasa:

clasa Paralelogram care mosteneste Patrulater;
clasele Romb si Dreptunghi care mostenesc clasa Paralelogram;
clasa Patrat care mosteneste clasa Dreptunghi.

Problema 2
Pornind de la clasa de baza Array oferita, implementati urmatoarele clase:

clasa SortedArray care modeleaza un vector de numere intregi sortat crescator, folosind mostenirea;
clasa MyStack care modeleaza o stiva care contine numere intregi, folosind agregarea.
Ambele clase vor utiliza metodele puse la dispozitie in clasa Array, in forma originala sau intr-o forma modificata, iar clasa MyStack trebuie sa ofere metodele push si pop, specifice acestei structuri de date. Metoda push va oferi posibilitatea introducerii unui numar intreg in varful stivei, in timp ce metoda pop va inlatura elementul din varful stivei si il va intoarce.

Problema 3
Sa se implementeze o clasa HSet care modeleaza o multime realizata ca tabel de dispersie. Clasa este derivata din Hashtable si contine metodele: add, remove, toString.

Cheia si valoarea vor fi egale (cheile sunt elementele multimii). Pentru testare, folositi clasa Test3.

//Adauga un element in multime, daca nu exista deja
public boolean add(Object value);
//returneaza un String cu elementele multimii (doar cheile, nu perechi)
public String toString();
//Sterge perechea corespunzatoare cheii, intorcand valoarea
public Object remove(Object key);