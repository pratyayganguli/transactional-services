package shop.teener.transaction.client;


import shop.teener.transaction.common.User;

import java.util.concurrent.CompletableFuture;

/**
 * *
 * * @author Pratyay
 */
public class OTPClient {
    public CompletableFuture<String> sentOTP() {
        return CompletableFuture.supplyAsync(() ->{
            return null;
        });
    }
    public CompletableFuture<User> verifyOTP(String sessionId) {
        return null;
    }
}
