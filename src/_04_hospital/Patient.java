package _04_hospital;

public class Patient {

	boolean feelsCaredFor = false;
	
	public boolean feelsCaredFor() {
		if(feelsCaredFor==true) {
			return true;
		} else {
			return false;
		}
	}

	public void checkPulse() {
		feelsCaredFor = true;
	}

}
