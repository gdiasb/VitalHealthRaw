package com.gdias.vitalhealth.services;

import com.gdias.vitalhealth.DTO.DoctorListDTO;
import com.gdias.vitalhealth.DTO.DoctorRegisterDTO;
import com.gdias.vitalhealth.DTO.DoctorUpdateDTO;
import com.gdias.vitalhealth.entities.DoctorEntity;
import com.gdias.vitalhealth.repositories.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository repository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.repository = doctorRepository;
    }


    public List<DoctorListDTO> getDoctorList() {
//        Lambda can be replaced with method reference
//        return repository.findAll().stream().map(entity -> new DoctorListDTO(entity)).toList();
        return repository.findAll().stream().map(DoctorListDTO::new).toList();
    }


    @Transactional
    public ResponseEntity<DoctorRegisterDTO> registerDoctor(DoctorRegisterDTO doctorRegisterDTO, UriComponentsBuilder uriComponentsBuilder) {
        DoctorEntity doctorEntity = new DoctorEntity(doctorRegisterDTO);
        repository.save(doctorEntity);

        URI uri =
                uriComponentsBuilder.path("/{id}").buildAndExpand(doctorEntity.getId()).toUri();
//        return ResponseEntity.status(HttpStatus.CREATED).body("Doctor Registered.");
        return ResponseEntity.created(uri).body(doctorRegisterDTO);
    }


    @Transactional
    public void updateDoctor(Long id, DoctorUpdateDTO doctorUpdateDTO) {
        Optional<DoctorEntity> optionalDoctorEntity = repository.findById(id);
        optionalDoctorEntity.ifPresent(doctorEntity -> {

        });
//        DoctorEntity doctorEntity = optionalDoctorEntity.orElse(null);

        DoctorEntity doctorEntity = repository.getReferenceById(id);

    }
}
