package com.frank.cloudstream.common.model;

import java.text.MessageFormat;

/**
 * Created by Frank on 2018-1-4.
 */
public class AppException extends RuntimeException {

    private static final long serialVersionUID = 2166347216219675858L;

    private ErrorCode errorCode;

    public AppException(ErrorCode errorCode, Object... arguments) {
        super( MessageFormat.format(errorCode.getMsg(), arguments));
        this.errorCode = errorCode;
    }

    public AppException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMsg(), cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}