package cwe.tests;

import static org.junit.Assert.assertTrue;

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
import smrl.mr.owasp.CWE_138_150_OTG_AUTHZ_001b;
import smrl.mr.owasp.CWE_262_263_309_324;
import smrl.mr.owasp.CWE_276_277_OTG_AUTHZ_002d;
import smrl.mr.owasp.CWE_280_755_OTG_AUTHZ_002e;
import smrl.mr.owasp.CWE_284_OTG_AUTHN_004;
import smrl.mr.owasp.CWE_289a;
//import smrl.mr.owasp.CWE_359_313;
import smrl.mr.owasp.CWE_434;
import smrl.mr.owasp.CWE_521;
import smrl.mr.owasp.CWE_611;
import smrl.mr.owasp.CWE_643_652;
import smrl.mr.owasp.CWE_703_166_78_77_76_75_74;
import smrl.mr.owasp.CWE_757_OTG_CRYPST_004_F;
import smrl.mr.owasp.CWE_79;
import smrl.mr.owasp.CWE_79b;
import smrl.mr.owasp.CWE_88;
import smrl.mr.owasp.CWE_89_943;
import smrl.mr.owasp.CWE_90;
import smrl.mr.owasp.CWE_93a;
import smrl.mr.owasp.CWE_93b;
import smrl.mr.owasp.CWE_94_95;
import smrl.mr.owasp.CWE_94_96;
import smrl.mr.test.TEST_INPUTS;

public class CWETestWebminFabrizio extends MRBaseTest {
	
	private static WebOperationsProvider provider;
	
	private static String system = "jenkins";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("*** Starting time: " + getCurrentTime() +" ***");
		
		//by default, the SUT is the Jenkins
		String configFile = "./testData/Webmin/webminSysConfig.FABRIZIO.json";
		
		
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
	
	
//	@Test
//	public void test_ALL_Inputs() { 
//		super.test(provider,TEST_INPUTS.class);
//	}
	
	/**
	 * Detects:
	 * https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2020-8820
	 * 
	 * VM: https://dropit.uni.lu/invitations?share=397ed38758c6f295392d&dl=0
	 * 
	 */
	@Test
	public void test_CWE_79b() {  
		super.test(provider,CWE_79b.class);
	}
	
	
	
	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now).toString();  
	}

}
