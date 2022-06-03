package com.init.Jobarcelona.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="player")
public class Player {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Id
    private Long id;
    @Column(name="reference")
    private int reference;
    @Column(name="age")
    private int age;
    @Column(name="nation")
    private String nation;
    @Column(name="league")
    private String league;
    @Column(name="team")
    private String team;
    @Column(name="goals_selection")
    private int goalsSelection;
    @Column(name="selections_nation")
    private int SelectionsNation;
    @Column(name="position")
    private String position;
    @Column(name="price")
    private int price;
    @OneToOne
    @JoinColumn(name = "champ_id")
    private Champ champ;
    @OneToOne
    @JoinColumn(name = "cup_id")
    private Cup cup;
    @OneToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;
}
