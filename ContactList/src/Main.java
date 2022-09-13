
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList directory = new ContactList();
		directory.addContact(new Contact("Tessa", "Mont","JVille","tessamont@google.com", "09877654"));
		//directory.addContact(new Contact());
		directory.addContact(new Contact("Rockie", "Valley","Avalon","rocky123@google.com", "09877567"));
		
		   System.out.println(directory);
	        System.out.println();

	        System.out.println(directory.findByFirstName("Tessa"));
	        System.out.println(directory.findByEmail("jord@penguin.com"));
	        System.out.println(directory.findByNumber("5495135845"));
	}

}
