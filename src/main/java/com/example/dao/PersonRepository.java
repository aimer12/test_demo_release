package com.example.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/2/12.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    Page<Person> findAll(Pageable pageable );

    List<Person> findAllByOrderByIdAsc();

}
