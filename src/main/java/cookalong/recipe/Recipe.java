package cookalong.recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private long id;
    private String name;
    private String description;
    private String imgUrl;
    private int time;
    private int serving_size;
    private int calories;
    private List<RecipeIngredient> ingredients;
    private List<RecipeStep> steps;
    private List<String> tools;
//    private List<Integer> techniques;
//    private List<Integer> tags;

    public Recipe(long id, String name, String description, String imgUrl, int time, int serving_size, int calories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
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

    public List<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public List<RecipeStep> getSteps() {
        return steps;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setServing_size(int serving_size) {
        this.serving_size = serving_size;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredients(List<RecipeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setSteps(List<RecipeStep> steps) {
        this.steps = steps;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }
}
