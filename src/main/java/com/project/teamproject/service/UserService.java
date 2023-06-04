package com.project.teamproject.service;

import com.project.teamproject.domain.entity.UserEntity;
import com.project.teamproject.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserEntity create(String id, String pw, String name){
        UserEntity user = new UserEntity();
        user.setId(id);
        user.setPw(pw);
        user.setName(name);
        this.userRepository.save(user);
        return user;
    }
}
