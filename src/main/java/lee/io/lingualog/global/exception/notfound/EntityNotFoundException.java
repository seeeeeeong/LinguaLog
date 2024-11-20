package lee.io.lingualog.global.exception.notfound;

import lee.io.lingualog.global.exception.BusinessException;
import lee.io.lingualog.global.exception.ErrorCode;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
    public EntityNotFoundException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

}
