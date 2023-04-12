package BSC.CAC410.Contact;

import java.util.Scanner; 
import java.util.ArrayList;

public class ContactTester {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Contact newContact = new Contact("Sally","123 Sesame St","555-123-4567","sal@gmail.com");
			System.out.println(newContact.toString());
			System.out.print("Enter a new number: ");
			String number = input.nextLine();
			newContact.setPhone(number);
			System.out.println(newContact.toString());
			ArrayList<Contact> myContacts = new ArrayList<Contact>();
			myContacts.add(newContact);
			myContacts.add(new Contact("Jack","567 Elmier St","555-123-7812","jack@yahoo.com"));
			
			//Ask user for name and print out contact info
			System.out.print("Enter a name: ");
			String searchName = input.nextLine();
			boolean found = false;
			for(Contact contact : myContacts) {
				if(contact.getName().equals(searchName)) {
					System.out.println(contact.toString());
					found = true;
				}
			}
			if(!found)
				System.out.println("Not found");
		}

	}
}
