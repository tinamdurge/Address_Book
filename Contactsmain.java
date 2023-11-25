import java.util.*;

public class ContactsMain {
    static ArrayList<Contacts> arr = new ArrayList<>();
    static Dictionary<String,String> HasMap = new HashMap<>();

    static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ADDRESS BOOK =====");
        System.out.println("1 . Add a New Contact");
        System.out.println("2 . Edit a exist Contact");
        System.out.println("3 . Delete a Contact");
        System.out.println("4 . View Contact list");
        System.out.println("5 . Show All Address Book  ");
        System.out.println("6 . Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                Uc2.addContacts();
                mainMenu();
            }
            case 2 -> {
                Uc3.editContacts();
                mainMenu();
            }
            case 3 -> {
                Uc4.removeContacts();
                mainMenu();
            }
            case 4 -> {
                for (Contacts i : arr) {
                    System.out.println(i);
                }
                mainMenu();
            }
            case 5 -> {
                Uc6.AllAddressBook();
                mainMenu();
            }
            case 6 -> System.out.println("Thank you");
            default -> System.out.println("Some thing Wrong");
        }
    }



    public static void main(String[] args) {

        mainMenu();


    }
}