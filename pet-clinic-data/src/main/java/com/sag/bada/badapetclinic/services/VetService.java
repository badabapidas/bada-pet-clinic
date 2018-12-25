package com.sag.bada.badapetclinic.services;

import java.util.Set;

import com.sag.bada.badapetclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet pet);

	Set<Vet> findAll();
}
