package ru.t3adog.paymaster.user.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.t3adog.paymaster.user.entities.UserEntity;
import ru.t3adog.paymaster.user.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return this.userRepository.findAll();
    }

}
