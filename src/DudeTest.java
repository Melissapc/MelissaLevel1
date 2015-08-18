import static org.junit.Assert.*;

import org.junit.Test;
 class Dude {

	private String name;
		private int age;
		
		
Dude(String firstname,String lastname,  int age){
	this.name=firstname+" "+lastname;
	this.age=age;
}
String getName(){
	return name;
	
}
int  getAge(){
	return age;
	
}
}

/**
 * To make these tests pass, you will need to create a Dude class with member
 * variables: 
 * 			private String name;
 * 			private int age;
 * 
 * You may use Eclipse quick-fixes to help you auto-generate the class.
 * **/

public class DudeTest {

	@Test
	public void testBasicConstruction() {
		Dude vic = new Dude("Vic", "Wintriss", 83);
		assertEquals("Vic Wintriss", vic.getName());
		assertEquals(83, vic.getAge());
	}

	@Test
	public void testSuperman() {
		Dude superman = new Dude("Clark", "Kent", 33);
		assertEquals("Clark Kent", superman.getName());
		assertEquals(33, superman.getAge());
	}

}




