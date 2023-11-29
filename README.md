# Contact Management System

Welcome to the Contact Management System repository! This project provides a simple contact management solution with basic functionalities such as adding, viewing, updating, and removing contacts.

## Contact Class

The `Contact` class represents an individual contact with attributes like name, phone number, and email.

### Attributes:

- `name`: The name of the contact.
- `phone`: The phone number of the contact.
- `email`: The email address of the contact.

### Methods:

- `getName()`: Returns the name of the contact.
- `getPhone()`: Returns the phone number of the contact.
- `getEmail()`: Returns the email address of the contact.
- `setName(String name)`: Sets the name of the contact.
- `setPhone(String phone)`: Sets the phone number of the contact.
- `setEmail(String email)`: Sets the email address of the contact.

## ContactManager Class

The `ContactManager` class manages a list of contacts and provides functionalities to manipulate the contact list.

### Methods:

- `addContact(Contact contact)`: Adds a new contact to the list.
- `viewContacts()`: Displays all contacts in the list.
- `updateContact(String name, Contact updatedContact)`: Updates an existing contact.
- `removeContact(String name)`: Removes a contact by name.

## Example Usage (Main.java)

```java
public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        // Create contacts
        Contact person1 = new Contact("Jill", "1234567", "jill@gmail.com");
        contactManager.addContact(person1);
        contactManager.addContact(new Contact("Bob", "23334445", "bob@gmail.com"));

        // View all contacts
        System.out.println("All Contacts:");
        contactManager.viewContacts();

        // Remove contact
        contactManager.removeContact("Bob");

        // View contacts after removal
        System.out.println("\nContacts after removal:");
        contactManager.viewContacts();
    }
}

How to Use
Create an instance of ContactManager.
Use addContact to add new contacts.
Use viewContacts to display all contacts.
Use updateContact to modify an existing contact.
Use removeContact to delete a contact.
Feel free to contribute, report issues, or suggest improvements. Happy contact managing!
