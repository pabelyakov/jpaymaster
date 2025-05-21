package ru.t3adog.paymaster.bill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.t3adog.paymaster.bill.entities.PositionEntity;

public interface PositionRepository extends JpaRepository<PositionEntity, Long> {
}
