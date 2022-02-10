package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nama;
    
    @Column(nullable = true)
    private int atasan_id;
    private int company_id;

    public Employee(){

    }
   
   
    


    public long getId() {
        return id;
    }
    public void setId(long l) {
        this.id = l;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getAtasan_id() {
        return atasan_id;
    }
    public void setAtasan_id(int atasan_id) {
        this.atasan_id = atasan_id;
    }
    public int getCompany_id() {
        return company_id;
    }
    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    
    
}
