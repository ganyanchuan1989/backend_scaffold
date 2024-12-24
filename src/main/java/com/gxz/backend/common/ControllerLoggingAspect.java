package com.gxz.backend.common;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class ControllerLoggingAspect {

    @Pointcut("execution(public * com.gxz.backend.controller..*(..))")
    public void controllerMethods() {}

    @Before("controllerMethods()")
    public void logBefore(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
    
        log.info("Request URL: {}", request.getRequestURL());
        log.info("Request Method: {}", request.getMethod());
        log.info("Request Parameters: {}", Arrays.toString(request.getParameterMap().entrySet().toArray()));
        log.info("Executing method: {}", methodName);
        log.info("Method arguments: {}", Arrays.toString(args));
    }

    @AfterReturning(pointcut = "controllerMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("Method executed successfully: {}", joinPoint.getSignature().getName());
        log.info("Return value: {}", result);
    }

    @AfterThrowing(pointcut = "controllerMethods()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        log.error("Exception in method: {}", joinPoint.getSignature().getName(), exception);
    }

    @Around("controllerMethods()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        log.info("Method execution time: {} ms", executionTime);

        return result;
    }
}