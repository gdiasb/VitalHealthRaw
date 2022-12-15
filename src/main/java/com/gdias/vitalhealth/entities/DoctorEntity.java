package com.gdias.vitalhealth.entities;

import com.gdias.vitalhealth.DTO.DoctorRegisterDTO;
import com.gdias.vitalhealth.common.DoctorSpecialty;
import jakarta.persistence.*;


@Entity
@Table(name = "doctor_table")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Column(name = "active")
    private int activeStatus;
    @Column(name = "full_name")
    private String fullName;
    private String email;
    private String gender;
    @Column(name = "doctor_specialty")
    @Enumerated(EnumType.STRING)
    private DoctorSpecialty doctorSpecialty;

    @Column(name = "doctor_license")
    private String doctorLicense;
    @Embedded
    private Address address;

    public DoctorEntity(DoctorRegisterDTO doctorRegisterDTO) {
        this.username = doctorRegisterDTO.username();
        this.activeStatus = doctorRegisterDTO.activeStatus();
        this.fullName = doctorRegisterDTO.fullName();
        this.email = doctorRegisterDTO.email();
        this.gender = doctorRegisterDTO.gender();
        this.doctorSpecialty = doctorRegisterDTO.doctorSpecialty();
        this.doctorLicense = doctorRegisterDTO.doctorLicense();
        this.address = new Address(doctorRegisterDTO.address());
    }

    public DoctorEntity() {
    }

    public DoctorEntity(Long id, String username, int activeStatus, String fullName, String email, String gender, DoctorSpecialty doctorSpecialty, String doctorLicense, Address address) {
        this.id = id;
        this.username = username;
        this.activeStatus = activeStatus;
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
        this.doctorSpecialty = doctorSpecialty;
        this.doctorLicense = doctorLicense;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getActiveStatus() {
        return activeStatus;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public DoctorSpecialty getDoctorSpecialty() {
        return doctorSpecialty;
    }

    public String getDoctorLicense() {
        return doctorLicense;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoctorEntity that = (DoctorEntity) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
