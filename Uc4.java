import java.util.Scanner;

public class Uc4 {

    // get user name and remove contact of that user

    public static void removeContacts(){
        Scanner sc4 = new Scanner(System.in);

        System.out.println("Enter name of which person contact you delete");
        String delete = sc4.next();

        ContactsMain.arr.removeIf(i -> delete.equals(i.getFirstName()));
    }
}