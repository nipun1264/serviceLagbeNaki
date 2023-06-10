package com.serviceLagbeNaki.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serviceLagbeNaki.main.model.serviceProvider;

@Repository
public interface serviceProviderRepo extends JpaRepository<serviceProvider, Integer>{

}
