package com.sag.bada.badapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sag.bada.badapetclinic.model.Owner;
import com.sag.bada.badapetclinic.repositories.OwnerRepository;
import com.sag.bada.badapetclinic.repositories.PetRepository;
import com.sag.bada.badapetclinic.repositories.PetTypeRepository;
import com.sag.bada.badapetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepositoy;
	private final PetTypeRepository petTypeRepositoy;
	private final PetRepository petRepositoy;

	public OwnerSDJpaService(OwnerRepository ownerRepositoy, PetTypeRepository petTypeRepositoy,
			PetRepository petRepositoy) {
		this.ownerRepositoy = ownerRepositoy;
		this.petTypeRepositoy = petTypeRepositoy;
		this.petRepositoy = petRepositoy;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<Owner>();
		ownerRepositoy.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepositoy.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepositoy.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepositoy.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepositoy.deleteById(id);

	}

	@Override
	public Owner findByLastName(String lasstName) {
		return ownerRepositoy.findByLastName(lasstName);
	}

}
