package yzeren.rentACar.core.utilities.exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message); // super => RunTimeException. Base sınıf demek
    }
}
