package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository ER;

    @Override
    public List<Equipement> retrieveAllEquipements() {
        return (List<Equipement>) ER.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return ER.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return ER.save(e);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return ER.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        ER.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return (List<Equipement>) ER.saveAll(equipements);
    }
}