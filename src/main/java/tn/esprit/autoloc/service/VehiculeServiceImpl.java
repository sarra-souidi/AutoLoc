package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository VR;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) VR.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return VR.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return VR.save(v);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {
        return VR.findById(idVehicule).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        VR.deleteById(idVehicule);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {
        return (List<Vehicule>) VR.saveAll(vehicules);
    }
}