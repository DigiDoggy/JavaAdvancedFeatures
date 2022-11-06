package advance.tasks.phone;

public class Contact {

    //Fields
    private final String name;
    private final String phoneNumber;

    //Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //methods
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }




}
