package com.MinorPro.Minor.service;

import com.MinorPro.Minor.model.Signup;
import com.MinorPro.Minor.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignupServiceImp implements SignupService {
    @Autowired
    private SignupRepository signupRepository;

    @Override
    public Signup saveSignup(Signup signup) {
        return signupRepository.save(signup);
    }

    @Override
    public Signup findByEmail(String email) {
        return signupRepository.findByEmail(email);
    }

    @Override
    public List<Signup> getAllSignup() {
        return null;
    }
}
