package com.gdias.vitalhealth.services;

import com.gdias.vitalhealth.DTO.DoctorListDTO;
import com.gdias.vitalhealth.DTO.DoctorRegisterDTO;
import com.gdias.vitalhealth.DTO.DoctorUpdateDTO;
import com.gdias.vitalhealth.domain.Address;
import com.gdias.vitalhealth.domain.DoctorEntity;
import com.gdias.vitalhealth.repositories.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class DoctorService {

    private final DoctorRepository repository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.repository = doctorRepository;
    }


    public ResponseEntity<Page<DoctorListDTO>> getDoctorList(Pageable pageable) {
//        Lambda can be replaced with method reference
//        return repository.findAll().stream().map(entity -> new DoctorListDTO(entity)).toList();
//        return repository.findAll().stream().map(DoctorListDTO::new).toList();

        Page responseBody = repository.findAll(pageable).map(DoctorListDTO::new);
        return ResponseEntity.ok().body(responseBody);
    }


    public ResponseEntity<DoctorListDTO> getDoctor(Long id) {
//        Optional<DoctorEntity> optionalDoctorEntity = repository.findById(id);
//
//        if (optionalDoctorEntity.isPresent()) {
//            DoctorEntity doctorEntity = optionalDoctorEntity.get();
//            DoctorListDTO doctorListDTO = new DoctorListDTO(doctorEntity);
//            return ResponseEntity.ok().body(doctorListDTO);
//        }
//
//        return ResponseEntity.notFound().build();

        DoctorEntity doctorEntity = repository.getReferenceById(id);
        DoctorListDTO doctorListDTO = new DoctorListDTO(doctorEntity);
        return ResponseEntity.ok().body(doctorListDTO);
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
    public ResponseEntity<DoctorUpdateDTO> updateDoctor(Long id, DoctorUpdateDTO doctorUpdateDTO) {
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

//        DoctorEntity doctorEntity = repository.getReferenceById(id);

//        Optional<DoctorEntity> optionalDoctorEntity = repository.findById(id);
//
//        if (optionalDoctorEntity.isPresent()) {
//            DoctorEntity doctorEntity = optionalDoctorEntity.get();
//            doctorEntity.setUsername(doctorUpdateDTO.username());
//            doctorEntity.setEmail(doctorUpdateDTO.email());
//            //        doctorEntity.setActiveStatus(!doctorEntity.getActiveStatus());
//            doctorEntity.setAddress(new Address(doctorUpdateDTO.address()));
//
//            return ResponseEntity.ok().body(doctorUpdateDTO);
//        }
//
//        return ResponseEntity.notFound().build();

        DoctorEntity doctorEntity = repository.getReferenceById(id);
        doctorEntity.setUsername(doctorUpdateDTO.username());
        doctorEntity.setEmail(doctorUpdateDTO.email());
        doctorEntity.setAddress(new Address(doctorUpdateDTO.address()));
        return ResponseEntity.ok().body(doctorUpdateDTO);
    }

    // TODO: Investigar porque não atualiza no banco de dados
    public ResponseEntity inactiveEntity(Long id) {
//        Optional<DoctorEntity> optionalDoctorEntity = repository.findById(id);
//
//        if (optionalDoctorEntity.isPresent()) {
//            DoctorEntity doctorEntity = optionalDoctorEntity.get();
//            doctorEntity.setInactiveStatus();
//
//            return ResponseEntity.ok().body("Set user inactive");
//        }
//        return ResponseEntity.notFound().build();

        DoctorEntity doctorEntity = repository.getReferenceById(id);
        doctorEntity.setInactiveStatus();

        return ResponseEntity.noContent().build();
    }
}
