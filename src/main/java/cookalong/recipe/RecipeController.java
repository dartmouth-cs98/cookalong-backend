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
                "",
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
                "https://assets.bonappetit.com/photos/57acf62a53e63daf11a4dbee/16:9/w_2560,c_limit/best-ever-grilled-cheese.jpg",
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
        tools.add("Tablespoon measure");
        tools.add("Butter knife");
        tools.add("Skillet");
        tools.add("Stove");
        toReturn.setTools(tools);
        return toReturn;
    }

    @RequestMapping("/pho")
    public Recipe getPho() {
        Recipe toReturn = new Recipe(
                gcid.get() + 1,
                 "Cheater Pho",
                "Vietnamese noodle dish, but with a quick and easy recipe",
                "https://s23209.pcdn.co/wp-content/uploads/2015/10/Cheater-Pho-Asian-Noodle-SoupIMG_9265edit-360x360.jpg",
                60,
                2,
                750
        );
        List<RecipeStep> steps = new ArrayList<>();
        steps.add(new RecipeStep(1, "Thinly slice onion and jalapeño.", ""));
        steps.add(new RecipeStep(2, "Mince garlic.", ""));
        steps.add(new RecipeStep(3, "Grate ginger", ""));
        steps.add(new RecipeStep(4, "In a large pot of water, cook rice noodles according to package instructions; drain well and set aside.", ""));
        steps.add(new RecipeStep(5, "Heat 1 tablespoon olive oil in a large stockpot or Dutch oven over medium heat.", ""));
        steps.add(new RecipeStep(6, "Season chicken with salt and pepper, to taste.", ""));
        steps.add(new RecipeStep(7, "Add chicken to the stockpot and cook until golden, about 2-3 minutes; set aside.", ""));
        steps.add(new RecipeStep(8, "Add remaining 1 tablespoon oil to the stockpot.", ""));
        steps.add(new RecipeStep(9, "Add garlic and ginger, and cook, stirring frequently, until fragrant, about 1-2 minutes.", ""));
        steps.add(new RecipeStep(10, "Whisk in chicken stock, hoisin sauce and fish sauce.", ""));
        steps.add(new RecipeStep(11, "Bring to a boil; reduce heat and simmer for 10 minutes.", ""));
        steps.add(new RecipeStep(12, "Serve immediately with rice noodles and chicken, garnished with onion, bean sprouts, cilantro, mint, jalapeno and limes, if desired.", ""));
        steps.add(new RecipeStep(13, "Now eat it.", ""));
        toReturn.setSteps(steps);
        List<RecipeIngredient> ingredients = new ArrayList<>();
        ingredients.add(new RecipeIngredient(1, "Dried rice noodles", "8 ounces"));
        ingredients.add(new RecipeIngredient(2, "Olive oil", "2 tablespoons"));
        ingredients.add(new RecipeIngredient(3,"Boneless, skinless chicken thighs", "1 pound"));
        ingredients.add(new RecipeIngredient(4, "Garlic", "3 cloves"));
        ingredients.add(new RecipeIngredient(5, "Ginger", "1 tablespoon"));
        ingredients.add(new RecipeIngredient(6, "Kosher salt and freshly ground black pepper", "To taste"));
        ingredients.add(new RecipeIngredient(7, "Chicken stock", "6 cups"));
        ingredients.add(new RecipeIngredient(8, "Hoisin sauce", "2 tablespoons"));
        ingredients.add(new RecipeIngredient(9, "Fish sauce", "1 tablespoon"));
        ingredients.add(new RecipeIngredient(10, "Onion", "1"));
        ingredients.add(new RecipeIngredient(11, "Bean sprouts", "2 cups"));
        ingredients.add(new RecipeIngredient(12, "Cilantro leaves", "1/2 cup"));
        ingredients.add(new RecipeIngredient(13, "Mint leaves", "1/2 cup"));
        ingredients.add(new RecipeIngredient(14, "Jalapeño", "1"));
        ingredients.add(new RecipeIngredient(15, "Limes, halved", "2"));
        toReturn.setIngredients(ingredients);
        List<String> tools = new ArrayList<>();
        tools.add("Large pot");
        tools.add("Chef's knife");
        tools.add("Cutting board");
        tools.add("Grater");
        tools.add("Tablespoon measure");
        tools.add("Cup measure");
        tools.add("Dutch oven/stockpot");
        tools.add("Stove");
        toReturn.setTools(tools);
        return toReturn;
    }
}
