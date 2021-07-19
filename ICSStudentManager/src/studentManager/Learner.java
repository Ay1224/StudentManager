package studentManager;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Learner {

	protected String firstName;
	protected String lastName;
	protected LocalDate inscriptionDate;
	protected String tel;
	protected String mail;
	//cas stagiaire: company = pole emploi
	protected String company;
	protected ArrayList<LocalDate> absence;//liste des jours d'absence
	protected int delay;

	Learner(String firstName, String lastName, LocalDate inscriptionDate, String tel, String mail, String company){
		this.firstName = firstName;
		this.lastName = lastName;
		this.inscriptionDate = inscriptionDate;
		this.tel = tel;
		this.mail = mail;
		this.company = company;
		this.absence = new ArrayList<LocalDate>();
		this.delay= 0;
	}
	protected boolean checkLate() {
		if (getDelay()>30) {
			return true;
		}
		else 
			return false;
		
		
	}
	protected boolean checkAbsences(Promotion promo) {
		double toleratedAbsence = 0.1*promo.getPastDuration();
		if (absence.size() >toleratedAbsence) {
			return true;
		}
		else {
			return false;
		}
	}
//	public String toString() {
//		return"\n\nLe nom de l'apprenant est "+firstName+" "+lastName+"\nSa date d'inscription est "+inscriptionDate +"\nSon numéro de téléphone est "+tel+"\nSon adresse mail est "+mail+"\nSon entreprise est "+company+ "\nLes jours d'absence sont "+absence.size()+" "+verifAbsences()+"\nLa durée du retard est "+retard+" "+verifRetard();
//	}
//	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getInscriptionDate() {
		return inscriptionDate;
	}
	public void setInscriptionDate(LocalDate inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public ArrayList<LocalDate> getAbsence() {
		return absence;
	}
	public void setAbsence(ArrayList<LocalDate> absence) {
		this.absence = absence;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
}
