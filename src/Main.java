import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Nursultan", "Khaimuldin", "Professor", 400000.78));
        people.add(new Employee("kassym-Jomart", "Tokaev", "President", 690000.00));
        people.add(new Student("Tyryon", "Lannister", 4.00));
        people.add(new Student("Margulan", "Suyundykov", 2.30));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}