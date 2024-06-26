package com.MinorPro.Minor.controller;

import com.MinorPro.Minor.model.LoginForm;
import com.MinorPro.Minor.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginForm loginForm) {
        String email = loginForm.getEmail();
        String password = loginForm.getPassword();

        // Call the authentication service to validate the credentials
        boolean isAuthenticated = authenticationService.authenticate(email, password);

        // Prepare the response
        Map<String, Object> response = new HashMap<>();
        if (isAuthenticated) {
            response.put("success", true);
        } else {
            response.put("success", false);
            response.put("message", "Invalid username or password");
        }

        return response;
    }
}
