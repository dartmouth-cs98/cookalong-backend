package cookalong.recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private long id;
    private String name;
    private String description;
    private int time;
    private int serving_size;
    private int calories;
    private List<Integer> ingredients;
    private List<Integer> steps;
    private List<String> tools;
//    private List<Integer> techniques;
//    private List<Integer> tags;

    public Recipe(long id, String name, String description, int time, int serving_size, int calories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
        this.serving_size = serving_size;
        this.calories = calories;
        this.ingredients = new ArrayList<>();
        this.tools = new ArrayList<>();
        this.steps = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getTime() {
        return time;
    }

    public int getServing_size() {
        return serving_size;
    }

    public int getCalories() {
        return calories;
    }

    public List<Integer> getIngredients() {
        return ingredients;
    }

    public List<Integer> getSteps() {
        return steps;
    }

    public List<String> getTools() {
        return tools;
    }
}
