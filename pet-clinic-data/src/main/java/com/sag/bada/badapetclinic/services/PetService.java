package com.sag.bada.badapetclinic.services;

import java.util.Set;

import com.sag.bada.badapetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
