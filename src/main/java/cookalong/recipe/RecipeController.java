package cookalong.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private final AtomicLong counter = new AtomicLong();
    private final AtomicLong gcid = counter;

    @RequestMapping("/recipe")
    public Recipe recipe(@RequestParam(value="name", defaultValue="Grilled Cheese") String name) {
        return new Recipe(
                counter.incrementAndGet(),
                name,
                "Melted cheese on toasted bread",
                10,
                1,
                280
                );
    }

    @RequestMapping("/grilledcheese")
    public Recipe grilledCheese() {
        Recipe toReturn = new Recipe(
                gcid.get(),
                "Grilled Cheese",
                "Melted cheese on toasted bread",
                10,
                1,
                280
        );
        List<RecipeStep> steps = new ArrayList<>();
        steps.add(new RecipeStep(1, "Place bread on a cutting board and spread mayonnaise over top side of each; this is key to a golden, delectable crunch.", ""));
        steps.add(new RecipeStep(2, "Heat a small skillet (nonstick, ideally) over medium heat.", ""));
        steps.add(new RecipeStep(3, "Slide in half of butter.", ""));
        steps.add(new RecipeStep(4, "When it melts, place 1 slice of bread, mayonnaise side down, in skillet; top with cheese; season with pepper.", ""));
        steps.add(new RecipeStep(5, "Top with second slice of bread, mayonnaise side up.", ""));
        steps.add(new RecipeStep(6, "When underside is golden brown, about 4 minutes, turn sandwich and add remaining butter to skillet.", ""));
        steps.add(new RecipeStep(7, "Press down on sandwich to encourage even browning and to help melt cheese—be gentle, don’t smash it.", ""));
        steps.add(new RecipeStep(8, "Cook until second side is golden brown and cheese is melted.", ""));
        steps.add(new RecipeStep(9, "Eat it.", ""));
        toReturn.setSteps(steps);
        List<RecipeIngredient> ingredients = new ArrayList<>();
        ingredients.add(new RecipeIngredient(1, "Half inch thick Pullman or white bread", "Two slices"));
        ingredients.add(new RecipeIngredient(2, "Mayonnaise", "2 tablespoons"));
        ingredients.add(new RecipeIngredient(3,"Unsalted butter", "1 tablespoon"));
        ingredients.add(new RecipeIngredient(4, "Thinly sliced American or cheddar cheese", "2 ounces (~4 slices)"));
        ingredients.add(new RecipeIngredient(5, "Ground black pepper", "To taste"));
        toReturn.setIngredients(ingredients);
        List<String> tools = new ArrayList<>();
        tools.add("Cutting board");
        tools.add("Butter knife");
        tools.add("Skillet");
        tools.add("Stove");
        toReturn.setTools(tools);
        return toReturn;
    }
}
