package shop.teener.transaction.common;


import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * *
 * * @author Pratyay
 */

@RequiredArgsConstructor
@Data
public class User {
    private final String id;
    private final PhoneNumber phoneNumber;
}
