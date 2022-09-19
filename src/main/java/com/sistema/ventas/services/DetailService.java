package com.sistema.ventas.services;

import com.sistema.ventas.entities.Detail;
import com.sistema.ventas.repositories.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {

    @Autowired
    private DetailRepository repository;

    public List<Detail> listDetail() {
        return repository.findAll();
    }

    public void saveDetail(Detail detail){
        repository.save(detail);
    }

    public Detail getDetailById(Integer id){
        return repository.findById(id).get();
    }
}
