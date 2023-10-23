package org.sdia.costumerservice.repository;

import org.sdia.costumerservice.entities.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CostumerRepository extends JpaRepository<Costumer,Long> {

}
