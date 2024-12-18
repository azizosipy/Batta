package com.batta.service;

import com.batta.model.User;
import com.batta.repo.User_Repo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_Service{

    private final User_Repo userRepo;

    @Autowired
    public User_Service(User_Repo userRepo) {
        this.userRepo = userRepo;
    }

    public User Login(String email, String password){
        User u = userRepo.findByEmail(email);
        if(u == null){
            return null;
        }
        else{
            if(u.getPassword().equals(password)){
                return u;
            }
            else{
                return null;
            }
        }
    }
    public void Update(User user){
        userRepo.save(user);
    }
    public void Register(User user){
        userRepo.save(user);
    }
    public void getserById(int id){
        userRepo.findById(id);
    }


}
