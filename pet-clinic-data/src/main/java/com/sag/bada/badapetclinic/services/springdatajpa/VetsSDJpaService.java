package com.sag.bada.badapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sag.bada.badapetclinic.model.Vet;
import com.sag.bada.badapetclinic.repositories.VetRepository;
import com.sag.bada.badapetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetsSDJpaService implements VetService {

	private final VetRepository vetRepository;

	public VetsSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<Vet>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);

	}

}
