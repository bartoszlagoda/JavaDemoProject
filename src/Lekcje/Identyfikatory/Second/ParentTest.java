package Lekcje.Identyfikatory.Second;

import Lekcje.Identyfikatory.First.Parent;

public class ParentTest {

    // klasa w innej paczce nie ma dostepu do pol, metod default, private i protected

    public void testIdentifier(){
        Parent parent = new Parent();

        System.out.println(parent.first);
//        System.out.println(parent.second); // brak dostępu do pola default
//        System.out.println(parent.third); // brak dostepu do pola protected
//        System.out.println(parent.fourth); // brak dostępu do pola private
        parent.firstMethod();
//        parent.secondMethod(); // brak dostępu do metody default
//        parent.thirdMethod(); // brak dostepu do metody protected
//        parent.fourthMethod(); // brak dostępu do metody private
    }
}
