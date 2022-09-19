package com.sistema.ventas.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
/*
    @GeneratedValue(strategy = GenerationType.IDENTITY)
*/
    private Integer id;
    private  String pro_name;
    private  String pro_descr;
    private  String pro_image;
    private  String pro_price;

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_descr() {
        return pro_descr;
    }

    public void setPro_descr(String pro_descr) {
        this.pro_descr = pro_descr;
    }

    public String getPro_image() {
        return pro_image;
    }

    public void setPro_image(String pro_image) {
        this.pro_image = pro_image;
    }

    public String getPro_price() {
        return pro_price;
    }

    public void setPro_price(String pro_price) {
        this.pro_price = pro_price;
    }

    public Set<Detail> getDetails(){
        return details;
    }

    public void setDetails(Set<Detail> details) {
        this.details = details;
    }

    public Product(Integer id, String pro_name, String pro_descr, String pro_image, String pro_price, Set<Detail> details) {
        this.id = id;
        this.pro_name = pro_name;
        this.pro_descr = pro_descr;
        this.pro_image = pro_image;
        this.pro_price = pro_price;
        this.details = details;
    }

    public Product () {

    }


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Detail> details = new HashSet<>();

}
