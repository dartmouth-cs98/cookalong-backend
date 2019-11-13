package cookalong.recipe;

public class RecipeStep {
    private long id;
    private String instruction;
    private String videoUrl;

    public RecipeStep(long id, String instruction, String videoUrl) {
        this.id = id;
        this.instruction = instruction;
        this.videoUrl = videoUrl;
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
}
