package _04_hospital;

import java.util.ArrayList;

public class Doctor {

	ArrayList<Patient> patientsForDoctors = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientsForDoctors;
	}

	public void doMedicine() {
		for (int i = 0; i < patientsForDoctors.size(); i++) {
			patientsForDoctors.get(i).feelsCaredFor = true;
		}

	}

	public void assignPatient(Patient p) throws Exception {
		if (patientsForDoctors.size() < 3) {
			patientsForDoctors.add(p);
		} else {
			throw new DoctorFullException();
		}

	}
}
