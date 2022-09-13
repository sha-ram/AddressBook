import java.util.ArrayList;

public class ContactList {
    
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

  
    public void addContact(Contact c) {
        contacts.add(c);
    }

    public Contact findByFirstName(String name) {
        for (Contact c : this.contacts) {
            if (c.getFirstName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public Contact findByEmail(String email) {
        for (Contact c : this.contacts) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    public Contact findByNumber(String number) {
        for (Contact c : this.contacts) {
            if (c.getPhone().equals(number)) {
                return c;
            }
        }
        return null;
    }

    public String toString() {
        String s = "";
       
        for (Contact c : this.contacts) {
            s += "\n  " + c;
        }
        return s;
    }
}