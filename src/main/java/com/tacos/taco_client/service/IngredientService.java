package com.tacos.taco_client.service;

import org.springframework.stereotype.Service;

import com.tacos.taco_client.models.Ingredient;

@Service
public interface IngredientService {
  public Iterable<Ingredient> findAll();

  public Ingredient addIngredient(Ingredient ingredient);
}
