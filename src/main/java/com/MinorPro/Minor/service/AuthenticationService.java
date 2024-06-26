//package com.MinorPro.Minor.service;
//
//import com.MinorPro.Minor.model.Signup;
//import com.MinorPro.Minor.repository.SignupRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthenticationService {
//
//    @Autowired
//    private SignupRepository signupRepository;
//
//    public boolean authenticate(String username, String password) {
//        Signup user = signupRepository.findByUsername(username);
//        if (user != null && user.getPassword().equals(password)) {
//            return true; // Authentication successful
//        }
//        return false; // Authentication failed
//    }
//}


package com.MinorPro.Minor.service;

import com.MinorPro.Minor.model.Signup;
import com.MinorPro.Minor.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private SignupRepository signupRepository;

    public String getRole(String email, String password) {
        Signup user = signupRepository.findByEmail(email);

        return null; // Authentication failed or user not found
    }

    public boolean authenticate(String email, String password) {
        return getRole(email, password) != null; // Authenticate based on role existence
    }
}

