package com.devsuperior.hrworker.repositories;

import com.devsuperior.hrworker.entities.Workers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Workers, Long> {
}
