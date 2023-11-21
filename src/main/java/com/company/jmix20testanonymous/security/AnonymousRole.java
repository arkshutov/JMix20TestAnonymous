package com.company.jmix20testanonymous.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "AnonymousRole", code = AnonymousRole.CODE, scope = "UI")
public interface AnonymousRole {
    String CODE = "anonymous-role";

    @MenuPolicy(menuIds = {"anonymousView"})
    @ViewPolicy(viewIds = {"MainScreenSideMenu", "MyAnonymousView"})
    void views();

    @ViewPolicy(viewIds = "LoginView")
    @SpecificPolicy(resources = "ui.loginToUi")
    void login();
}