import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncryptTests {
    // test for encrytion
    @Test
    public void encryptTest() {
        // arrange
        var encrypt = new Encrypt(null);
        var expected = "8888";
        // act
        encrypt.encrypt("1111");
        var actual = encrypt.getEncrypted();
        // assert
        assertEquals(expected, actual);
    }

    // test for decryption
    @Test
    public void decryptTest() {
        // arrange
        var decrypt = new Decrypt();
        var expected = "1111";
        // act
        decrypt.decrypt("8888");
        var actual = decrypt.getKey();
        // assert
        assertEquals(expected, actual);
    }

}
