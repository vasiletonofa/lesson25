package person;

import exception.SetAgeException;
import exception.SetNameException;

import java.io.File;
import java.io.FileNotFoundException;

public class Person {

    private int age;

    private String name;




    public void getFile(String fileName) throws FileNotFoundException {

        File fileTxt = new File("C:/users/vasile/file.txt"); // calea este gresita

        if(fileTxt.exists()) {
            // prelucram datele din fisier
        } else {
            throw new FileNotFoundException("Fisierul file.txt nu a fost gasit");
        }
    }


    public void setAge(int age) throws Exception { // -1

        // gaseste fisierul

        if(true) {
            throw new SetNameException();
        }

        if(true) { // incercam sa extragem date din baza de date
            throw new Exception("Checked exception");
        }

        if(age > 0) {
            this.age = age;
        } else {
            throw new SetAgeException("Nu puteti crea o persoana cu varsta negativa !!!");
//            throw new RuntimeException("Nu puteti crea o persoana cu varsta negativa !!!");
        }
    }

    public void setName(String name) throws RuntimeException { // -1
        if(name.length() > 2) {
            this.name = name;
        } else {
            throw new RuntimeException("Nu puteti crea o persoana cu nume mai mic decat 2 caractere !!!");
        }
    }

}
