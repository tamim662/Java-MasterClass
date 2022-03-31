import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >=0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact.getName());
        if(findContact(oldContact.getName()) < 0){
            return false;
        }else if(findContact(newContact.getName()) != -1){
            return false;
        }
        this.myContacts.set(position,newContact);
        return true;
    }
    public boolean removeContact(Contact contact) {
        if(myContacts.indexOf(contact) >= 0) {
            int i = myContacts.indexOf(contact);
            myContacts.remove(i);
            return true;
        }
        return false;
    }
    private int findContact(Contact contact) {

        return myContacts.indexOf(contact);

    }
    private int findContact(String name) {
        for(int i=0;i<myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name) {
        for(int i=0;i<myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
    public void printContacts() {
        System.out.println("Contact List:");
        for(int i =0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);

            System.out.println((i+1) + ". " +contact.getName() + " -> " + contact.getPhoneNumber());

        }
    }
}
