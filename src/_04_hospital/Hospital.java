package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(GeneralPractitioner gp) {
		doctors.add(gp);
	}
	public void addDoctor(Surgeon s) {
		doctors.add(s);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void addPatient(Patient p) {	
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void assignPatientsToDoctors() throws Exception {
		for (int i = 0; i < 3; i++) {
			doctors.get(0).assignPatient(patients.get(i));
		}
		for (int i = 3; i < 6; i++) {
			doctors.get(1).assignPatient(patients.get(i));
		}
		for (int i = 6; i < 8; i++) {
			doctors.get(2).assignPatient(patients.get(i));
		}
		
	}
	
}
