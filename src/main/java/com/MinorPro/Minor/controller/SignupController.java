package com.MinorPro.Minor.controller;

import com.MinorPro.Minor.model.Signup;
import com.MinorPro.Minor.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/signup")
@CrossOrigin(origins = "http://localhost:5174")

public class SignupController {
    @Autowired
    private SignupService signupService;

    @PostMapping("/add")
    public String signup(@RequestBody Signup signup) {
        signupService.saveSignup(signup);
        return "Signup successfully";
    }
    @GetMapping("getAll")
    public List<Signup> getAllSignup()
    {
        return signupService.getAllSignup();
    }

    @GetMapping("/user")
    public Signup getUserByUsername(@RequestParam String email) {
        return signupService.findByEmail(email);
    }
}
