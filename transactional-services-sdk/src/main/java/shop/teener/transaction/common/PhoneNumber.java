package shop.teener.transaction.common;


import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * *
 * * @author Pratyay
 */
@Data
@RequiredArgsConstructor
public class PhoneNumber {
    private final String countryCode;
    private final String phoneNumber;
}
