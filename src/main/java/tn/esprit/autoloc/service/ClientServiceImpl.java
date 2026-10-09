package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IclientService {

    private final ClientRepository CR;

    @Override
    public List<Client> retrieveAllClients() {
        return (List<Client>) CR.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return CR.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return CR.save(c);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return CR.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        CR.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return (List<Client>) CR.saveAll(clients);
    }
}