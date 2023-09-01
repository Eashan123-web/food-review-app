package com.foodreview.foodreviewapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.foodreview.foodreviewapp.models.Reviewmodel;

public interface Reviewrepository extends CrudRepository<Reviewmodel, Long>
{
    Reviewmodel findById(String id);
}