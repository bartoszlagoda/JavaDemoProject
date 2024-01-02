package Lekcje.Gettery_i_Settery;

public class ReadOnly {
    private String name = "Bartosz";

    // Getter - metoda publiczna, która zwraca wartość pola prywatnego
    public String getName(){
        name = name + "jest ok"; // tutaj można dodać inne rzeczy
        return name;
    }

    //Setter - pozwala na przypisanie, ustawienie wartości, ale nie mozna na nim dzialac
    public void setName(String name) {
        this.name = name;
    }
}
