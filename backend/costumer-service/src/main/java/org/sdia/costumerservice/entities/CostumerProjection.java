package org.sdia.costumerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCostumer",types = Costumer.class)
public interface CostumerProjection {
    public Long getId();
    public String getName();
    public String getEmail();
}