package com.gxz.backend.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum ResponseCodeEnums {

    SUCCESS(200, "success"),
    FAIL(500, "failed"),

    NO_LOGIN(999, "请先登录"),

    HTTP_STATUS_200(200, "ok"),
    HTTP_STATUS_400(400, "request error"),
    HTTP_STATUS_401(401, "no authentication"),
    HTTP_STATUS_403(403, "no authorities"),
    HTTP_STATUS_500(500, "server error");

    private final int code;

    private final String message;

}
