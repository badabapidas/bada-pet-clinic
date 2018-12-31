package com.sag.bada.badapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sag.bada.badapetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

	Owner findByLastName(String lastName);

}
