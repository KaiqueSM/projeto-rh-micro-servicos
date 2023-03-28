package com.devsuperior.hrworker.resources;

import com.devsuperior.hrworker.entities.Workers;
import com.devsuperior.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Workers>> findAll() {
        return ResponseEntity.ok(workerRepository.findAll());
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Workers> findById(@PathVariable Long id) {
        return ResponseEntity.ok(workerRepository.findById(id).get());
    }

}
