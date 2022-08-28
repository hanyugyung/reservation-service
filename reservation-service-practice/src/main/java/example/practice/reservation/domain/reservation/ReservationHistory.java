package example.practice.reservation.domain.reservation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "histories")
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ReservationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created-at")
    private ZonedDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated-at")
    private ZonedDateTime updatedAt;

    @NotNull
    @Column(name = "item_code")
    private String itemCode;

    @NotNull
    @Column(name = "reservation-day")
    private String reservationDay;

    @NotNull
    @Column(name = "reservation-start-time")
    private String reservationStartTime;

    @NotNull
    @Column(name = "reservation-end-time")
    private String reservationEndTime;
}
