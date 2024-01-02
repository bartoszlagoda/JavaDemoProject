package Lekcje.Identyfikatory.First;

public class Child extends Parent{

    // klasa potomna w tej samej paczce nie ma dostepu do pol, metod private

    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
//        System.out.println(fourth); // brak dostępu do pola private
        firstMethod();
        secondMethod();
        thirdMethod();
//        fourthMethod(); // brak dostępu do metody typu private
    }
}
