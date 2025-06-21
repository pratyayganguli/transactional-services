package shop.teener.transaction;


import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.Test;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.Security;
import java.util.Base64;

/**
 * *
 * * @author Pratyay
 */
public class KeyGeneratorTest {

    @Test
    void generateAESKeyTest() {
        generateAESKey();
    }

    private static final int MAX_LENGTH = 256;
    public void generateAESKey() {
        try {
            Security.addProvider(new BouncyCastleProvider());
            KeyGenerator keyGen = KeyGenerator.getInstance("AES", "BC");
            keyGen.init(MAX_LENGTH);
            Key secretKey = keyGen.generateKey();
            byte[] keyBytes = secretKey.getEncoded();
            String b64Key = Base64.getEncoder().encodeToString(keyBytes);
            System.out.printf("%s", b64Key);
            System.out.println(b64Key.length());
        } catch (Exception e) {
            throw new RuntimeException("could not generate AES key");
        }
    }
}
