package example.practice.reservation.common.exception;

import example.practice.reservation.domain.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    protected CommonResponse<CommonResponse.ErrorBody> exception(RuntimeException e) {
        log.error("error : {}", e.getMessage());
        return CommonResponse.of(ErrorCode.ServerError, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}