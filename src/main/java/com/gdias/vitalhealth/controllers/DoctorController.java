package com.gdias.vitalhealth.controllers;


import com.gdias.vitalhealth.DTO.DoctorListDTO;
import com.gdias.vitalhealth.DTO.DoctorRegisterDTO;
import com.gdias.vitalhealth.DTO.DoctorUpdateDTO;
import com.gdias.vitalhealth.services.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/v1/doctors")
public class DoctorController {

    private final DoctorService service;

    @Autowired
    public DoctorController(DoctorService service) {
        this.service = service;
    }

    //    @RequestMapping(value = "v1/doctors", method = RequestMethod.GET)
    @GetMapping
    public Page<DoctorListDTO> listDoctors(@PageableDefault(size = 15) Pageable pageable) {
        return service.getDoctorList(pageable);
    }

    @GetMapping("v1/doctors/{id}")
    public void getDoctor(@PathVariable Long id) {
        service.getDoctor(id);
    }


    //    @RequestMapping(value = "v1/doctors", method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<DoctorRegisterDTO> registerDoctor(@RequestBody @Valid DoctorRegisterDTO doctorRegisterDTO,
                                                            UriComponentsBuilder uriComponentsBuilder) {
        return service.registerDoctor(doctorRegisterDTO, uriComponentsBuilder);
    }


    //    @RequestMapping(value = "v1/doctors/{id}", method = RequestMethod.PUT)
    @PutMapping("v1/doctors/{id}")
    public void updateDoctor(@PathVariable Long id,
                             @RequestBody DoctorUpdateDTO doctorUpdateDTO) {
        service.updateDoctor(id, doctorUpdateDTO);
    }


}
