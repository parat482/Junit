package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
	//	System.out.println("BeforeClass method will be executed before first test method starts");
	}

	@AfterClass
	public static void AfterClass() throws Exception {
	//	System.out.println("AfterClass method will be executed after last test method completed");
	}

	@Before
	public void before() throws Exception {
	//	System.out.println("Before method will execute before every test method");
	}

	@After
	public void after() throws Exception {
	//	System.out.println("After method will execute after every test method");
	}

	@Test
	public void test_01_assertEqualsPositive() {
		assertEquals("String not the same", "Testing JUnit 4", App.s);
	//	System.out.println("Test_01_assertEqualsPositive");;
	}
	
	@Test
	public void test_02_assertEquals_Negative() {
		assertEquals("String not the same", "Testing TestNG 6", App.s);
	//	System.out.println("Test_02_assertEquals_negative");
	}
	
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		assertEquals("String not the same", "Testing JUnit 3", App.s);
	//	System.out.println("Tets_03_assertEquals_Ignored");
	}
	
	@Test
	public void test_04_AssertSame_Positive() {
		assertSame("Integer not the same", 55, App.i);
	//	System.out.println("Test_04_AssertSame_positive");
	}
	
	@Test
	public void test_05_AssetrSame_Negative(){
		assertSame("Integer not the same", 54, App.i);
	//	System.out.println("Test_05_AssertSame_Negative");
	}
	
	@Ignore
	@Test
	public void test_06_AssertSame_Ignored(){
		assertSame("Integer not the same", 56, App.i);
	//	System.out.println("Test_06_AssertSame_Ignored");
	}
	
	@Test
	public void test_07_AssetrFalse_Positive(){
		assertFalse("Boolean should be false", App.f);
	//	System.out.println("Test_07_AssertFalse_Positive");
	}
	
	@Test
	public void test_08_AssetrFalse_Negative(){
		assertFalse("Boolean should be false", App.t);
	//	System.out.println("Test_08_AssertFalse_Negative");
	}
	
	@Test
	public void test_09_AssetrTrue_Positive(){
		assertTrue("Boolean should be true", App.t);
	//	System.out.println("Test_09_AssertTrue_Positive");
	}
	
	@Test
	public void test_10_AssetrTrue_Negative(){
		assertTrue("Boolean should be true", App.f);
	//	System.out.println("Test_10_AssertTrue_Negative");
	}

}
