public class PrymitywneTypyDanych {

    // liczy stałoprzecinkowe
    byte firstNumber = 127; // 1 bajt -128 do 127
    short secondNumber = 32689; // 2 bajty -32768 do 32767
    int thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
    long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

    // liczby zmiennoprzeicnkowe
    float fifthNumber = 4.99934F; // 4 bajty - max ok 6-7 liczb po przecinku
    double sixthNumber = 3.99999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku
    // jawna deklaracja L (long), F (float), D (double), ponieważ przy prostym wywołaniu printfln domyślnie uznaje się wartość jako int

    // wartość logiczna
    boolean prawda = true;
    boolean falsz = false;

    // pojedynczy znak
    char letter = 'A'; // pojedynczy znak umieszczamy pomiędzy '', a nie "" (to oznaczenie jest dla String)
}
