package example.practice.reservation.domain;

import example.practice.reservation.common.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class CommonResponse<T> {
    private T result;
    private HttpStatus httpStatus;

    public static CommonResponse<ErrorBody> of(ErrorCode errorCode, HttpStatus httpStatus) {
        ErrorBody errorBody = new ErrorBody(errorCode);
        return new CommonResponse<>(errorBody, httpStatus);
    }

    public static CommonResponse<ErrorBody> of(ErrorCode errorCode, String message, HttpStatus httpStatus) {
        ErrorBody errorBody = new ErrorBody(errorCode, message);
        return new CommonResponse<>(errorBody, httpStatus);
    }

    public static <T>CommonResponse<T> of(T result, HttpStatus httpStatus) {
        return new CommonResponse<>(result, httpStatus);
    }

    @AllArgsConstructor
    public static class ErrorBody {
        private String errorCode;
        private String errorMessage;

        public ErrorBody (ErrorCode errorCode) {
            this.errorCode = errorCode.getCode();
            this.errorMessage = errorCode.getMessage();
        }

        public ErrorBody (ErrorCode errorCode, String message) {
            this.errorCode = errorCode.getCode();
            this.errorMessage = message;
        }
    }
}
