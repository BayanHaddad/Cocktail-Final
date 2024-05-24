/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktail;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Microsoft
 */
class Cocktail {
    private int calories;
    private int volume;
    private int[] color;

    public Cocktail(int calories, int volume, int[] color) {
        this.calories = calories;
        this.volume = volume;
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public int getVolume() {
        return volume;
    }

    public int[] getColor() {
        return color;
    }

    public String getInfo() {
        return "Cocktail: Calories: " + calories + ", Volume: " + volume + ", Color: [" + color[0] + ", " + color[1] + ", " + color[2] + "]";
    }
}
