package shop.teener.transaction.auth;


import shop.teener.transaction.common.PhoneNumber;

import java.util.concurrent.CompletableFuture;

/**
 * *
 * * @author Pratyay
 */
public class MobileAuthManager implements AuthManager {
    @Override
    public CompletableFuture<Void> initiate(PhoneNumber request) {
        return null;
    }
}
