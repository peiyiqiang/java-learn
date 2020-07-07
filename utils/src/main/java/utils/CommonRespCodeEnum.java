package utils;

/**
 * Created by peiyiqiang on 2020/6/29.
 * Description: 通用返回码枚举
 */
public enum CommonRespCodeEnum {

    CODE_200(200, "成功"),
    CODE_201(201, "必要参数缺失"),
    CODE_202(202, "参数值非法"),
    CODE_203(203, "服务超时"),
    CODE_204(204, "服务限流"),
    CODE_205(205, "服务不可用"),
    CODE_206(206, "服务不存在"),
    CODE_207(207, "未知错误"),
    CODE_208(208, "系统错误"),
    CODE_209(209, "系统繁忙"),
    CODE_210(210, "远程服务错误"),
    CODE_211(211, "安全检查失败"),
    CODE_212(212, "加密或签名信息错误"),
    CODE_213(213, "鉴权失败"),
    CODE_214(214, "身份认证失败"),
    CODE_215(215, "接口访问权限受限"),
    CODE_216(216, "未处理错误");

    private final int code;
    private final String msg;

    private CommonRespCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return this.code;
    }

    public String msd() {
        return this.msg;
    }
}
