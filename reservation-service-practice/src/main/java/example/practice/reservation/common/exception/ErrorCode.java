package example.practice.reservation.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    NotFound("404", "Not Founded!")
    , ServerError("500", "Internal Server Error");

    private final String code;
    private final String message;
}
