package shop.teener.transaction;


import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.Test;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.Security;
import java.util.Arrays;
import java.util.Base64;

/**
 * *
 * * @author Pratyay
 */
public class KeyGeneratorTest {
    // todo:
    //  this is only for PoC purposes, all these test cases must be removed.
    @Test
    void generateAESKeyTest() {
        String [] parts = generateAESKeyParts();
        System.out.println(Arrays.toString(parts));
    }
    private static final int MAX_LENGTH = 256;

    public String[] generateAESKeyParts() {
        try {
            Security.addProvider(new BouncyCastleProvider());
            KeyGenerator keyGen = KeyGenerator.getInstance("AES", "BC");
            keyGen.init(MAX_LENGTH);
            Key secretKey = keyGen.generateKey();
            byte[] keyBytes = secretKey.getEncoded();
            String b64Key = Base64.getEncoder().encodeToString(keyBytes);
            System.out.println(b64Key);
            int mid = b64Key.length()/2;
            String[] parts = new String[2];
            parts[0] = b64Key.substring(0, mid);
            parts[1] = b64Key.substring(mid, b64Key.length());
            return parts;
        } catch (Exception e) {
            // use some kind of custom exception
            throw new RuntimeException("could not generate AES key");
        }
    }
}
