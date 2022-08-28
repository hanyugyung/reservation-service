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
@Table(name = "schedules")
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ReservationSchedule {

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
    @Column(name = "business-day")
    private Integer businessDay;

    @NotNull
    @Column(name = "possible-number")
    private Integer possibleNumber;

    @NotNull
    @Column(name = "start-time")
    private String startTime;

    @NotNull
    @Column(name = "end-time")
    private String endTime;

}
