public class Main {

    private static Dishes dishes = new Dishes();

    public static void main(String[] args) {
        System.out.println(" end ");
        for (Dish dish: dishes) {
            int caloriesPer100Gram=0;
            for (Ingredient ingredient: dish.getIngredients()) {
                caloriesPer100Gram+=ingredient.getCaloriesPer100Gram();
            }
            System.out.println(dish.getName()+" has "+caloriesPer100Gram+" calories per 100 gram");
        }
    }
}
