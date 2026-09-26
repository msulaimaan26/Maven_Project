package com.example.maven_github_demo2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Grade_test {
@Test
void testTotal() {
	assertEquals(225,Grade_cal.calculateTotal(75,68,82));
}
@Test
void testAverage() {
	assertEquals(75.0,Grade_cal.calculateAverage(75,68,82));
}
@Test
void testPass() {
	assertTrue(Grade_cal.isPass(75.0));
}
@Test
void testFail() {
	assertFalse(Grade_cal.isPass(35.0));
}
	public static void main(String[] args) {
		

	}

}
