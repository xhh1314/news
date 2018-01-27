package org.example.news.base.module.cas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CasAutoConfig {

    private String validateFilters;
    private String signOutFilters;
    private String authFilters;
    private String assertionFilters;
    private String requestWrapperFilters;

    @Value("${cas.casServerName}")
    private String casServerName;
    /**
     * https://sso.lihao.com:8443/cas
     */
    @Value("${cas.casServerUrlPrefix}")
    private String casServerUrlPrefix;
    /**
     * https://sso.lihao.com:8443/cas/login
     */
    @Value("${cas.casServerLoginUrl}")
    private String casServerLoginUrl;
    /**
     * https://sso.lihao.com:8443/cas/logout
     */
    @Value("${cas.casServerLogoutUrl}")
    private String casServerLogoutUrl;
    /**
     * http://localhost:8080
     */
    @Value("${cas.localServerUrlPrefix}")
    private String localServerUrlPrefix;
    /**
     * /shiro-cas
     */
    @Value("${cas.casFilterUrlPattern}")
    private String casFilterUrlPattern;
    @Value("${cas.serverName")
    private String serverName;
    /**
     * http://sso.lihao.com:8443/cas/login?service=http://localhost:8080/admin/index
     */
    @Value("${cas.loginUrl}")
    private String loginUrl;

    @Value("${cas.logoutUrl}")
    private String logoutUrl;

    @Value("${cas.loginSuccessUrl}")
    private String loginSuccessUrl;
    @Value("${cas.loginFailUrl}")
    private String loginFailUrl;

    @Value("${cas.useSession}")
    private String useSession ;
    @Value("${cas.redirectAfterValidation}")
    private String redirectAfterValidation;
    @Value("${cas.localServerLoginUrl}")
    private String localServerLoginUrl;


    public String getCasServerName() {
        return casServerName;
    }

    public void setCasServerName(String casServerName) {
        this.casServerName = casServerName;
    }

    public String getValidateFilters() {
        return validateFilters;
    }

    public void setValidateFilters(String validateFilters) {
        this.validateFilters = validateFilters;
    }

    public String getSignOutFilters() {
        return signOutFilters;
    }

    public void setSignOutFilters(String signOutFilters) {
        this.signOutFilters = signOutFilters;
    }

    public String getAuthFilters() {
        return authFilters;
    }

    public void setAuthFilters(String authFilters) {
        this.authFilters = authFilters;
    }

    public String getAssertionFilters() {
        return assertionFilters;
    }

    public void setAssertionFilters(String assertionFilters) {
        this.assertionFilters = assertionFilters;
    }

    public String getRequestWrapperFilters() {
        return requestWrapperFilters;
    }

    public void setRequestWrapperFilters(String requestWrapperFilters) {
        this.requestWrapperFilters = requestWrapperFilters;
    }

    public String getCasServerUrlPrefix() {
        return casServerUrlPrefix;
    }

    public void setCasServerUrlPrefix(String casServerUrlPrefix) {
        this.casServerUrlPrefix = casServerUrlPrefix;
    }

    public String getCasServerLoginUrl() {
        return casServerLoginUrl;
    }

    public void setCasServerLoginUrl(String casServerLoginUrl) {
        this.casServerLoginUrl = casServerLoginUrl;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String isUseSession() {
        return useSession;
    }

    public void setUseSession(String useSession) {
        this.useSession = useSession;
    }

    public String isRedirectAfterValidation() {
        return redirectAfterValidation;
    }

    public void setRedirectAfterValidation(String redirectAfterValidation) {
        this.redirectAfterValidation = redirectAfterValidation;
    }

    public String getLocalServerUrlPrefix() {
        return localServerUrlPrefix;
    }

    public void setLocalServerUrlPrefix(String localServerUrlPrefix) {
        this.localServerUrlPrefix = localServerUrlPrefix;
    }

    public String getCasFilterUrlPattern() {
        return casFilterUrlPattern;
    }

    public void setCasFilterUrlPattern(String casFilterUrlPattern) {
        this.casFilterUrlPattern = casFilterUrlPattern;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getLoginSuccessUrl() {
        return loginSuccessUrl;
    }

    public void setLoginSuccessUrl(String loginSuccessUrl) {
        this.loginSuccessUrl = loginSuccessUrl;
    }

    public String getLoginFailUrl() {
        return loginFailUrl;
    }

    public void setLoginFailUrl(String loginFailUrl) {
        this.loginFailUrl = loginFailUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getCasServerLogoutUrl() {
        return casServerLogoutUrl;
    }

    public void setCasServerLogoutUrl(String casServerLogoutUrl) {
        this.casServerLogoutUrl = casServerLogoutUrl;
    }

    public String getLocalServerLoginUrl() {
        return localServerLoginUrl;
    }

    public void setLocalServerLoginUrl(String localServerLoginUrl) {
        this.localServerLoginUrl = localServerLoginUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }
}
