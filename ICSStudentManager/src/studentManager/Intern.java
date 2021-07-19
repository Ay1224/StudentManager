package studentManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class Intern extends Learner {
	private String allowanceType;
	private double allowance;
	Intern(String firstName, String lastName, LocalDate inscriptionDate, String tel, String mail, String company, String allowanceType, double allowance) {
		super(firstName, lastName, inscriptionDate, tel, mail, company);
		this.allowanceType = allowanceType;
		this.allowance = allowance;
	}


	



	public String getAllocationType() {
		return allowanceType;
	}


	public void setAllocationType(String allocationType) {
		this.allowanceType = allocationType;
	}


	public double getAllocation() {
		return allowance;
	}


	public void setAllocation(double allocation) {
		this.allowance = allocation;
	}

	public String toString() {
		return super.toString()+"\nIl a une allocation du type "+allowanceType+" et de montant "+allowance;
	}
}
