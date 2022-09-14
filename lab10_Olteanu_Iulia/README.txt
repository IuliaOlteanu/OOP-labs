Problema 1
Sa se realizeze un program care afiseaza patru campuri text si un buton. In primele trei campuri text, utilizatorul introduce numele discului suport (A:, C:, D:), calea (secventa de directoare) si numele unui fisier. La apasarea pe buton se va afisa, in cel de-al patrulea camp text, calea completa la fisier.

In implementare, se vor scrie urmatoarele doua variante:

Se inregistreaza trei obiecte ascultator (ActionListener) cate unul pentru fiecare JTextField, care transfera textul din fiecare camp text in cel destinat rezultatului.
Se inregistreaza un singur obiect ascultator la JButton, care va compune datele din primele 3 campuri si le va afisa in cel destinat rezultatului.

Problema 2
Sa se realizeze un program care citeste dintr-un fisier o intrebare urmata de 4 raspunsuri posibile, unul singur fiind corect (primul indicat in fisier), si afiseaza un camp text nemodificabil, care va contine enuntul intrebarii, patru butoane de tip JRadioButton, grupate intr-un grup de butoane (ButtonGroup),continand raspunsurile posibile, si un buton pentru validarea raspunsului selectat. Butonul de validare este de tip JButton si este accesibil doar dupa ce a fost ales un raspuns. In cazul in care raspunsul selectat este corect, se va aplica textului raspunsului culoarea verde, iar, in caz contrar, i se va aplica raspunsului corect culoarea rosie.

@Override
 public void actionPerformed ( ActionEvent e ) {
  if (e.getSource() instanceof JRadioButton ) {
    button.setEnabled(true);
  }
 }

Problema 3
Modificati programul implementat la exercitiul anterior, pentru afisarea unor casete cu bifare, JCheckBox. Astfel, de aceasta data vom avea un program care permite uzitarea unor intrebari cu raspunsuri corecte multiple. Toate cele patru casete de tip JCheckBox vor avea un singur ascultator de tip ItemListener, cu o metoda itemStateChanged() si cu un argument de tip ItemEvent.

Butonul de validare este de tip JButton si este accesibil doar dupa ce a fost ales un raspuns. La apasarea butonului de validare se va aplica textelor raspunsurilor corecte culoarea verde, iar celor incorecte li se va aplica culoarea rosie. Presupunem ca sunt corecte primul si al treilea raspuns.

Problema 4
Sa se implementeze o aplicatie grafica cu 3 obiecte cursor, de tip JSlider, si un camp text. Fiecare cursor corespunde ponderii unei culori (Red, Green, Blue), iar culoarea apare in campul text. Pentru fiecare obiect JSlider, trebuie sa definiti urmatoarele: orientarea, valoarea minima, valoarea maxima si valoarea initiala afisata (ca numere intregi).

La deplasarea cursorului, se genereaza un eveniment de tip ChangeEvent si se apeleaza metoda stateChanged, dintr-un obiect ChangeListener. Valoarea ce corespunde pozitiei cursorului se poate obtine cu metoda getValue() din clasa JSlider, ce are ca rezultat un int.

slider = new JSlider(JSlider.HORIZONTAlL, 0, 255, 0);

Problema 5
Program pentru afisarea unui buton cu inscriptia Colors si modificarea culorii acestuia ca urmare a efectuarii unui click pe buton. Metoda setForeground() cu parametru de tip Color schimba culoarea textului, iar metoda setBackground() schimba culoarea butonului. La fiecare click se va itera pe un vector de culori, initializat cu constante (Color.RED, Color.BLUE etc). Folositi o fereastra JFrame cu dimensiuni mici (100, 100) si organizarea FlowLayout. Implementati si posibilitatea de actionare a butonului prin combinatia de taste ALT+C.

buton.setMnemonic(KeyEvent.VK_C);

Problema 6
Realizati o fereastra cu titlu, folosind JFrame, care sa contina urmatoarele: o eticheta, avand ca text Calea, un JTextField, un JButton si un JScrollPane care sa contina un JTextArea, setat initial ca fiind invizibil.

Dupa ce se va introduce o cale, catre un fisier text aflat local pe disc, se va afisa continutul acestui fisier in fereastra, uzitand componenta de tip JTextArea.

Componenta de tip JScrollPane va deveni vizibila la accesarea butonului, daca exista fisierul specificat local pe disc, in caz contrar, se va sterge continutul din JTextField.

File f = new File(path);
if(f.exists() && !f.isDirectory()) { … }