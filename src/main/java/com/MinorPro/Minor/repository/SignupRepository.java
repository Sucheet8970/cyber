package com.MinorPro.Minor.repository;

import com.MinorPro.Minor.model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SignupRepository extends JpaRepository<Signup, Integer> {
    Signup findByUsername(String username);
    Signup findByEmail(String email);
}

