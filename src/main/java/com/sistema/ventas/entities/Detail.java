package com.sistema.ventas.entities;

import javax.persistence.*;
@Entity
public
class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String det_date;
    private String det_product;
    private String det_quantity;

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getDet_date() {
        return det_date;
    }

    public void setDet_date(String det_date) {
        this.det_date = det_date;
    }

    public String getDet_product() {
        return det_product;
    }

    public void setDet_product(String det_product) {
        this.det_product = det_product;
    }

    public String getDet_quantity() {
        return det_quantity;
    }

    public void setDet_quantity(String det_quantity) {
        this.det_quantity = det_quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Detail () {

    }

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Product product;

}
