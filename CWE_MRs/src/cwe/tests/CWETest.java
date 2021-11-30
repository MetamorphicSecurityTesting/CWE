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
import smrl.mr.owasp.CWE_15_639_OTG_AUTHZ_004;
import smrl.mr.owasp.CWE_22;
import smrl.mr.owasp.CWE_258;
import smrl.mr.owasp.CWE_262_263_309_324;
import smrl.mr.owasp.CWE_266_267_268_OTG_AUTHZ_002;
import smrl.mr.owasp.CWE_276_277_OTG_AUTHZ_002d;
import smrl.mr.owasp.CWE_280_755_OTG_AUTHZ_002e;
import smrl.mr.owasp.CWE_284_OTG_AUTHN_004;
import smrl.mr.owasp.CWE_286_OTG_AUTHZ_002c;
import smrl.mr.owasp.CWE_287a_425_OTG_AUTHN_001;
import smrl.mr.owasp.CWE_288_287b_319_OTG_AUTHN_010;
import smrl.mr.owasp.CWE_289a;
import smrl.mr.owasp.CWE_289b2;
import smrl.mr.owasp.CWE_289b_647;
import smrl.mr.owasp.CWE_289c;
import smrl.mr.owasp.CWE_290_291;
import smrl.mr.owasp.CWE_290_350;
import smrl.mr.owasp.CWE_302;
import smrl.mr.owasp.CWE_306_OTG_AUTHZ_002b;
import smrl.mr.owasp.CWE_314;
import smrl.mr.owasp.CWE_315b;
import smrl.mr.owasp.CWE_352;
import smrl.mr.owasp.CWE_352_Jenkins;
import smrl.mr.owasp.CWE_359_313_532_538;
import smrl.mr.owasp.CWE_420_OTG_CONFIG_007;
import smrl.mr.owasp.CWE_434;
import smrl.mr.owasp.CWE_441;
import smrl.mr.owasp.CWE_471_472;
import smrl.mr.owasp.CWE_488;
import smrl.mr.owasp.CWE_521;
import smrl.mr.owasp.CWE_599;
import smrl.mr.owasp.CWE_601_OTG_AUTHZ_002a;
import smrl.mr.owasp.CWE_610_384;
import smrl.mr.owasp.CWE_611;
import smrl.mr.owasp.CWE_613_OTG_SESS_006;
import smrl.mr.owasp.CWE_643_652;
import smrl.mr.owasp.CWE_703_166_78_77_76_75_74;
import smrl.mr.owasp.CWE_703_Jenkins;
import smrl.mr.owasp.CWE_73_99_219_220_530_OTG_AUTHZ_001a;
import smrl.mr.owasp.CWE_757_OTG_CRYPST_004_F;
import smrl.mr.owasp.CWE_784;
import smrl.mr.owasp.CWE_79;
import smrl.mr.owasp.CWE_792_793_794_795_796_797;
import smrl.mr.owasp.CWE_79_Jenkins;
import smrl.mr.owasp.CWE_79_Jenkins944;
import smrl.mr.owasp.CWE_79b_XSSreflected;
import smrl.mr.owasp.CWE_79b_storedXSS;
import smrl.mr.owasp.CWE_841;
import smrl.mr.owasp.CWE_88a;
import smrl.mr.owasp.CWE_88b;
import smrl.mr.owasp.CWE_88test;
import smrl.mr.owasp.CWE_89_943;
import smrl.mr.owasp.CWE_89_943b;
import smrl.mr.owasp.CWE_90;
import smrl.mr.owasp.CWE_923;
import smrl.mr.owasp.CWE_923_297;
import smrl.mr.owasp.CWE_93a;
import smrl.mr.owasp.CWE_93b;
import smrl.mr.owasp.CWE_94_95;
import smrl.mr.owasp.CWE_94_96;
import smrl.mr.test.TEST_INPUTS;

public class CWETest extends MRBaseTest {

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

	@AfterClass
	public static void printEndingTime() {
		System.out.println("*** Ending time: " + getCurrentTime() + " ***");
	}   
	
	
	////currently is testing
	
	 @Test
		public void test_CWE_703_166_78_77_76_75_74() { //passed
			super.test(provider,CWE_703_166_78_77_76_75_74.class);
		}
	 
	 /*
	@Test
	public void test_CWE_79() { //failed
		super.test(provider,CWE_79.class);
	}
@Test
	public void test_CWE_703_Jenkins() {  // 
		super.test(provider,CWE_703_Jenkins.class);
	}
		
	


@Test
	public void test1_CWE_599() {      
		super.test(provider,CWE_599.class);
	}
	
	


	@Test
	public void test_CWE_94_96() { //passed
		super.test(provider,CWE_94_96.class);
	}	
	@Test
	public void test_CWE_521() { //failed
		super.test(provider,CWE_521.class);
	}

	
	
	@Test
	public void test_CWE_90() { 
		super.test(provider,CWE_90.class);
	}

	
	@Test
	public void test_CWE_88a() { //passed
		super.test(provider,CWE_88a.class);
	}
	
	@Test
	public void test_CWE_88b() { //passed
		super.test(provider,CWE_88b.class);
	}
	
	
	
	@Test
	public void test_CWE_314() { //passed
		super.test(provider,CWE_314.class);
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
	
	@Test
	public void test_CWE_289c() { //passed
		super.test(provider,CWE_289c.class);
	}





	

	@Test
	public void test_CWE_89_943b() {  // passed
		super.test(provider,CWE_89_943b.class);
	}

	
	@Test
	public void test_CWE_923() {  // passed
		super.test(provider,CWE_923.class);
	}

	

	


	@Test
	public void test_CWE_79_a() {  //passed
		super.test(provider,CWE_79.class);
	}
	@Test
	public void test_CWE_79_b() {  //passed
		super.test(provider,CWE_79b_XSSreflected.class);
	}
	@Test
	public void test_CWE_79_c() {  //passed
		super.test(provider,CWE_79b_storedXSS.class);
	}
	/// 79 jenkins are not tested.
	
	
	
	
	@Test
	public void test_CWE_302() {  //passed
		super.test(provider,CWE_302.class);
	}


	@Test
	public void test_CWE_703() {  //passed
		super.test(provider,CWE_703_166_78_77_76_75_74.class);
	}

	

	@Test
	public void test_CWE_784() {  // passed
		super.test(provider,CWE_784.class);
	}


	@Test
	public void test_CWE_792() {  //passed
		super.test(provider,CWE_792_793_794_795_796_797.class);
	}


	@Test
	public void test_CWE_841() {  //passed
		super.test(provider,CWE_841.class);
	}
	
	
		
	@Test
	public void test_CWE_289b2() {  // passed
		super.test(provider,CWE_289b2.class);
	}


	
	

	@Test
	public void test_CWE_290_350() {  //failed
		super.test(provider,CWE_290_350.class);
	}

	
	@Test
	public void test_CWE_315() {  //passed
		super.test(provider,CWE_315b.class);
	}
	

	
	
	@Test
	public void test_CWE_471_472() {  // passed         
		super.test(provider,CWE_471_472.class);
	}
	
	
	
		
	
	@Test
	public void test_CWE_352_Jenkins() {  // failed
		super.test(provider,CWE_352_Jenkins.class);
	}
	

	

	@Test
	public void test_CWE_79_Jenkins() {  // failed
	   super.test(provider,CWE_79_Jenkins.class);
	}
	
	@Test
	public void test_CWE_79_Jenkins944() {  // failed
		super.test(provider,CWE_79_Jenkins944.class);
	}

	@Test
	public void test_CWE_22() {
		super.test(provider,CWE_22.class);
	}
	 @Test
	public void test_CWE_88test() { //passed
		super.test(provider,CWE_88test.class);
	}
	 @Test
	public void test_CWE_703_166_78_77_76_75_74() { //passed
		super.test(provider,CWE_703_166_78_77_76_75_74.class);
	}

	 
	@Test
	public void test_CWE_289b() {  //failed                                //32
		super.test(provider,CWE_289b_647.class);
	}
	 @Test
	public void test_CWE_262_263_309_324() {// passed
		super.test(provider,CWE_262_263_309_324.class);
	}
	@Test
	public void test_CWE_488() {  //failed
		super.test(provider,CWE_488.class);
	}
	
@Test
	public void test_CWE_643_652() { //failed
		super.test(provider,CWE_643_652.class);
	}
	@Test
	public void test_CWE_352() {  //passed
		super.test(provider,CWE_352.class);
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
	public void test_CWE_258() {  // passed
		super.test(provider,CWE_258.class);
	}
	
	@Test
	public void test_CWE_290_291() {  //failed
		super.test(provider,CWE_290_291.class);
	}
	
	@Test
	public void test_CWE_610_384() {    // failed //red messages in console   
		super.test(provider,CWE_610_384.class);
	}

	
	@Test
	public void test_CWE_359() {  //passed
		super.test(provider,CWE_359_313_532_538.class);
	}
	
	/*

	@Test
	public void TEST() {  // failed
		super.test(provider,TEST_INPUTS.class);
	}
 */
	
	
	
	/* FAILURE!!!!!!!!!!!!
	 * 
	 * 
	 * @Test
	public void test_CWE_89_943() {  // FAILUR!!!!!!!!!!!!!!!!!!!!!!!!!!
		super.test(provider,CWE_89_943.class);
	}
	 * 
	 * 
	 * 
	 */
	
	
	
	
	/* 
	 * ******** The last to be tested
	 * 
	 * 
	 * 
	 @Test
	public void test_CWE_88test() { //passed
		super.test(provider,CWE_88test.class);
	}
	 @Test
	public void test_CWE_703_166_78_77_76_75_74() { //passed
		super.test(provider,CWE_703_166_78_77_76_75_74.class);
	}

	 
	@Test
	public void test_CWE_289b() {  //failed                                //32
		super.test(provider,CWE_289b_647.class);
	}
	 @Test
	public void test_CWE_262_263_309_324() {// passed
		super.test(provider,CWE_262_263_309_324.class);
	}
	@Test
	public void test_CWE_488() {  //failed
		super.test(provider,CWE_488.class);
	}
	
@Test
	public void test_CWE_643_652() { //failed
		super.test(provider,CWE_643_652.class);
	}
	@Test
	public void test_CWE_352() {  //passed
		super.test(provider,CWE_352.class);
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
	public void test_CWE_258() {  // passed
		super.test(provider,CWE_258.class);
	}
	
	@Test
	public void test_CWE_290_291() {  //failed
		super.test(provider,CWE_290_291.class);
	}
	
	@Test
	public void test_CWE_610_384() {    // failed //red messages in console   
		super.test(provider,CWE_610_384.class);
	}

	
	@Test
	public void test_CWE_359() {  //passed
		super.test(provider,CWE_359_313_532_538.class);
	}
	
	
	 * 
	 * */
	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now).toString();  
	}

}
