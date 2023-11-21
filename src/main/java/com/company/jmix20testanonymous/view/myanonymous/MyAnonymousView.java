package com.company.jmix20testanonymous.view.myanonymous;


import com.company.jmix20testanonymous.view.login.LoginView;
import com.company.jmix20testanonymous.view.main.MainView;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.UiProperties;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.Views;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "anonymous", layout = MainView.class)
@ViewController("MyAnonymousView")
@ViewDescriptor("my-anonymous-view.xml")
public class MyAnonymousView extends StandardView {
    @Autowired
    private ViewNavigators viewNavigators;

    @Subscribe(id = "showLoginScreenBtn", subject = "clickListener")
    public void onShowLoginScreenBtnClick(final ClickEvent<JmixButton> event) {

        viewNavigators.view(LoginView.class)
                .withBackwardNavigation(true)
                .navigate();
    }


}