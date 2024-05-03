package com.Spring.SpringSecurity.Controller;


import com.Spring.SpringSecurity.Entity.User;
import com.Spring.SpringSecurity.Event.RegistrationCompleteEvent;
import com.Spring.SpringSecurity.Model.UserModel;
import com.Spring.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping("/register")

    public ResponseEntity<String> registerUser(@RequestBody UserModel userModel){
        User user=userService.registerUser(userModel);
        publisher.publishEvent(new RegistrationCompleteEvent(
                user,
                "url"
        ));
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

}
