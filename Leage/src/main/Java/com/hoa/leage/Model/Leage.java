package com.hoa.leage.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leage")
public class Leage {
    @Id
    @Column(name = "leage_id")
    private int id;

    @Column(name = "leage_name")
    private String name;

    @Column(name = "logo")
    private String logo;

    @Column(name = "prize")
    private int prize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }


}
