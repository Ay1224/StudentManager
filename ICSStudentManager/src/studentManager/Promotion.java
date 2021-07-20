package studentManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class Promotion {
	protected String name;
	protected int totalDuration; // en nombre de jour
	protected int pastDuration;
	protected LocalDate startingDate;
	protected ArrayList<Learner> listLearner; 
	public Promotion(String name, int totalDuration, int pastDuration, ArrayList<Learner>listLearner, LocalDate startingDate){
		this.name = name;
		this.totalDuration = totalDuration;
		this.startingDate = startingDate;
		this.pastDuration = pastDuration;
		this.setListLearner(listLearner);
	}
	
	//méthode vérifiant si un apprenant de la promotion a trop de retard
		public boolean checkLateLearner(Learner learner) {
			return learner.checkLate();
		}
		
		//méthode listant les apprenants de la promotion qui ont trop de retard
		public ArrayList<Learner> lateLearnerList(){
			ArrayList<Learner> lateList = new ArrayList<Learner>();
			for(Learner l : this.listLearner) {
				if (checkLateLearner(l)) {
					lateList.add(l);
				}
			}
			return lateList;
		}
		
		//méthode vérifiant si un apprenant de la promotion a trop d'absences
		public boolean checkAbsenceLearner(Learner learner) {
			return learner.checkAbsences(this);
		}
		
		//méthode listant les apprenants de la promotion qui ont trop de retard
			public ArrayList<Learner> AbsentLearnerList(){
				ArrayList<Learner> absentList = new ArrayList<Learner>();
				for(Learner l : this.listLearner) {
					if (checkAbsenceLearner(l)) {
						absentList.add(l);
					}
				}
				return absentList;
			}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return totalDuration;
	}
	public void setDuration(int duration) {
		this.totalDuration = duration;
	}
	public int getPastDuration() {
		return pastDuration;
	}
	public void setPastDuration(int pastDuration) {
		this.pastDuration = pastDuration;
	}
	public ArrayList<Learner> getListLearner() {
		return listLearner;
	}
	public void setListLearner(ArrayList<Learner> listLearner) {
		this.listLearner = listLearner;
	}
//	public String toString() {
//		return"C'est la formation "+name+"\nLa durée totale de la formation est "+totalDuration+"\nLa durée passée de la formation est "+ pastDuration+"\nLa liste des apprenants est :"+listLearner.toString();
//	}
	public String toString() {
		return"Promo "+name;
	}
}
