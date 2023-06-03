package com.project.teamproject.service;

import com.project.teamproject.domain.entity.UserEntity;
import com.project.teamproject.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;

    public UserEntity create(String id, String pw, String name, boolean location) {
        UserEntity user = new UserEntity().builder()
                .id(id)
                .pw(pw)
                .name(name)
                .location(location)
                .build();
        userRepository.save(user);
        return user;
    }
}
