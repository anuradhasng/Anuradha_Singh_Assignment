package com.coforge.filters;
 
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
 
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.logging.Logger;
 
@WebFilter("/*")   // apply filter to all URLs
public class LoggingFilter implements Filter {
 
    private static final Logger logger = Logger.getLogger(LoggingFilter.class.getName());
 
    // sensitive fields that should not be logged
    private static final Set<String> SENSITIVE =
            new HashSet<>(Arrays.asList(
                    "password",
                    "pwd",
                    "pin",
                    "token",
                    "cvv",
                    "card",
                    "passcode",
                    "authorization",
                    "auth"
            ));
 
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("[LoggingFilter] Initialized");
    }
 
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
 
        long start = System.currentTimeMillis();
 
        HttpServletRequest req = (HttpServletRequest) request;
 
        String method = req.getMethod();
        String uri = req.getRequestURI();
        String qs = req.getQueryString();
        String ip = req.getRemoteAddr();
 
        Map<String, String[]> params = req.getParameterMap();
 
        StringBuilder safeParams = new StringBuilder("{");
 
        boolean first = true;
 
        for (Map.Entry<String, String[]> e : params.entrySet()) {
 
            if (!first) {
                safeParams.append(", ");
            }
 
            first = false;
 
            String key = e.getKey();
 
            safeParams.append(key).append("=");
 
            if (SENSITIVE.contains(key.toLowerCase())) {
                safeParams.append("[REDACTED]");
            } else {
                safeParams.append(Arrays.toString(e.getValue()));
            }
        }
 
        safeParams.append("}");
 
        logger.info(String.format(
                "[BANK-REQ] %s %s | IP=%s | params=%s",
                method,
                uri,
                ip,
                safeParams
        ));
 
        try {
            chain.doFilter(request, response);
        } finally {
 
            long time = System.currentTimeMillis() - start;
 
            logger.info("[BANK-RES] Completed in " + time + " ms");
        }
    }
 
    @Override
    public void destroy() {
        logger.info("[LoggingFilter] Destroyed");
    }
}
 