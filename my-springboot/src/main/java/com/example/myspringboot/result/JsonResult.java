package com.example.myspringboot.result;

import lombok.Data;

/**
 * @ProjectName: myspringboot
 * @Package: com.example.myspringboot.result
 * @ClassName: JsonResult
 * @Author: MaCheng
 * @Description:
 * @Date: 2020/4/17 17:27
 * @Version: 1.0
 */

@Data
public class JsonResult<T> {

    private String code;
    private String msg;
    private T data;

    /*** 若没有数据返回，默认状态码为0，提示信息为：操作成功！ */
    public JsonResult() {
        this.code = "0000";
        this.msg = "操作成功";
    }

    /*** 若没有数据返回，可以人为指定状态码和提示信息 * @param code * @param msg */
    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T data) {
        this.data = data;
        this.code = "0000";
        this.msg = "操作成功";
    }

    /*** 有数据返回，状态码为0，人为指定提示信息 * @param data * @param msg */
    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = "0000";
        this.msg = msg;
    }
}
