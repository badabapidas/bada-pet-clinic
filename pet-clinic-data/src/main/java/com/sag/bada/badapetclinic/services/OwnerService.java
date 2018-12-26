package com.sag.bada.badapetclinic.services;

import com.sag.bada.badapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lasstName);

}
