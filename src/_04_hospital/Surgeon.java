package _04_hospital;

public class Surgeon extends Doctor {

	public boolean makesHouseCalls() {
		return false;
	}
	
	public boolean performsSurgery() {
		return true;
	}
}
