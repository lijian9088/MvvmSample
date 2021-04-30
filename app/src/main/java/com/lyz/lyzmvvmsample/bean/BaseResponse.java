package com.lyz.lyzmvvmsample.bean;

/**
 * @author liyanze
 * @create 2019/02/11
 * @Describe
 */
public class BaseResponse<T> {

    public T data;
    public int errorCode;
    public String errorMsg;

    @Override
    public String toString() {
        return "BaseResponse{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
