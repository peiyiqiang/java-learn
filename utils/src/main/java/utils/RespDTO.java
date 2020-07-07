package utils;

import java.io.Serializable;

/**
 * Created by peiyiqiang on 2020/6/29.
 * Description: 通用返回
 */
public class RespDTO<T> implements Serializable {

    private static final long serialVersionUID = 8363406574312373561L;
    public static final Integer SUCCESS_CODE = 200;
    public static final Integer INVALID_PARAMS_CODE = 202;
    public static final Integer FAIL_CODE = 207;

    public Integer code;
    public String msg;
    private T content;
    private Integer totalCount = 0;

    public RespDTO() {
    }

    public RespDTO(T content) {
        this.code = SUCCESS_CODE;
        this.content = content;
    }

    public RespDTO(T content, Integer totalCount) {
        this.code = SUCCESS_CODE;
        this.content = content;
        this.totalCount = totalCount;
    }

    public RespDTO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static RespDTO buildSuccess() {
        return buildSuccess(null);
    }

    public static <T> RespDTO buildSuccess(T content) {
        return new RespDTO(content);
    }

    public static <T> RespDTO buildPageSuccess(T content, Integer totalCount) {
        return new RespDTO<>(content, totalCount);
    }

    public static RespDTO buildInvalid(String msg) {
        return new RespDTO(INVALID_PARAMS_CODE, msg);
    }

    public static RespDTO buildFail(String msg) {
        return new RespDTO(FAIL_CODE, msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(this.code);
    }

}
