package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaiementRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository PR;

    @Override
    public List<Paiement> retrieveAllPaiements() {
        return (List<Paiement>) PR.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement p) {
        return PR.save(p);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return PR.save(p);
    }

    @Override
    public Paiement retrievePaiement(Long idPaiement) {
        return PR.findById(idPaiement).orElse(null);
    }

    @Override
    public void removePaiement(Long idPaiement) {
        PR.deleteById(idPaiement);
    }

    @Override
    public List<Paiement> addPaiements(List<Paiement> paiements) {
        return (List<Paiement>) PR.saveAll(paiements);
    }
}