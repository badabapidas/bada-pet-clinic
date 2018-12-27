package com.sag.bada.badapetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sag.bada.badapetclinic.model.Owner;
import com.sag.bada.badapetclinic.model.Vet;
import com.sag.bada.badapetclinic.services.OwnerService;
import com.sag.bada.badapetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	private final VetService vetService;

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Bapi");
		owner1.setLastName("Das");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Umar");
		owner2.setLastName("BaBa");

		ownerService.save(owner2);

		System.out.println("Loaded Owners....");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sandeep");
		vet1.setLastName("Sharma");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Anuj");
		vet2.setLastName("Baruah");

		vetService.save(vet2);

		System.out.println("Loaded Vets....");

	}

}
