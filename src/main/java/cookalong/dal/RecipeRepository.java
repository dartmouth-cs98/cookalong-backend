package cookalong.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cookalong.recipe.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String> {
}