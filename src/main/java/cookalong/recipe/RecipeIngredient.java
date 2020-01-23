package cookalong.recipe;

public class RecipeIngredient {
    private long id;
    private String name;
    private String amount;
    private String imgUrl;

    public RecipeIngredient(long id, String name, String amount, String imgUrl) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.imgUrl = imgUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
