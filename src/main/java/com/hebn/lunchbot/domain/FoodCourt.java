package com.hebn.lunchbot.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hebn on 2016-04-07.
 */
@Data
@EqualsAndHashCode(of = "id")
@Entity
public class FoodCourt {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private FoodType foodType;

    @OneToMany(mappedBy = "foodCourt")
    private List<FoodMenu> foodMenuList = new ArrayList<FoodMenu>();

    private String locationUrl;
}
