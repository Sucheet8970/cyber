package com.MinorPro.Minor.service;

import com.MinorPro.Minor.model.Signup;

import java.util.List;

public interface SignupService {
    Signup saveSignup(Signup signup);
    Signup findByEmail(String email); // Updated method signature to find user by email

    List<Signup> getAllSignup();
}
