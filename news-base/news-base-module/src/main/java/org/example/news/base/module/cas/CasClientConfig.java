package org.example.news.base.module.cas;

import org.jasig.cas.client.session.SingleSignOutFilter;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.jasig.cas.client.util.AssertionThreadLocalFilter;
import org.jasig.cas.client.util.HttpServletRequestWrapperFilter;
import org.jasig.cas.client.validation.Cas10TicketValidationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.jasig.cas.client.authentication.AuthenticationFilter;

@Configuration
public class CasClientConfig {

    @Bean
    public FilterRegistrationBean singleSignOutFilter(CasAutoConfig casAutoConfig) {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new SingleSignOutFilter());
        registrationBean.setEnabled(true);
        registrationBean.addUrlPatterns("/logout");
        registrationBean.addInitParameter("casServerUrlPrefix", casAutoConfig.getCasServerUrlPrefix());
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean singleSignOutHttpSessionListener() {
        ServletListenerRegistrationBean listenerRegistrationBean = new ServletListenerRegistrationBean();
        listenerRegistrationBean.setEnabled(true);
        listenerRegistrationBean.setListener(new SingleSignOutHttpSessionListener());
        return listenerRegistrationBean;
    }


    @Bean
    public FilterRegistrationBean authenticationFilter(CasAutoConfig casAutoConfig) {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new AuthenticationFilter());
        registrationBean.setEnabled(true);
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("serverName", casAutoConfig.getLocalServerUrlPrefix());
        registrationBean.addInitParameter("casServerLoginUrl", casAutoConfig.getCasServerLoginUrl());
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean cas10TicketValidationFilter(CasAutoConfig casAutoConfig) {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new Cas10TicketValidationFilter());
        registrationBean.setEnabled(true);
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("serverName", casAutoConfig.getLocalServerUrlPrefix());
        registrationBean.addInitParameter("casServerUrlPrefix", casAutoConfig.getCasServerUrlPrefix());
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean httpServletRequestWrapperFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new HttpServletRequestWrapperFilter());
        registrationBean.setEnabled(true);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean assertionThreadLocalFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new AssertionThreadLocalFilter());
        registrationBean.setEnabled(true);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }


}
