package com.example.demo.Vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResultVo<T> implements Serializable {

    private String code;

    private String msg;

    private T result;

    public static <T> ResultVo<T> buildSuccess(T result) {
        return new ResultVo<T>("000", null, result);
    }

    public static <T> ResultVo<T> buildFailure(String msg) {
        return new ResultVo<T>("400", msg, null);
    }
}