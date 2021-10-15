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
import smrl.mr.owasp.CWE_138_150_OTG_AUTHZ_001b;
import smrl.mr.owasp.CWE_258;
import smrl.mr.owasp.CWE_262_263_309_324;
import smrl.mr.owasp.CWE_276_277_OTG_AUTHZ_002d;
import smrl.mr.owasp.CWE_280_755_OTG_AUTHZ_002e;
import smrl.mr.owasp.CWE_284_OTG_AUTHN_004;
import smrl.mr.owasp.CWE_286_OTG_AUTHZ_002c;
import smrl.mr.owasp.CWE_288_287b_319_OTG_AUTHN_010;
import smrl.mr.owasp.CWE_289a;
import smrl.mr.owasp.CWE_289b_647;
import smrl.mr.owasp.CWE_302;
import smrl.mr.owasp.CWE_314;
import smrl.mr.owasp.CWE_352_Fabrizio;
import smrl.mr.owasp.CWE_434;
import smrl.mr.owasp.CWE_521;
import smrl.mr.owasp.CWE_610_384;
import smrl.mr.owasp.CWE_611;
import smrl.mr.owasp.CWE_643_652;
import smrl.mr.owasp.CWE_703_166_78_77_76_75_74;
import smrl.mr.owasp.CWE_757_OTG_CRYPST_004;
import smrl.mr.owasp.CWE_79;
import smrl.mr.owasp.CWE_88;
import smrl.mr.owasp.CWE_89_943;
import smrl.mr.owasp.CWE_90;
import smrl.mr.owasp.CWE_923_297;
import smrl.mr.owasp.CWE_93a;
import smrl.mr.owasp.CWE_93b;
import smrl.mr.owasp.CWE_94_95;
import smrl.mr.owasp.CWE_94_96;

public class CWETest extends MRBaseTest {
	
	private static WebOperationsProvider provider;
	
	private static String system = "jenkins";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("*** Starting time: " + getCurrentTime() +" ***");
		
		//by default, the SUT is the Jenkins
		String configFile = "./testData/JenkinsICSE/jenkinsSysConfigDEMO.json";
		
		
		smrl.mr.crawljax.WebProcessor.DEFAULT_HEADLESS = true;
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
	
	/*
	@Test
	public void test_CWE_266_267_268_420_425_OTG_AUTHZ_002() {  // failure saw
		super.test(provider,CWE_266_267_268_420_425_OTG_AUTHZ_002.class);
	}
	

	@Test
	public void test_CWE_138_150_OTG_AUTHZ_001b() {  // passed
		super.test(provider,CWE_138_150_OTG_AUTHZ_001b.class);
	}
	/*

	@Test
	public void test_CWE_15_341_639_OTG_AUTHZ_004() {   //passed
		super.test(provider,CWE_15_341_639_OTG_AUTHZ_004.class);
	}/*	
	

	@Test
	public void test_CWE_219_220_530_OTG_AUTHZ_001() {  // failure saw
		super.test(provider,CWE_219_220_530_OTG_AUTHZ_001.class);
	}
	
	@Test
	public void test_CWE_276_277_OTG_AUTHZ_002d() {   // passed
		super.test(provider,CWE_276_277_OTG_AUTHZ_002d.class);
	}
		
	@Test
	public void test_CWE_280_755_OTG_AUTHZ_002e() { // failure saw
		super.test(provider,CWE_280_755_OTG_AUTHZ_002e.class);
	}
	
	@Test
	public void test_CWE_284_OTG_AUTHN_004 () { // passed tested with 4 test cases
		super.test(provider,CWE_284_OTG_AUTHN_004.class);
	}
	

	@Test
	public void test_CWE_262_263() {// passed
		super.test(provider,CWE_262_263.class);
	}
	
	
	@Test
	public void test_CWE_262_263() {// passed
		super.test(provider,CWE_262_263_309_324.class);
	}
	
	@Test
	public void test_CWE_94_95() { //passed
		super.test(provider,CWE_94_95.class);
	}
		
	
	@Test
	public void test_CWE_93a() { //failed
		super.test(provider,CWE_93a.class);
	}
	
	@Test
	public void test_CWE_93b() { //failed
		super.test(provider,CWE_93b.class);
	}

	@Test
	public void test_CWE_94_96() { //failed
		super.test(provider,CWE_94_96.class);
	}	
	@Test
	public void test_CWE_521() { //failed
		super.test(provider,CWE_521.class);
	}
	
	@Test
	public void test_CWE_703_166_78_77_76_75_74() { //passed
		super.test(provider,CWE_703_166_78_77_76_75_74.class);
	}
	
	@Test
	public void test_CWE_79() { //failed
		super.test(provider,CWE_79.class);
	}
	@Test
	public void test_CWE_90() { //failed
		super.test(provider,CWE_90.class);
	}
	
	@Test
	public void test_CWE_643_652() { //failed
		super.test(provider,CWE_643_652.class);
	}
	
	@Test
	public void test_CWE_88() { //passed
		super.test(provider,CWE_88.class);
	}
	
	@Test
	public void test_CWE_434() { //passed             ///20
		super.test(provider,CWE_434.class);
	}
	
	@Test
	public void test_CWE_611() { //passed
		super.test(provider,CWE_611.class);
	}
	
	@Test
	public void test_CWE_289a() { //passed
		super.test(provider,CWE_289a.class);
	}
	/*
	@Test
	public void test_CWE_757() {  // not working
		super.test(provider,CWE_757_OTG_CRYPST_004.class);
	}
 	
	@Test
	public void test_CWE_352() {  //passed
		super.test(provider,CWE_352_Fabrizio.class);
	}
	
	//// Thursday OCT 14
	
	@Test
	public void test_CWE_610_384() {               //******** error
		super.test(provider,CWE_610_384.class);
	}
	
	@Test
	public void test_CWE_89_943() {  // passed
		super.test(provider,CWE_89_943.class);
	}
	
	@Test
	public void test_CWE_923_297() {  // passed
		super.test(provider,CWE_923_297.class);
	}
	
	@Test
	public void test_CWE_258() {  // passed
		super.test(provider,CWE_258.class);
	}
	
	@Test
	public void test_CWE_286() {  //passed
		super.test(provider,CWE_286_OTG_AUTHZ_002c.class);
	}
	
	@Test
	public void test_CWE_287a() {  //passed
		super.test(provider,CWE_287a_OTG_AUTHN_001.class);
	}
	
	
	@Test
	public void test_CWE_288_287b_319() {  //passed
		super.test(provider,CWE_288_287b_319_OTG_AUTHN_010.class);
	}
	
	@Test
	public void test_CWE_289b() {  //failed                                //32
		super.test(provider,CWE_289b_647.class);
	}
	
	
	
*/
	
	@Test
	public void test_CWE_302() {  //passed
		super.test(provider,CWE_302.class);
	}
	
	
	
	
	
	
	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now).toString();  
	}

}
