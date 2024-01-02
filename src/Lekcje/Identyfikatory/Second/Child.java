package Lekcje.Identyfikatory.Second;

import Lekcje.Identyfikatory.First.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostepu do pol, metod default i private

    public void testIdentifier(){
        System.out.println(first);
//        System.out.println(second); // brak dostępu do pola default
        System.out.println(third);
//        System.out.println(fourth); // brak dostępu do pola private
        firstMethod();
//        secondMethod(); // brak dostępu do metody default
        thirdMethod();
//        fourthMethod(); // brak dostępu do metody private
    }
}
