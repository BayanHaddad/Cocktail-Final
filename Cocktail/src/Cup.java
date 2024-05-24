/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
class Cup {
    private int capacity;
    private Cocktail cocktail;

    public Cup(int capacity) {
        this.capacity = capacity;
    }

    public void fillCup(Cocktail cocktail, Logger logger) throws Exception {
        if (cocktail.getVolume() > capacity) {
            throw new Exception("Cup capacity exceeded.");
        }
        this.cocktail = cocktail;
        logger.log("Filled cup with cocktail: " + cocktail.getInfo());
    }

    public String getInfo() {
        if (cocktail == null) {
            return "Empty cup with capacity: " + capacity;
        } else {
            return "Cup: Capacity: " + capacity + ", Cocktail: " + cocktail.getInfo();
        }
    }
}
