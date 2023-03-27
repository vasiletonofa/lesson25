package person;

public class Person {

    private int age;

    private String name;

    public void setAge(int age) throws Exception { // -1
        if(age > 0) {
            this.age = age;
        } else {
            throw new Exception("Nu puteti crea o persoana cu varsta negativa !!!");
        }
    }

    public void setName(String name)  { // -1
        if(name.length() > 2) {
            this.name = name;
        } else {
            throw new RuntimeException("Nu puteti crea o persoana cu nume mai mic decat 2 caractere !!!");
        }
    }

}
