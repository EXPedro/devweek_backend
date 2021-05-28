package com.project.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

/***********************************************************
 * controller é onde fica a camada responsável pelas API's *
 * model ficam tanto os dados a serem transacionados no BD,*
 * repository is where the DB manipulation occurs          *
 * quanto os que serão recebidos através de um requisição  *
 * o dto é camada que vai interagir com controlador        *
 ***********************************************************/

@Entity     //something that reflects a DB table
@Table(name = "tb_stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)     //use when autoincrement is not at the DB
                                                        //when at the DB use "GenerationType.IDENTITY
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "variation")
    private Double variation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }
}
