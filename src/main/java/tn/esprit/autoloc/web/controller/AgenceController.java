
package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping("/AddAgence")
    public Agence AddAgence(@RequestBody Agence a) {
        return agenceService.addAgence(a);
    }

    @GetMapping("/GetAgence")
    public List<Agence> getAgence() {
        return agenceService.retrieveAllAgences();
    }

    @DeleteMapping("/DeleteAgence/{id}")
    public void DeleteAgence(@PathVariable Long id) {
        agenceService.removeAgence(id);
    }

    @PostMapping("/addAllAgence")
    public List<Agence> addAllAgence(@RequestBody List<Agence> listeAgence) {
        return agenceService.addAgences(listeAgence);
    }
}
