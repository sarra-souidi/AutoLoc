
package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Vehicule")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping("/AddVehicule")
    public Vehicule AddVehicule(@RequestBody Vehicule v) {
        return vehiculeService.addVehicule(v);
    }

    @GetMapping("/GetVehicule")
    public List<Vehicule> getVehicule() {
        return vehiculeService.retrieveAllVehicules();
    }

    @DeleteMapping("/DeleteVehicule/{id}")
    public void DeleteVehicule(@PathVariable Long id) {
        vehiculeService.removeVehicule(id);
    }

    @PostMapping("/addAllVehicule")
    public List<Vehicule> addAllVehicule(
            @RequestBody List<Vehicule> listeVehicule) {
        return vehiculeService.addVehicules(listeVehicule);
    }
}
