import person.Person;
import person.Response;

public class Main {
    public static void main(String[] args) {


        Person ion = new Person();

        try {
            ion.setAge(-1);
        } catch (Exception e) {
            System.out.println("Am ajuns in catch");
            new Response("Nu am reusit sa cream o persoana noua din cauza ca: "  + e.getMessage());
        }

        try {
            ion.setName("AB");
        } catch (RuntimeException e) {
            System.out.println("Am ajuns in catch");
            new Response("Nu am reusit sa cream o persoana noua din cauza ca: "  + e.getMessage());
        }


        System.out.println("Am ajusns la lina data !!");

    }
}