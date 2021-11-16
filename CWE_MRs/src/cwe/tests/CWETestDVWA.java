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
import smrl.mr.owasp.CWE_601_OTG_AUTHZ_002a;
import smrl.mr.owasp.CWE_703_166_78_77_76_75_74;
import smrl.mr.owasp.CWE_79;
import smrl.mr.owasp.CWE_792_793_794_795_796_797;

import smrl.mr.owasp.CWE_79b_XSSreflected;
import smrl.mr.owasp.CWE_79b_storedXSS;
import smrl.mr.owasp.CWE_88a;
import smrl.mr.owasp.CWE_88b;
import smrl.mr.owasp.CWE_88test;
import smrl.mr.owasp.CWE_89_943;
import smrl.mr.owasp.CWE_89_943b;
import smrl.mr.test.TEST_INPUTS;

public class CWETestDVWA extends MRBaseTest {

	private static WebOperationsProvider provider;

	private static String system = "jenkins";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("*** Starting time: " + getCurrentTime() +" ***");

		//by default, the SUT is the Jenkins
		String configFile = "./testData/DVWA/DVWASysConfigDEMO.json";
		
		//String configFile = "./testData/DVWA/DVWASysConfigDEMO_SQL.json";
		//String configFile = "./testData/JenkinsICSE/jenkinsSysConfigDEMO.json";


		smrl.mr.crawljax.WebProcessor.DEFAULT_HEADLESS = false;
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

	//Tests
	/*@Test
	public void test_SQLinjection() {
		super.test(provider, CWE_89_943.class);
	}
	
	@Test
	public void test_SpecialCharacters() {
		super.test(provider, CWE_703_166_78_77_76_75_74.class);
	}
	
	@Test
	public void test_SpecialCharactersMulti() {
		super.test(provider, CWE_792_793_794_795_796_797.class);
	}
	
	@Test
	public void test_XSSinjection() { //fail
		super.test(provider, CWE_79.class);
	}

	
	@Test
	public void test_CommandInjection() {
		super.test(provider, CWE_88.class);
	}
	
	@Test
	public void test_SpecialCharacters() {
		super.test(provider, CWE_703_166_78_77_76_75_74.class);
	}
	
	
	
	@Test
	public void test_XSSinjectionreflected() { //fail
		super.test(provider, CWE_79b_storedXSS.class);
	}
	@Test
	public void test() { //fail
		super.test(provider, TEST_INPUTS.class);
	}
	

	@Test
	public void test1() { //fail
		super.test(provider, CWE_88test.class);
	}


	@Test
	public void test() { //fail
		super.test(provider, TEST_INPUTS.class);
	}

	@Test
	public void test() { //fail
		super.test(provider, TEST_INPUTS.class);
	}	*/
	
	@Test
	public void test() { //fail
		super.test(provider, TEST_INPUTS.class);
	}
	
	
 
	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now).toString();  
	}

}
