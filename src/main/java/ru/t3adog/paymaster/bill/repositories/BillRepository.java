package ru.t3adog.paymaster.bill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.t3adog.paymaster.bill.entities.BillEntity;

public interface BillRepository extends JpaRepository<BillEntity, Long> {
}
