package com.sag.bada.badapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sag.bada.badapetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
