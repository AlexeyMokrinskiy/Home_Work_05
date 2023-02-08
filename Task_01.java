import java.util.HashMap;
import java.util.List;

public class Task_01 {
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.

    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addContact();
        findContact("Олег");
    }

    public static void addContact() {
        phoneBook.put("Олег", List.of("543543225", "245454254"));
        phoneBook.put("Алексей", List.of("2452452452", "254245454254"));
        phoneBook.put("Михаил",List.of("5432245224", "5544323345"));

    }

    public static void findContact(String name) {
        System.out.printf("%s: %s", name, phoneBook.get(name));
    }
}
