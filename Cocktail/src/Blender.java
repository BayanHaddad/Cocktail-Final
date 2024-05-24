/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
class Blender {
    private int capacity;
    private List<Ingredient> ingredients;
    private Logger logger;

    public Blender(int capacity, Logger logger) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
        this.logger = logger;
    }

    public void addIngredient(Ingredient ingredient) throws Exception {
        int totalVolume = 0;
        for (Ingredient i : ingredients) {
            totalVolume += i.getVolume();
        }
        if (totalVolume + ingredient.getVolume() > capacity) {
            throw new Exception("Blender capacity exceeded.");
        }
        ingredients.add(ingredient);
        logger.log("Added ingredient: " + ingredient.getInfo());
    }

    public Cocktail blend() {
        int totalCalories = 0;
        int[] totalColor = new int[3];
        int totalVolume = 0;
        for (Ingredient i : ingredients) {
            totalCalories += i.getCalories();
            totalColor[0] += i.getColor()[0];
            totalColor[1] += i.getColor()[1];
            totalColor[2] += i.getColor()[2];
            totalVolume += i.getVolume();
        }
        Cocktail cocktail = new Cocktail(totalCalories, totalVolume, totalColor);
        logger.log("Blended cocktail: " + cocktail.getInfo());
        ingredients.clear();
        return cocktail;
    }

    public String getInfo() {
        return "Blender capacity: " + capacity;
    }
}