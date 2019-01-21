package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {

	@Test
	void test() {
		EncapsulateTheData data = new EncapsulateTheData();
		data.setItemsReceived(5);
		assertEquals(5,data.getItemsReceived());
		data.setDegreesTurned(375);
		assertEquals(360,data.getDegreesTurned());
		data.setNomenclature("");
		assertEquals(" ",data.getNomenclature());
		data.setMemberObj("");
		//assertTrue(true,data.getMemberObj());
		
	}

}
