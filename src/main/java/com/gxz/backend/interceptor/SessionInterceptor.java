package com.gxz.backend.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gxz.backend.common.Constants;
import com.gxz.backend.common.ResponseCodeEnums;
import com.gxz.backend.common.ResponseInfo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SessionInterceptor implements HandlerInterceptor {

    // 这是一个假设的方法，你需要根据你的应用程序来实现它
    private boolean isUserLoggedIn(HttpServletRequest request) {
        // 这里你可以检查请求中的会话、令牌、cookie等
        return request.getSession().getAttribute(Constants.SESSION_ATT_USER) != null;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 不拦截GET请求
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            return true;
        }

        HttpSession session = request.getSession(false); // 获取当前会话，如果会话不存在则返回null

        // 假设你有一个方法来检查用户是否登录
        boolean isUserLoggedIn = isUserLoggedIn(request);

        if (!isUserLoggedIn) {
            ResponseInfo rsp = ResponseInfo.fail(ResponseCodeEnums.NO_LOGIN.getCode(), ResponseCodeEnums.NO_LOGIN.getMessage());
            ObjectMapper objectMapper = new ObjectMapper();
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            objectMapper.writeValue(response.getWriter(), rsp);

            return false; // 阻止请求继续处理
        }

        // 如果会话有效，继续处理请求
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
