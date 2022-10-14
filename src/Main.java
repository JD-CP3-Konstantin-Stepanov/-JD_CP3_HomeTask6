import java.util.List;
import java.util.LinkedList;
import java.util.Deque;

class Main {

    public static List<Person> generateClients() {
        Person person1 = new Person("Иван", "Петров", 1);
        Person person2 = new Person("Ольга", "Иванова", 8);
        Person person3 = new Person("Алексей", "Приходько", -3);
        Person person4 = new Person("Мария", "Усова", 7);
        Person person5 = new Person("Михаил", "Дубцов", 0);
        Person person6 = new Person("Филипп", "Воронов", 20);

        List<Person> personArray = new LinkedList<>();
        personArray.add(person1);
        personArray.add(person2);
        personArray.add(person3);
        personArray.add(person4);
        personArray.add(person5);
        personArray.add(person6);
        return (personArray);
    }

    public static void main(String[] args) {

        List<Person> personArray = generateClients();
        Deque<Person> queue = new LinkedList<>();

        for (Person person : personArray) {
            queue.push(person);
        }

        while (!queue.isEmpty()) {
            Person person = queue.pollFirst();
            if (person.getTicketAmount() > 0) {
                person.decreaseTicketAmount();
                System.out.println(person.getName() +
                        " покатался на аттракционе");
                queue.offerLast(person);
            }
        }
    }
}