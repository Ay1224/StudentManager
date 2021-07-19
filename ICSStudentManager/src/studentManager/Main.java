package studentManager;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Intern intern1 = new Intern("Alex","Dupont", LocalDate.now() , "0612342536", "Alex.dupont@gmail.com", "pôle emploi","ARE" ,1200);
		Intern intern2 = new Intern("Alicia","Ledore", LocalDate.now() , "0612278936", "Alicia.ledore@gmail.com", "pôle emploi","allocation de formation" ,685);
		Intern intern3 = new Intern("Ambroise","Dupont", LocalDate.now() , "0789875254", "Ambroise.dupont@gmail.com", "pôle emploi","ARE" ,1200);
		AlternateStudent a1 = new AlternateStudent("Sonia","Chaigne", LocalDate.now() , "0685647291", "Sonia.chaigne@gmail.com", "Atos",1250);
		AlternateStudent a2 = new AlternateStudent("Emilien","Beton", LocalDate.now(), "0764568952", "Emilien.beton@gmail.com", "Amadeus",1500);
		ArrayList<Learner> l1 = new ArrayList<Learner>();
		l1.add(intern1);
		l1.add(intern2);
		l1.add(intern3);
		ArrayList<Learner> l2 = new ArrayList<Learner>();
		l2.add(a1);
		l2.add(a2);
	
		Promotion p1 = new Promotion("Developpeur Java", 80,30,l1,LocalDate.now());
		System.out.println(p1.toString());

	}

}
