package cwe.tests;

import java.io.OutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import smrl.mr.crawljax.WebOperationsProvider;
import smrl.mr.language.MRBaseTest;
import smrl.mr.owasp.CWE_471_472;
import smrl.mr.owasp.CWE_610_384;
import smrl.mr.owasp.CWE_88b;


public class CWETest_small extends MRBaseTest {

	private static WebOperationsProvider provider;

	private static String system = "jenkins";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("*** Starting time: " + getCurrentTime() +" ***");

		//by default, the SUT is the Jenkins
		String configFile = "./testData/JenkinsICSE/jenkinsSysConfigDEMO.json";

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nbaya076\\geckodriver.exe");
		
		smrl.mr.crawljax.WebProcessor.DEFAULT_HEADLESS = false;
		provider = new WebOperationsProvider(configFile);
	}

	@Before
	public void setUp() throws Exception {
		setProvider(provider);
	}

	 

	@Test
	public void TEST() {  // failed
		super.test(provider,CWE_88b.class);
	}
	
	@AfterClass
	public static void printEndingTime() {
		System.out.println("*** Ending time: " + getCurrentTime() + " ***");
	}  

	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now).toString();  
	}

}
