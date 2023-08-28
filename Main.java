public class Main {
    public static void main(String[] args){
        ContactManager contactManager = new ContactManager();

        // Create contacts
        Contact person1 = new Contact("Jill", "1234567", "jill@gmail.com");
        contactManager.addContact(person1);
        contactManager.addContact(new Contact("Bob", "23334445", "bob.gmail.com"));

        contactManager.viewContact();
        contactManager.removeContact("Bob");
        contactManager.viewContact();

    }
}
