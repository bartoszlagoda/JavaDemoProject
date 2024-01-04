package Lekcje.Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File deletedFile = new File("test.txt");
        // usuwanie pliku
        if(deletedFile.delete()){
            System.out.println("Usunelismy plik!");
        } else{
            System.out.println("Nie udalo sie usunac pliku. ");
        }
    }
}
