package com.hebn.lunchbot.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by hebn on 2016-04-07.
 */
@Data
@EqualsAndHashCode(of = "id")
@Entity
public class FoodMenu {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "FOOD_COURT_ID")
    private FoodCourt foodCourt;

}
