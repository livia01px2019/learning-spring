package com.livia.petclinic.model;

import java.util.Set;

public class Vet extends Person {

    Set<Specialty> specialities;

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}