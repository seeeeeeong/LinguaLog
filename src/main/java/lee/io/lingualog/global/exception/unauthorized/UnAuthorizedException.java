package lee.io.lingualog.global.exception.unauthorized;

import lee.io.lingualog.global.exception.BusinessException;
import lee.io.lingualog.global.exception.ErrorCode;

public class UnAuthorizedException extends BusinessException {

    public UnAuthorizedException(ErrorCode errorCode) {
        super(errorCode);
    }
}
