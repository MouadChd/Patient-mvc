package com.emsi.patientmvc.repositories;

import com.emsi.patientmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient,Long> {
    Page<Patient> findByNomContains(String keyword, PageRequest of);
}
