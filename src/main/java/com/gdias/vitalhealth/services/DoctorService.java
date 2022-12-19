package com.gdias.vitalhealth.services;

import com.gdias.vitalhealth.DTO.DoctorListDTO;
import com.gdias.vitalhealth.DTO.DoctorRegisterDTO;
import com.gdias.vitalhealth.DTO.DoctorUpdateDTO;
import com.gdias.vitalhealth.entities.Address;
import com.gdias.vitalhealth.entities.DoctorEntity;
import com.gdias.vitalhealth.repositories.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository repository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.repository = doctorRepository;
    }


    public Page<DoctorListDTO> getDoctorList(Pageable pageable) {
//        Lambda can be replaced with method reference
//        return repository.findAll().stream().map(entity -> new DoctorListDTO(entity)).toList();
//        return repository.findAll().stream().map(DoctorListDTO::new).toList();
        return repository.findAll(pageable).map(DoctorListDTO::new);
    }

    public Optional<DoctorEntity> getDoctor(Long id) {
        return repository.findById(id);
    }


    @Transactional
    public ResponseEntity<DoctorRegisterDTO> registerDoctor(DoctorRegisterDTO doctorRegisterDTO,
                                                            UriComponentsBuilder uriComponentsBuilder) {
        DoctorEntity doctorEntity = new DoctorEntity(doctorRegisterDTO);
        repository.save(doctorEntity);

        URI uri =
                uriComponentsBuilder.path("/v1/doctors/{id}").buildAndExpand(
                        doctorEntity.getId()).toUri();
//        return ResponseEntity.status(HttpStatus.CREATED).body("Doctor Registered.");
        return ResponseEntity.created(uri).body(doctorRegisterDTO);
    }


    @Transactional
    public DoctorEntity updateDoctor(Long id, DoctorUpdateDTO doctorUpdateDTO) {
//        Optional<DoctorEntity> optionalDoctorEntity = repository.findById(id);
//
//        optionalDoctorEntity.ifPresent(doctorEntity -> {
//            doctorEntity.setUsername(doctorUpdateDTO.username());
//            doctorEntity.setEmail(doctorUpdateDTO.email());
//            doctorEntity.setActiveStatus(doctorUpdateDTO.activeStatus());
//            doctorEntity.setAddress(new Address(doctorUpdateDTO.address()));
//
//        });
//        DoctorEntity doctorEntity = optionalDoctorEntity.orElse(null);

        DoctorEntity doctorEntity = repository.getReferenceById(id);

        doctorEntity.setUsername(doctorUpdateDTO.username());
        doctorEntity.setEmail(doctorUpdateDTO.email());
        doctorEntity.setActiveStatus(doctorUpdateDTO.activeStatus());
        doctorEntity.setAddress(new Address(doctorUpdateDTO.address()));

        return doctorEntity;
    }
}
