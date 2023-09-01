package com.foodreview.foodreviewapp.repository;

import org.springframework.data.domain.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import com.foodreview.foodreviewapp.models.Reviewmodellite;

public interface Reviewliterepository extends CrudRepository<Reviewmodellite, Long>, QueryByExampleExecutor<Reviewmodellite>
{
    Page<Reviewmodellite> findAll(Pageable paging);
}