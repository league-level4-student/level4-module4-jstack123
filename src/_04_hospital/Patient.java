package _04_hospital;

public class Patient {

	boolean feelsCaredFor = false;

	public void checkPulse() {
		feelsCaredFor = true;
	}

	public void doMedicine() {
		feelsCaredFor = true;
	}

	public boolean feelsCaredFor() {
		if (feelsCaredFor == true) {
			return true;
		} else {
			return false;
		}
	}
}
