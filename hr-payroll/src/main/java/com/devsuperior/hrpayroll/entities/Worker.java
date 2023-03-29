package com.devsuperior.hrpayroll.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Worker implements Serializable {

    private Long id;

    private String name;

    private Double dailyIncome;

    public Worker() {
    }

    public Worker(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }
}
