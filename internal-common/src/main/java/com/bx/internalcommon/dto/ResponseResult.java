package com.bx.internalcommon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> implements Serializable {

    private  Integer code;

    private  String message;

    private  T data;


    public ResponseResult(Integer code,String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public  ResponseResult setData(T data){
        this.code = 1;
        this.message = "success";
        this.data = data;
        return this;
    }

}
