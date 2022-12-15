package com.gdias.vitalhealth.entities;

import com.gdias.vitalhealth.DTO.AddressDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Column(name = "street_suffix")
    private String streetSuffix;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "street_number")
    private String streetNumber;
    @Column(name = "postal_code")
    private String postalCode;
    private String state;


    public Address(AddressDTO addressDTO) {
        this.streetSuffix = addressDTO.streetSuffix();
        this.streetName = addressDTO.streetName();
        this.streetNumber = addressDTO.streetNumber();
        this.postalCode = addressDTO.postalCode();
        this.state = addressDTO.state();
    }
}
