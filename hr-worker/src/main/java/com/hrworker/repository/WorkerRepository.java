package com.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
