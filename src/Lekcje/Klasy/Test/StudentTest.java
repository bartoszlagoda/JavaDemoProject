package Lekcje.Klasy.Test;

import Lekcje.Klasy.Student;

// Stworz 3 obiekty klasy Student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
// Przejdz przez studentow w tablicy. Wywolaj wszystkie cztery metody.
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.imie = "Jan";
        student1.nazwisko = "Kowalski";
        student1.email = "jan.kowalski@student.uczelnia.pl";
        student1.nick = "jan.kowalski";
        student1.numerIndeksu = 311212;
        String uczelniaStudent1 = Student.nazwaUczelni; // wywołanie statycznego pola

        Student student2 = new Student();
        student2.imie = "Janusz";
        student2.nazwisko = "Nowak";
        student2.email = "janusz.nowak@student.uczelnia.pl";
        student2.nick = "janusz.nowak";
        student2.numerIndeksu = 311213;

        Student student3 = new Student();
        student3.imie = "Janina";
        student3.nazwisko = "Kozlowska";
        student3.email = "janina.kozlowska@student.uczelnia.pl";
        student3.nick = "janina.kozlowska";
        student3.numerIndeksu = 311214;

        Student[] studenci = new Student[] {student1,student2,student3};

        for (int i = 0; i < studenci.length; i++) {
            System.out.println("Dane studenta nr " + (i + 1));
            Student.infoUczelnia(); // nie ma potrzeby wywoływania obiektu klasy, wywołujemy klasę
            studenci[i].przedstawSie();
            studenci[i].podajNrIndeksu();
            studenci[i].podajEmail();
            studenci[i].zalogujSie();
            System.out.println("----------------------------");
        }
    }
}
