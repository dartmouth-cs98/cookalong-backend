package cookalong.recipe;

import java.util.List;

public class RecipeStep {
    private long id;
    private String instruction;
    private String videoUrl;
    private int time;
    private List<Integer> ingredients;

    public RecipeStep(long id, String instruction, String videoUrl, int time, List<Integer> ingredients) {
        this.id = id;
        this.instruction = instruction;
        this.videoUrl = videoUrl;
        this.time = time;
        this.ingredients = ingredients;
    }

    public long getId() {
        return id;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public int getTime() {
        return time;
    }

    public List<Integer> getIngredients() {
        return ingredients;
    }
}
