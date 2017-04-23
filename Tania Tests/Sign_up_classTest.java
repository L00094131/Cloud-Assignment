package cloud1;
import static org.junit.Assert.*;
import org.junit.Test;

   public class Sign_up_classTest {
	   
   private Sign_up_class testDummy = new Sign_up_class("", "", "", "", "", "");
   
   @Test
   public void testFname() {
	  testDummy.setFirstName("Peter");
      assertEquals("Peter", testDummy.getFname());
   }
   
   @Test
   public void testHypenatedFname() {
      testDummy.setFirstName("Clodagh-Rose");
      assertEquals("Clodagh-Rose", testDummy.getFname());
   }
   
   @Test
   public void testFadaFname() { 
     testDummy.setFirstName("Remé");
     assertEquals("Remé", testDummy.getFname());
      
   }
   
   @Test
   public void testinitalFname() {
      testDummy.setFirstName("JJ");
      assertEquals("JJ", testDummy.getFname());
   }

   @Test
   public void testtwoDotsOverLetterFname() {
	  testDummy.setFirstName("Zoë");
	  assertEquals("Zoë", testDummy.getFname()); 
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testFirstNameWithNumber() {
	   testDummy.setFirstName("Rem5");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testFirstNameWithsymbol() {
	   testDummy.setFirstName("Tom#y");
   }
   
   @Test
   public void testlname() {
	  testDummy.setlastName("Quill");
	  assertEquals("Quill", testDummy.getlname());
      
   }
   
   @Test
   public void testHypenatedlname() {
      assertEquals("Doherty-Quill", testDummy.getlname());
      testDummy.setlastName("Doherty-Quill");
   }
   
   @Test
   public void testapostrophelname() {
      assertEquals("O'Rourke", testDummy.getlname());
      testDummy.setlastName("O'Rourke");
   }
   
   @Test
   public void testSecondCaptialLetterlname() {
      assertEquals("Mc Ginley", testDummy.getlname());
      testDummy.setlastName("Mc Ginley");
   }
   
   @Test
   public void testDoubleHyphenatedlname() {
      assertEquals("Doherty-Gallagher-Quill", testDummy.getlname());
      testDummy.setlastName("Doherty-Gallagher-Quill");
   }
   
   @Test
   public void testHyphenatedandsecondcaptailletterlname() {
      assertEquals("Doherty-Mc Ginley", testDummy.getlname());
      testDummy.setlastName("Doherty-Mc Ginley");
   }
   
   @Test
   public void testHyphenatedandaspostrophylname() {
      assertEquals("Doherty-O'Rourke", testDummy.getlname());
      testDummy.setlastName("Doherty-O'Rourke");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testLastNameWithfullstop() {
      testDummy.setlastName("Doherty.Quill");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testLastNameWithnumber() {
      testDummy.setlastName("Mc Gin7ley");
   }  
   
   @Test(expected = IllegalArgumentException.class)
   public void testLastNameWithsymbol() {
      testDummy.setlastName("Q#uill");
   }
   @Test
   public void testnumberaddress() {
      assertEquals("12 Oldtown", testDummy.getAddress());
      testDummy.setAddress("12 Oldtown");
   }
   
   @Test
   public void testmoreThanoneWordinStreetNameaddress() {
     assertEquals("Leck Cottages", testDummy.getAddress());
      testDummy.setAddress("LeckCottages");
   }
   
   @Test
   public void testCommaaddress() {
      assertEquals("Leck, Oldtown", testDummy.getAddress());
      testDummy.setAddress("Leck, Oldtown");
   }
   
   @Test
   public void testtwoCommasaddress() {
      assertEquals("Leck Cottages, Oldtown, Letterkenny", testDummy.getAddress());
      testDummy.setAddress("Leck, Oldtown, Letterkenny");
   }
   
   @Test
   public void testmoreThanoneWordinStreetNametwoCommasaddress() {
      assertEquals("Leck Cottages, Oldtown, Letterkenny", testDummy.getAddress());
      testDummy.setAddress("Leck, Oldtown, Letterkenny");
   }
   
   @Test
   public void testthreeCommasaddress() {
      assertEquals("Leck Cottages, Oldtown, Letterkenny,", testDummy.getAddress());
      testDummy.setAddress("Leck, Oldtown, Letterkenny, ");
   }
   
   @Test
   public void testthreeCommasandfullstopaddress() {
      assertEquals("Leck Cottages, Oldtown, Letterkenny, Co.Donegal", testDummy.getAddress());
      testDummy.setAddress("Leck, Oldtown, Letterkenny, Co.Donegal");
   }
   
   @Test
   public void testmoblethreephoneNum() {
      assertEquals("(083)1256789", testDummy.getphoneNum());
      testDummy.setphoneNumber("(083)1256789");
   }
   
   @Test
   public void testmoblemeteorphoneNum() {
      assertEquals("(085)5553344", testDummy.getphoneNum());
      testDummy.setphoneNumber("(085)5553344");
   }
   
   @Test
   public void testmoblevodafonephoneNum() {
      assertEquals("(087)6655987", testDummy.getphoneNum());
      testDummy.setphoneNumber("(087)6655987");
   }
   
   @Test
   public void testmobletescophoneNum() {
      assertEquals("(089)3388992", testDummy.getphoneNum());
      testDummy.setphoneNumber("(089)3388992");
   }
   
   @Test
   public void testhousenumberletterkennyphoneNum() {
      assertEquals("9171871", testDummy.getphoneNum());
      testDummy.setphoneNumber("9171871");
   }
   
   @Test
   public void testhousenumberletterkennycallfrommobilephoneNum() {
      assertEquals("(074)9171871", testDummy.getphoneNum());
      testDummy.setphoneNumber("(074)9171871");
   }
   
   @Test
   public void testhousenumberDublinphoneNum() {
      assertEquals("(01)56789", testDummy.getphoneNum());
      testDummy.setphoneNumber("(01)56789");
   }
   
   @Test
   public void testhousenumberSligophoneNum() {
      assertEquals("(071)32143", testDummy.getphoneNum());
      testDummy.setphoneNumber("(071)32143");
   }
   
   @Test
   public void testhousenumberCorkCityphoneNum() {
      assertEquals("(021)65789", testDummy.getphoneNum());
      testDummy.setphoneNumber("(021)165789");
   }
   
   @Test
   public void testhousenumberDundalkphoneNum() {
      assertEquals("(042)54366", testDummy.getphoneNum());
      testDummy.setphoneNumber("(042)54366");
   }
   
   @Test
   public void testhousenumberTullamorephoneNum() {
      assertEquals("(057)99887", testDummy.getphoneNum());
      testDummy.setphoneNumber("(057)99887");
   }
   
   @Test
   public void testhousenumberTraleephoneNum() {
      assertEquals("(066)77668", testDummy.getphoneNum());
      testDummy.setphoneNumber("(066)77668");
   }
   
   @Test
   public void testhousenumberGalwayCityphoneNum() {
      assertEquals("(091)44978", testDummy.getphoneNum());
      testDummy.setphoneNumber("(091)44978");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testphoneNumbernocode() {
      testDummy.setphoneNumber("56789");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testphoneNumbercodetolong() {
      testDummy.setphoneNumber("(087654)56789");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testphoneNumbercodetoshort() {
      testDummy.setphoneNumber("(0)56789");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testphoneNumbernumbertoshort() {
      testDummy.setphoneNumber("(074)56");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testphoneNumbernumbertolong() {
      testDummy.setphoneNumber("(074)56123478943");
   }
   @Test
   public void testEmail() {
      assertEquals("L00111952@student.lyit.ie", testDummy.getEmail());
      testDummy.setemail("L00111952@student.lyit.ie");
   }
   
   @Test
   public void testyahooEmail() {
      assertEquals("quill@yahoo.ie", testDummy.getEmail());
      testDummy.setemail("quill@yahoo.ie");
   }
   
   @Test
   public void testhotmailEmail() {
      assertEquals("Tommy@hotmail.com", testDummy.getEmail());
      testDummy.setemail("Tommy@hotmail.com");
   }
   
   @Test
   public void testgmailEmail() {
      assertEquals("Quill@gmail.com", testDummy.getEmail());
      testDummy.setFirstName("Quill@gmail.com");
   }
   
   @Test
   public void testsymbolsEmail() {
      assertEquals("Remé_Quill@hotmail.com", testDummy.getEmail());
      testDummy.setFirstName("Remé_Quill@hotmail.com");
   }
   
   @Test
   public void testfuillstopEmail() {
      assertEquals("tania.quill@yahoo.ie", testDummy.getEmail());
      testDummy.setemail("tania.quill@yahoo.ie");
   }
   
   @Test
   public void testHypenatedEmail() {
      assertEquals("tania-quill@yahoo.ie", testDummy.getEmail());
      testDummy.setemail("tania-quill@yahoo.ie");
   }
   
   @Test
   public void testfadaEmail() {
      assertEquals("Remé@yahoo.ie", testDummy.getEmail());
      testDummy.setemail("Remé@yahoo.ie");
   }
   
   @Test
   public void testaspostrophyEmail() {
      assertEquals("Remé@yahoo.ie", testDummy.getEmail());
      testDummy.setemail("Remé@yahoo.ie");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testemailnoatsymbol() {
      testDummy.setemail("Reméyahoo.ie");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testemailnofullstop() {
      testDummy.setemail("Tania@yahooie");
   }  
   
   @Test(expected = IllegalArgumentException.class)
   public void testemailnothingafterat() {
      testDummy.setemail("Tania@");
   }  
   
   @Test(expected = IllegalArgumentException.class)
   public void testemailnothingbeforeat() {
      testDummy.setemail("@yahoo.ie");
   }
   
   @Test
   public void testpassword() {
      assertEquals("london", testDummy.getpassword());
      testDummy.setPassword("london");
   }
   
   @Test
   public void testnumberspassword() {
      assertEquals("london22", testDummy.getpassword());
      testDummy.setPassword("london21");
   }
   
   @Test
   public void testcaptailletterpassword() {
      assertEquals("Newyork", testDummy.getpassword());
      testDummy.setPassword("Newyork");
   }
   
   @Test
   public void testtwocaptailletterpassword() {
      assertEquals("NewYork", testDummy.getpassword());
      testDummy.setPassword("NewYork");
   }
   
   @Test
   public void testsymbolpassword() {
      assertEquals("berlin_", testDummy.getpassword());
      testDummy.setPassword("berlin_");
   }
   
   @Test
   public void testcaptailletterandnumberspassword() {
      assertEquals("Germany7865", testDummy.getpassword());
      testDummy.setPassword("Germany7865");
   }
   
   @Test
   public void testcaptailletterandsymbolsspassword() {
      assertEquals("Sweden_~", testDummy.getpassword());
      testDummy.setPassword("Sweden_~");
   }
   
   @Test
   public void testlengthpassword() {
      assertEquals("Sweden_~", testDummy.getpassword());
      testDummy.setPassword("Sweden_~");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testPassowrdtoshort() {
      testDummy.setPassword("an");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testPassowrdcontainsspaces() {
      testDummy.setPassword("new york");
   }  
   
   @Test(expected = IllegalArgumentException.class)
   public void testPassowrdtolong() {
      testDummy.setPassword("london123456789");
   } 
   
   @Test(expected = IllegalArgumentException.class)
   public void testPassowrdcontainsonlysymbols() {
      testDummy.setPassword("@#'#~");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testPassowrdcontainsconseutiveofsameletter() {
      testDummy.setPassword("aaaaaaa");
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testPassowrdcontainsconseutiveofsamenumber() {
      testDummy.setPassword("22222222");
   }
} 

