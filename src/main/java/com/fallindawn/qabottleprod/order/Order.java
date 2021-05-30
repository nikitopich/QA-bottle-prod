package com.fallindawn.qabottleprod.order;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, name = "volume")
    private double volume;

    @Column(nullable = false, name = "company")
    private String company;

    @Column(nullable = false, name = "count")
    private int count;

    public Order() {
    }

    public Order(Long id, double volume, String company, int count) {
        this.id = id;
        this.volume = volume;
        this.company = company;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", volume=" + volume +
                ", company='" + company + '\'' +
                ", count=" + count +
                '}';
    }
}
