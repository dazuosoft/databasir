package com.databasir.api.config.security;

import com.databasir.common.JsonData;
import com.databasir.core.domain.DomainErrors;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.ServletException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

@Service
@RequiredArgsConstructor
@Slf4j
public class DatabasirAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private final ObjectMapper objectMapper;

    private final MessageSource messageSource;

    private final LocaleResolver localeResolver;

    @Override
    public void commence(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        log.warn("验证未通过. 提示信息 - {} - {} - {}", request.getRequestURI(),
            authException.getClass().getName(),
            authException.getMessage());

        Locale locale = localeResolver.resolveLocale(request);
        DomainErrors err = DomainErrors.INVALID_ACCESS_TOKEN;
        String msg = messageSource.getMessage(err.getErrCode(), err.exception().getArgs(), locale);
        JsonData<Void> data = JsonData.error(err.getErrCode(), msg);
        String jsonString = objectMapper.writeValueAsString(data);
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.getOutputStream().write(jsonString.getBytes(StandardCharsets.UTF_8));
    }

}
