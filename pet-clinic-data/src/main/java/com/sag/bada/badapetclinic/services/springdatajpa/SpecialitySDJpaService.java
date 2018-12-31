package com.sag.bada.badapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sag.bada.badapetclinic.model.Speciality;
import com.sag.bada.badapetclinic.repositories.SpecialityRepository;
import com.sag.bada.badapetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

	private final SpecialityRepository specialityRepo;

	public SpecialitySDJpaService(SpecialityRepository specialityRepo) {
		this.specialityRepo = specialityRepo;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<Speciality>();
		specialityRepo.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepo.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		return specialityRepo.save(object);
	}

	@Override
	public void delete(Speciality object) {
		specialityRepo.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepo.deleteById(id);

	}

}
