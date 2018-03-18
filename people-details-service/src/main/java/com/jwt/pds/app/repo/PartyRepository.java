package com.jwt.pds.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.jwt.pds.app.entity.Party;

public interface PartyRepository extends CrudRepository<Party, Long> {

}
