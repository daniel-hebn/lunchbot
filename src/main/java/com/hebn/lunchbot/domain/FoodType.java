package com.hebn.lunchbot.domain;

/**
 * Created by hebn on 2016-04-07.
 */
public enum FoodType {
    KOREAN("한식"), WESTERN("양식"), CHINESE("중식"), JAPANESE("일식"), ETC("기타");

    private final String description;

    FoodType(String description) {
        this.description = description;
    }

    public static FoodType valueOf(int value) {
        switch(value) {
            case 1: return FoodType.KOREAN;
            case 2: return FoodType.WESTERN;
            case 3: return FoodType.CHINESE;
            case 4: return FoodType.JAPANESE;
            case 5: return FoodType.ETC;
            default: throw new IllegalArgumentException("Unknown Food Type value :" + value);
        }
    }

    public String getDescription() {
        return description;
    }
}
