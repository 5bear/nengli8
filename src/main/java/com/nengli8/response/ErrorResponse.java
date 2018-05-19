package com.nengli8.response;

/**
 * Created by 11369 on 2018/5/19.
 */
public class ErrorResponse extends BaseResponse {
    private final String ERROR_CODE = "999";

    public ErrorResponse(String msg) {
        this.setCode(ERROR_CODE);
        this.setMsg(msg);
    }
}
