package example.practice.reservation.domain.reservation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

/**
 * 예약 정보
 */
@Entity
@Table(name = "reservation_info")
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ReservationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    /**
     * 예약 아이템
     */
    @NotNull
    @Column(name = "item_code")
    private String itemCode;

    /**
     * 예약 가능 건수
     */
    @NotNull
    @Column(name = "possible_count")
    private Integer possibleCount;

    /**
     * 예약 시작 시간
     */
    @NotNull
    @Column(name = "start_time")
    private String startTime;

    /**
     * 예약 종료 시간
     */
    @NotNull
    @Column(name = "end_time")
    private String endTime;

}
