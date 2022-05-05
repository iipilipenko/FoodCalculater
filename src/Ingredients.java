import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
// в файле availableIngredients.txt хранится перечень доступных ингридиентов для меню
//в формате -->  название;цена;каллории;белки;жиры;углеводы

public class Ingredients implements List<Ingredient> {
    private static List<Ingredient> ingredients = new ArrayList<>();

    static {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("availableIngredients.txt")))) {
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(";");
                String name = data[0];
                double price = Double.parseDouble(data[1]);
                double caloriesPer100gram = Double.parseDouble(data[2]);
                double protein = Double.parseDouble(data[3]);
                double fat = Double.parseDouble(data[4]);
                double carbohydrates = Double.parseDouble(data[5]);
                String category = data[6];
                ingredients.add(new Ingredient(name, price, caloriesPer100gram, protein, fat, carbohydrates, category));
//                System.out.println("successfully added ingredient "+name+" price: "+price+" cal: "+caloriesPer100gram+
//                        " protein: "+protein+" fat: "+fat+" carbohydrates: "+carbohydrates);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected Ingredient getIngredientByName(String name) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equals(name)) {
                return ingredient;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return ingredients.size();
    }

    @Override
    public boolean isEmpty() {
        return ingredients.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return ingredients.contains(o);
    }

    @Override
    public Iterator<Ingredient> iterator() {
        return ingredients.iterator();
    }

    @Override
    public Object[] toArray() {
        return ingredients.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return ingredients.toArray(a);
    }

    @Override
    public boolean add(Ingredient ingredient) {
        return ingredients.add(ingredient);
    }

    @Override
    public boolean remove(Object o) {
        return ingredients.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return ingredients.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Ingredient> c) {
        return ingredients.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Ingredient> c) {
        return ingredients.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return ingredients.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return ingredients.retainAll(c);
    }

    @Override
    public void clear() {
        ingredients.clear();
    }

    @Override
    public Ingredient get(int index) {
        return ingredients.get(index);
    }

    @Override
    public Ingredient set(int index, Ingredient element) {
        return ingredients.set(index, element);
    }

    @Override
    public void add(int index, Ingredient element) {
        ingredients.add(index, element);
    }

    @Override
    public Ingredient remove(int index) {
        return ingredients.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return ingredients.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return ingredients.lastIndexOf(o);
    }

    @Override
    public ListIterator<Ingredient> listIterator() {
        return ingredients.listIterator();
    }

    @Override
    public ListIterator<Ingredient> listIterator(int index) {
        return ingredients.listIterator(index);
    }

    @Override
    public List<Ingredient> subList(int fromIndex, int toIndex) {
        return ingredients.subList(fromIndex, toIndex);
    }
}
