package com.frank.cloudstream.common.model;

/**
 * Created by Frank on 2018-1-4.
 */
public enum ErrorCode {

    BAD_REQUEST(400, "Bad Request"),
    ERROR(500, "system error"),
    ;

    private Integer code;
    private String msg;

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static ErrorCode getCode(Integer errorCode) {
        for (ErrorCode c : ErrorCode.values()) {
            if (errorCode == c.getCode()) {
                return c;
            }
        }
        return ERROR;
    }
}
