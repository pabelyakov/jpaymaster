package ru.t3adog.paymaster.bill.entities;

import jakarta.persistence.*;
import lombok.*;
import ru.t3adog.paymaster.bill.enums.BillState;

import java.time.Instant;

@Entity
@Data
@Table(name = "bills")
@RequiredArgsConstructor
public class BillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "chat_id")
    private Long chatId;

    @Enumerated(EnumType.STRING)
    private BillState state;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;
}
