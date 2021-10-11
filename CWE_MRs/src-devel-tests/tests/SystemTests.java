package tests;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import smrl.mr.crawljax.WebOperationsProvider;
import smrl.mr.language.MRBaseTest;
import smrl.mr.owasp.TEST_NOT_TRIED;
import smrl.mr.test.TEST_LOG_NEW_LINES;
import smrl.mr.test.TEST_RANDOM_COOKIE_PATH;
import smrl.mr.test.TEST_RESERVED_KEYWORDS;
import smrl.mr.test.TEST_WAIT;

public class SystemTests extends MRBaseTest {

	private static WebOperationsProvider provider;

	private static String system = "jenkins";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("*** Starting time: " + getCurrentTime() +" ***");

		//by default, the SUT is the Jenkins
//		String configFile = "./testData/JenkinsICSE/jenkinsSysConfigDEMO.json";
		String configFile = "./testData/JenkinsICSE/jenkinsSysConfigDEMO.FABRIZIO.json";

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
	public void test_RANDOM_COOKIE_PATH() {
		super.test(provider,TEST_RANDOM_COOKIE_PATH.class);
	}
	
	@Test
	public void test_WAIT() {
		super.test(provider,TEST_WAIT.class);
	}
	
	@Test
	public void test_LOG_NEW_LINES() {
		super.test(provider,TEST_LOG_NEW_LINES.class);
		
	}
	
	@Test
	public void test_RESERVED_KEYWORDS() {
		super.test(provider,TEST_RESERVED_KEYWORDS.class);
	}

	/*@Test
	public void test_CWE302b() {
		super.test(provider,TEST_INVALID_COOKIE_TAG.class);
	}
	
	

*/
	@Test
	public void test_CWE_96() {
		super.test(provider,TEST_NOT_TRIED.class);
	}
	
	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now).toString();  
	}

}
