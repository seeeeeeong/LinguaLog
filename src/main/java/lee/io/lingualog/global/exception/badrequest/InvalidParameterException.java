package lee.io.lingualog.global.exception.badrequest;


import lee.io.lingualog.global.exception.BusinessException;
import lee.io.lingualog.global.exception.ErrorCode;

public class InvalidParameterException extends BusinessException {

    public InvalidParameterException(ErrorCode errorCode) {
        super(errorCode);
    }
}
