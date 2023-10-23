package org.sdia.orderservice.services;

import org.sdia.orderservice.model.Costumer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "costumer-service", url = "http://localhost:9999/costumer-service")
public interface CostumerRestClientService {
    @GetMapping("/costumers/{id}?projection=fullCostumer")
    public Costumer customerById(@PathVariable Long id);
    @GetMapping("/costumers?projection=fullCostumer")
    public PagedModel<Costumer> allCustomers();
}