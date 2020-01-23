package cookalong.recipe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import cookalong.dal.RecipeRepository;

@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @RequestMapping(value = "/{recipeId}", method = RequestMethod.GET)
    public Recipe getRecipeById(@PathVariable String recipeId) {
        return recipeRepository.findById(recipeId).orElse(null);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Recipe addNewRecipe(@RequestBody Recipe recipe) {
        return recipeRepository.save(recipe);
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteRecipe(@RequestParam String recipeId) {
        recipeRepository.deleteById(recipeId);
    }

    @RequestMapping(value = "/ingredients/{recipeId}", method = RequestMethod.GET)
    public List<String> getStepIngredients(@PathVariable String recipeId, @RequestParam int index) {
        List<String> toReturn = new ArrayList<>();
        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
        if (recipe != null) {
            for (int i : recipe.getSteps().get(index).getIngredients()) {
                toReturn.add(recipe.getIngredients().get(i).getImgUrl());
            }
        }
        return toReturn;
    }
}
