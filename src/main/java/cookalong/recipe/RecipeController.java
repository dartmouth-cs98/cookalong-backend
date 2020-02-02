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

    @RequestMapping(value = "/steps/insert", method = RequestMethod.POST)
    public Recipe insertStep(@RequestParam String recipeId, @RequestParam int index, @RequestBody RecipeStep step) {
        Recipe toEdit = recipeRepository.findById(recipeId).orElse(null);
        if (toEdit == null) return null;
        toEdit.getSteps().add(index, step);
        return recipeRepository.save(toEdit);
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

    @RequestMapping(value = "/allingredients/{recipeId}", method = RequestMethod.GET)
    public List<List<String>> getAllStepIngredients(@PathVariable String recipeId) {
        List<List<String>> toReturn = new ArrayList<>();
        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
        if (recipe != null) {
            List<RecipeIngredient> ingredients = recipe.getIngredients();
            for (RecipeStep step : recipe.getSteps()) {
                List<String> imgUrls = new ArrayList<>();
                for (int i : step.getIngredients()) {
                    imgUrls.add(ingredients.get(i).getImgUrl());
                }
                toReturn.add(imgUrls);
            }
        }
        return toReturn;
    }
}
