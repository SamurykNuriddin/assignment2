import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Employee("Samuryk", "Nuriddin", "App dev", 500000.78));
        people.add(new Employee("Arman", "Armanovich", "Content Crator", 50000.00));
        people.add(new Student("Marat", "Maratovich", 2.0));
        people.add(new Student("Ali", "Aliovich", 3.5));


        Collections.sort(people);


        printData(people);
    }

    public static void printData(Iterable<Person> payables) {
        for (Person p : payables) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}
