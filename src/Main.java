import java.util.ArrayList;
//Импортируем array в наш код
import java.util.Collections;
//Импортируем collections в наш код
public class Main {
    // Создаем класс main
    public static void main(String[] args) {
        //Создаем точку входа Java-программы, где начинается execution
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Nursultan", "Khaimuldin", "Professor", 400000.78));
        people.add(new Employee("kassym-Jomart", "Tokaev", "President", 690000.00));
        people.add(new Student("Tyryon", "Lannister", 4.00));
        people.add(new Student("Margulan", "Suyundykov", 2.30));
        //Добавляем v array  значения которые считываются с класса PERSON

        Collections.sort(people);
        //Выводит в правильном порядке
        printData(people);
        }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
            //выводит сам код

    }
}
}
