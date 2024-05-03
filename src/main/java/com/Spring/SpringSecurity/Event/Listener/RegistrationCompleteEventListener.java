package com.Spring.SpringSecurity.Event.Listener;

import com.Spring.SpringSecurity.Entity.User;
import com.Spring.SpringSecurity.Event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create verification token
        User user=event.getUser();
        String token= UUID.randomUUID().toString();

    }
}
