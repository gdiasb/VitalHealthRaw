package com.gdias.vitalhealth.controllers;


import com.gdias.vitalhealth.DTO.DoctorListDTO;
import com.gdias.vitalhealth.DTO.DoctorRegisterDTO;
import com.gdias.vitalhealth.DTO.DoctorUpdateDTO;
import com.gdias.vitalhealth.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(name = "v1/doctors")
public class DoctorController {

    private final DoctorService service;

    @Autowired
    public DoctorController(DoctorService service) {
        this.service = service;
    }

    //    @RequestMapping(value = "v1/doctors", method = RequestMethod.GET)
    @GetMapping
    public List<DoctorListDTO> listDoctors() {
        return service.getDoctorList();
    }

    //    @RequestMapping(value = "v1/doctors", method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<DoctorRegisterDTO> registerDoctor(@RequestBody DoctorRegisterDTO doctorRegisterDTO, UriComponentsBuilder uriComponentsBuilder) {
        return service.registerDoctor(doctorRegisterDTO, uriComponentsBuilder);
    }

    @RequestMapping(value = "v1/doctors/{id}", method = RequestMethod.PUT)
    public void updateDoctor(@PathVariable Long id,
                             @RequestBody DoctorUpdateDTO doctorUpdateDTO) {
        service.updateDoctor(id, doctorUpdateDTO);
    }

}
