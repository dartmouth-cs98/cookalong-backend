package cookalong.recipe;

public class RecipeStep {
    private long id;
    private String instruction;
    private String videoUrl;
    private int time;

    public RecipeStep(long id, String instruction, String videoUrl, int time) {
        this.id = id;
        this.instruction = instruction;
        this.videoUrl = videoUrl;
        this.time = time;
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
}
