package shop.teener.transaction.auth;

import shop.teener.transaction.common.PhoneNumber;

import java.util.concurrent.CompletableFuture;

public interface AuthManager {
    // initiate will be calling the OTP service, requesting for otp
    public CompletableFuture<Void> initiate(PhoneNumber request);
}
