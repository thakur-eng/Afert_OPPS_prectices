package com.opps.encapsulation;

public class MainMedicineCapsule {

	public static void main(String[] args) {

		MedicineCapsule capsule = new MedicineCapsule();

		capsule.takeMedicine();

	}
}

class MedicineCapsule {

	private String chemicalA;
	private String chemicalB;

	public MedicineCapsule() {

		this.chemicalA = "Paracetamol";
		this.chemicalB = "Caffeine";

	}

	public void takeMedicine() {
		System.out.println("You took capsule containg :" + chemicalA + " and " + chemicalB);
		System.out.println("Effect: Fever reduced and alertness increased.");
	}

}
