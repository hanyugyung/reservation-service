package example.practice.reservation.application.service.reservation;

import example.practice.reservation.application.port.in.reservation.ReservationService;
import example.practice.reservation.application.port.in.reservation.dto.ReservationServiceDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Override
    public void register() {
        
    }

    @Override
    public List<ReservationServiceDto.ReservationParam> getList() {
        return null;
    }

    @Override
    public void makeReservation() {

    }
}
