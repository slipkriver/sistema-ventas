package com.sistema.ventas.controller;

import com.sistema.ventas.entities.Detail;
import com.sistema.ventas.entities.Product;
import com.sistema.ventas.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailController {

    @Autowired
    private DetailService service;

    @GetMapping("/detail")
    public  List<Detail> listDetail(){
        return service.listDetail();
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Detail> obtenerDetail(@PathVariable Integer id) {
        try {
            Detail detail = service.getDetailById(id);
            return new ResponseEntity<Detail>(detail, HttpStatus.OK);

        } catch (Exception exception) {
            return new ResponseEntity<Detail>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/detail")
    public void saveDetail(@RequestBody Detail detail) {
        service.saveDetail(detail);
    }
}
