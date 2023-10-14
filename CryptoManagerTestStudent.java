import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testIsStringInBounds() {
	    assertTrue(CryptoManager.isStringInBounds("A"));
	    assertTrue(CryptoManager.isStringInBounds("G"));
	    assertTrue(CryptoManager.isStringInBounds("ASDFVASDF"));
	    assertTrue(CryptoManager.isStringInBounds("ASDFOPPOW"));
	    assertTrue(CryptoManager.isStringInBounds("0123456789"));
	}

	@Test
	void testCaesarEncryption() {
        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3));
        assertEquals("EBIIL", CryptoManager.caesarEncryption("HELLO", -3));
        assertEquals("hello", CryptoManager.caesarEncryption("hello", 0));
        assertEquals("", CryptoManager.caesarEncryption("", 5));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("WN#\\N &", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.bellasoEncryption("MERRY CHRISTMAS", "HELLO"));
		assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));

	}
	

	@Test
	void testCaesarDecryption() {
        assertEquals("HELLO", CryptoManager.caesarDecryption("KHOOR", 3));
        assertEquals("HELLO", CryptoManager.caesarDecryption("EBIIL", -3));
        assertEquals("HELLO", CryptoManager.caesarDecryption("HELLO", 0));
        assertEquals("", CryptoManager.caesarDecryption("", 5));
   }

	@Test
	void testBellasoDecryption() {
        assertEquals("TESTING", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
        assertEquals("MERRY CHRISTMAS", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
        assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));
    	}

}
