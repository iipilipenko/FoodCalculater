import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private String category;

    private List<Ingredient> ingredients;

    public Dish(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients);
    }

    protected List<Ingredient> getIngredients() {
        return new ArrayList<>(this.ingredients);
    }

    public String getName() {
        return name;
    }

    public double getDishCaloriesPer100Gram() {
        double calories = 0;
        if (ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                calories+=ingredient.getCaloriesPer100Gram();
            }
        }
        return calories;
    }





}
