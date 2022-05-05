import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Dishes implements List<Dish> {
    private static List<Dish> dishes = new ArrayList<>();
    private static Ingredients ingredients = new Ingredients();

    static {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("availableDishes.txt")))) {
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(";");
                String name = data[0];
                List<Ingredient> tempIngredients = new ArrayList<>();
                for (int i = 1; i < data.length; i++) {
                    if (ingredients.getIngredientByName(data[i]) != null) {
                        tempIngredients.add(ingredients.getIngredientByName(data[i]));
                    }
                }
                dishes.add(new Dish(name, tempIngredients));
//                System.out.print("successfully added dish: "+name+" with ingredients: ");
//                for (Ingredient ingredient : tempIngredients) {
//                    System.out.print(ingredient.getName()+", ");
//                }
//                System.out.print("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public int size() {
        return dishes.size();
    }

    @Override
    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return dishes.contains(o);
    }

    @Override
    public Iterator<Dish> iterator() {
        return dishes.iterator();
    }

    @Override
    public Object[] toArray() {
        return dishes.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Dish dish) {
        return dishes.add(dish);
    }

    @Override
    public boolean remove(Object o) {
        return dishes.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return dishes.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Dish> c) {
        return dishes.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Dish> c) {
        return dishes.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return dishes.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return dishes.retainAll(c);
    }

    @Override
    public void clear() {
        dishes.clear();
    }

    @Override
    public Dish get(int index) {
        return dishes.get(index);
    }

    @Override
    public Dish set(int index, Dish element) {
        return dishes.set(index, element);
    }

    @Override
    public void add(int index, Dish element) {
        dishes.add(index, element);
    }

    @Override
    public Dish remove(int index) {
        return dishes.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return dishes.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return dishes.lastIndexOf(o);
    }

    @Override
    public ListIterator<Dish> listIterator() {
        return dishes.listIterator();
    }

    @Override
    public ListIterator<Dish> listIterator(int index) {
        return dishes.listIterator(index);
    }

    @Override
    public List<Dish> subList(int fromIndex, int toIndex) {
        return dishes.subList(fromIndex, toIndex);
    }
}
