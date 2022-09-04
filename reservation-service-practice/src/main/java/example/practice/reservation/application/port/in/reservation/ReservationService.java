package example.practice.reservation.application.port.in.reservation;

import example.practice.reservation.application.port.in.reservation.dto.ReservationServiceDto;

import java.util.List;

public interface ReservationService {

    void register();
    List<ReservationServiceDto.ReservationParam> getList();

    void makeReservation();


}
