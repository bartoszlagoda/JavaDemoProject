package Lekcje;

public class OperatoryPorownania {
    // OP porownuja podane dane i zwracaja wartosc logiczna
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = firstNumber > secondNumber;

        System.out.println(result); // false
        System.out.println(firstNumber == secondNumber); // czy rowne (false)
        System.out.println(firstNumber != secondNumber); // czy rozne (true)
        System.out.println(firstNumber > secondNumber); // czy firstNmber jest wieksze od secondNumber (false)
        System.out.println(firstNumber < secondNumber); // czy secondNumber jest wieksze od firstNumber (true)
        System.out.println(firstNumber >= secondNumber); // czy firstNumber jest wieksze badz rowne secondNumber (false)
        System.out.println(firstNumber <= secondNumber); // czy secondNumber jest wieksze badz rowne firstNumber (true)
    }
}
