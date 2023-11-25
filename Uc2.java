import java.util.Scanner;

public class Uc2 {

    // Use addContacts method and get input from user

    public static void addContacts() {
        Scanner sc = new Scanner(System.in);
        Contacts contacts = new Contacts();

        System.out.println("Enter fist name");
        String firstName = sc.next();
        contacts.setFirstName(firstName);

        System.out.println("Enter fist name");
        String lastName = sc.next();
        contacts.setLastName(lastName);

        System.out.println("Enter Address");
        String address = sc.next();
        contacts.setAddress(address);

        System.out.println("Enter city");
        String city = sc.next();
        contacts.setCity(city);

        System.out.println("Enter state");
        String state = sc.next();
        contacts.setState(state);

        System.out.println("Enter zip number");
        int zip = sc.nextInt();
        contacts.setZip(zip);

        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email");
        String email = sc.next();
        contacts.setEmail(email);


        ContactsMain.HasMap.put(firstName,lastName); // Create address Book for each contact
        ContactsMain.arr.add(contacts); // adding contacts to the AddressBook
    }
}