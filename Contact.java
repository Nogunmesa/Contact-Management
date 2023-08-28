public class Contact{
    // This class creates the contact in the phone
    private String name;
    private String phone;
    private String email;

    /*
     * Returns the name saved in the contact as a string
     */
    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

   /*
    * Returns the name saved in the contact as a string
    */
    public String getName(){
        return this.name;
    }

    /*
     * Returns the phone-number saved in the contact as a string
     */
    public String getPhone(){
        return this.phone;
    }

    /*
     * Returns the email saved in the contact as a string
     */
    public String email(){
        return this.email;
    }
}