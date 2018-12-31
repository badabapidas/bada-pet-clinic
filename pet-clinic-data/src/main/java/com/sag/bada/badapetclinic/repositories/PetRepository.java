package com.sag.bada.badapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sag.bada.badapetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
