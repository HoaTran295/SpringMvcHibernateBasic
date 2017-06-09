package com.hoa.leage.Model;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @Column(name = "team_id")
    private int id;

    @Column(name = "team_name")
    private String name;

    @Column(name = "numberofwin")
    private int numberofwin;

    @Column(name = "numberoflost")
    private int numberoflost;

    @Column(name = "numberofdraw")
    private int numberofdraw;

    @Column(name = "score")
    private int score;

    @Column(name = "logo")
    private String logo;

    @ManyToOne
    @JoinColumn(name = "leage_leage_id")
    private int leageId;

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

    public int getNumberofwin() {
        return numberofwin;
    }

    public void setNumberofwin(int numberofwin) {
        this.numberofwin = numberofwin;
    }

    public int getNumberoflost() {
        return numberoflost;
    }

    public void setNumberoflost(int numberoflost) {
        this.numberoflost = numberoflost;
    }

    public int getNumberofdraw() {
        return numberofdraw;
    }

    public void setNumberofdraw(int numberofdraw) {
        this.numberofdraw = numberofdraw;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getLeageId() {
        return leageId;
    }

    public void setLeageId(int leageId) {
        this.leageId = leageId;
    }
}
