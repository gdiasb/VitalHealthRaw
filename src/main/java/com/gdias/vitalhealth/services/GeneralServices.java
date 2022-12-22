package com.gdias.vitalhealth.services;

import org.springframework.http.ResponseEntity;

public interface GeneralServices {

    public ResponseEntity getAllEntities();

    public ResponseEntity getEntity(Long id);

    public ResponseEntity updateEntity(Long id);

    public ResponseEntity inactiveEntity(Long id);
}
