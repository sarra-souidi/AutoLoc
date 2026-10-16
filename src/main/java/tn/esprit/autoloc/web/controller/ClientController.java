package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.service.IclientService;
import tn.esprit.autoloc.domain.Client; //

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Client")
public class ClientController {

    private final IclientService iclient;

    @PostMapping("/AddClient")
    public Client AddClient(@RequestBody Client c) {
        return iclient.addClient(c);
    }
    @GetMapping("/GetClient")
    public List<Client> getClient(){
        return iclient.retrieveAllClients();
    }
    @DeleteMapping("/DeleteClient/{id}")
    public void DeleteClient(@PathVariable Long id){
        iclient.removeClient(id);
    }

    @PostMapping("/addAllClient")
    public List<Client> addAllClient(@RequestBody List<Client> ListeClient){
        return iclient.addClients(ListeClient);
    }



}