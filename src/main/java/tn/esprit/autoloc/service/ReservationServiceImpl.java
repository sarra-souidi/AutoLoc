package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.ReservationRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository RR;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) RR.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return RR.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return RR.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return RR.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(Long idReservation) {
        RR.deleteById(idReservation);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return (List<Reservation>) RR.saveAll(reservations);
    }
}