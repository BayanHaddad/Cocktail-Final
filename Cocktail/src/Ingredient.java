/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
class Ingredient {
    private String name;
    private int calories;
    private int volume;
    private int[] color;

    public Ingredient(String name, int calories, int volume, int[] color) {
        this.name = name;
        this.calories = calories;
        this.volume = volume;
        this.color = color;
    }

    public String getInfo() {
        return "Ingredient: " + name + ", Calories: " + calories + ", Volume: " + volume + ", Color: [" + color[0] + ", " + color[1] + ", " + color[2] + "]";
    }
}
