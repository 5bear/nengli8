package com.nengli8.response;

/**
 * Created by 11369 on 2018/5/19.
 */
public class SuccessResponse extends BaseResponse {
    private final String SUCCESS_CODE = "000";
    private Object info;

    public SuccessResponse(String msg, Object info) {
        this.setCode(SUCCESS_CODE);
        this.setMsg(msg);
        this.setInfo(info);
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
