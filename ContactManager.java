import java.util.ArrayList;
import java.util.Iterator;

public class ContactManager{
    private ArrayList<Contact> contacts = new ArrayList<>();

    /*
     * Initialize contact list
     */
    public ContactManager(){

    }

    /*
     * Add new contact to contact list
     * @param contact
     */
    public void addContact(Contact contact){
        contacts.add(contact);
    }

    /*
     * View all the contacts in contact list
     */
    public void viewContact(){
        for(Contact element: contacts){
            System.out.println("Name: " + element.getName() + ", Phone number: " + element.getPhone() + ", Email: " + element.getEmail());
        }
    }

    /*
     * Update existing contact
     * @param name, update
     */
    public void updateContact(String name, Contact updatedContact){
        for(Contact element: contacts){
            if(element.getName().equals(name)){
                element.setName(updatedContact.getName());
                element.setPhone(updatedContact.getPhone());
                element.setEmail(updatedContact.getEmail());
            }
        }
    }

    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                iterator.remove();
                System.out.println("Contact removed successfully.");
                return;
            }
        }
        
        System.out.println("Contact not found.");
    }
}