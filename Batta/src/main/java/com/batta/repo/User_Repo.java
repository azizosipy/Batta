package com.batta.repo;

import com.batta.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Repo  extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}

