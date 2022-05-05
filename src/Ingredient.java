public class Ingredient {
    private final String name;
    private final double protein;
    private final double fat;
    private final double carbohydrates;
    private final double caloriesPer100Gram;
    private final String category;
    private double price;

    public Ingredient(String name, double price, double caloriesPer100Gram, double protein, double fat, double carbohydrates, String category) {
        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.caloriesPer100Gram = caloriesPer100Gram;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getCaloriesPer100Gram() {
        return caloriesPer100Gram;
    }

    public void setPrice(double price) {
        if (price >=0 ) {
            this.price = price;
        }
    }
}
