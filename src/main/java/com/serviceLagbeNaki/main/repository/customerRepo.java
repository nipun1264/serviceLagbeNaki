package com.serviceLagbeNaki.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serviceLagbeNaki.main.model.customer;

@Repository
public interface customerRepo extends JpaRepository<customer, Integer>{

}
