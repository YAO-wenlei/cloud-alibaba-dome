package com.yao.base;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月01日 6:42 下午
 */
@Data
public class ResultData<T> {

    //状态码
    private int status;
    //相应信息
    private String message;
    //后端返回结果
    private T data;
    //后端相应状态
    private boolean success;
    //时间戳
    private long timestamp;


    private int httpStatus;

    public ResultData(){
        this.timestamp = System.currentTimeMillis();
    }


    public static <T> ResultData<T> success() {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSuccess(true);
        resultData.setStatus(ReturnCode.RC100.getCode());
        resultData.setMessage(ReturnCode.RC100.getMessage());
        return resultData;
    }

    public static <T> ResultData<T> success(String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSuccess(true);
        resultData.setStatus(ReturnCode.RC100.getCode());
        resultData.setMessage(message);
        return resultData;
    }

    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSuccess(true);
        resultData.setStatus(ReturnCode.RC100.getCode());
        resultData.setMessage(ReturnCode.RC100.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail() {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSuccess(false);
        resultData.setStatus(ReturnCode.RC999.getCode());
        resultData.setMessage(ReturnCode.RC999.getMessage());
        return resultData;
    }

    public static <T> ResultData<T> fail(String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSuccess(false);
        resultData.setStatus(ReturnCode.RC999.getCode());
        resultData.setMessage(message);
        return resultData;
    }
    public static <T> ResultData<T> fail(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSuccess(false);
        resultData.setStatus(ReturnCode.RC999.getCode());
        resultData.setMessage(ReturnCode.RC999.getMessage());
        resultData.setData(data);
        return resultData;
    }


    @JSONField(serialize = false, deserialize = false)
    @JsonIgnore
    public int getHttpStatus() {
        return httpStatus;
    }

}
