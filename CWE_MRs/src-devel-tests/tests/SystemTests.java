package tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import smrl.mr.crawljax.WebOperationsProvider;
import smrl.mr.language.MRBaseTest;
import smrl.mr.test.TEST_INVALID_COOKIE_TAG;
import smrl.mr.test.TEST_RANDOM_COOKIE_PATH;

public class SystemTests extends MRBaseTest {

	private static WebOperationsProvider provider;

	private static String system = "jenkins";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("*** Starting time: " + getCurrentTime() +" ***");

		//by default, the SUT is the Jenkins
		String configFile = "./testData/JenkinsICSE/jenkinsSysConfigDEMO.json";

		provider = new WebOperationsProvider(configFile);
	}

	@Before
	public void setUp() throws Exception {
		setProvider(provider);
	}

	@AfterClass
	public static void printEndingTime() {
		System.out.println("*** Ending time: " + getCurrentTime() + " ***");
	}   


	@Test
	public void test_() {
		super.test(provider,TEST_RANDOM_COOKIE_PATH.class);
	}

	@Test
	public void test_CWE302b() {
		super.test(provider,TEST_INVALID_COOKIE_TAG.class);
	}



	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now).toString();  
	}

}
