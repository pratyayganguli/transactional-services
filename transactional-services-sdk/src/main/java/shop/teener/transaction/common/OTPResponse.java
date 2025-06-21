package shop.teener.transaction.common;


import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * *
 * * @author Pratyay
 */
@RequiredArgsConstructor
@Data
public class OTPResponse {
    private String sessionId;
}
