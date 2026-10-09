package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository ER;

    @Override
    public List<Employe> retrieveAllEmployes() {
        return (List<Employe>) ER.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return ER.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return ER.save(e);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {
        return ER.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        ER.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {
        return (List<Employe>) ER.saveAll(employes);
    }
}