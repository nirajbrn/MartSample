package com.android.ahivaran.redmart.utils;

import com.android.ahivaran.redmart.R;

import java.util.Random;

public class RandomColor {
    public static int getRandomColor() {
        int randomColorArray[] = {R.color.first_color, R.color.second_color,
                R.color.third_color, R.color.random_color};
        return randomColorArray[new Random().nextInt(randomColorArray.length - 1)];
    }
}
