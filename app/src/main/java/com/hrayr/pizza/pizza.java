package com.hrayr.pizza;

/**
 * Created by hrayr on 26.03.2016.
 */
public class pizza {
    private String name;
    private int imageId;

    public static final pizza[] pizzas = {
            new pizza("Diablo", R.drawable.diablo),
            new pizza("Finghi", R.drawable.funghi)
    };

    private pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
