package ru.t3adog.paymaster.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.t3adog.paymaster.user.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
