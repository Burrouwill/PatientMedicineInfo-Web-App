package com.example.demo.Services;

import com.example.demo.Models.Drug;
import com.example.demo.Repositories.DrugRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DrugService {

    private final DrugRepository drugRepository;

    @Autowired
    public DrugService(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    @Transactional
    public List<Drug> getDrugs() {
        return drugRepository.findAll();
    }
}
