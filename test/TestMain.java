package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMain {

	@Test
	public void testAddition() {
		int a = 2, b = 3, resultat = a +b;
		
		Assert.assertEquals(5, resultat);
		
	}
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestMain.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Tests réussis : " + result.wasSuccessful());
	}
	
}
