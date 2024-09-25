package com.devoirjava.services;

import com.devoirjava.core.repository.interfaces.Repository;
import com.devoirjava.data.entities.Medecin;

public class MedecinServ {
    private final Repository<Medecin> MedRepository;

    public MedecinServ(Repository<Medecin> medRepository) {
        MedRepository = medRepository;
    }
    public void CreateMedecin(Medecin medecin){
        MedRepository.add(medecin);
    }

}
