package cookalong.recipe;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private final AtomicLong counter = new AtomicLong();

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
}
