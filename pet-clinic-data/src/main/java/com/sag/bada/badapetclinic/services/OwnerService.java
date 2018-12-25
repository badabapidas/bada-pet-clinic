package com.sag.bada.badapetclinic.services;

import java.util.Set;

import com.sag.bada.badapetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lasstName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();

}
