package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.EPICs;

public interface EPICsRepository extends JpaRepository<EPICs, Integer>  {

}
