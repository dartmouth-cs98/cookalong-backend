package cookalong.user;

import java.util.ArrayList;
import java.util.List;

public class User {
    private long id;
    private String name;
    // ids of ingredients
    private List<Integer> restrictions;
    // ids of recipes
    private List<Integer> favorites;
    // both will hold ids of ingredients
    private List<Integer> likes;
    private List<Integer> dislikes;
    private List<String> tools;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
        this.restrictions = new ArrayList<>();
        this.favorites = new ArrayList<>();
        this.likes = new ArrayList<>();
        this.dislikes = new ArrayList<>();
        this.tools = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRestrictions() {
        return restrictions;
    }

    public List<Integer> getFavorites() {
        return favorites;
    }

    public List<Integer> getLikes() {
        return likes;
    }

    public List<Integer> getDislikes() {
        return dislikes;
    }

    public List<String> getTools() {
        return tools;
    }
}
