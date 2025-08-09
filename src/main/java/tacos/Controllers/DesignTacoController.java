package tacos.Controllers;

import tacos.Models.Ingredients.Type;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Models.Ingredients;
import tacos.Models.Ingredients.Type;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/design")
public class DesignTacoController {
    @GetMapping
            public String showDesingForm(Model model){
                List<Ingredients> ingredients = Arrays.asList(
                        new Ingredients("FLTO", "Flour Tortilla", Type.WRAP),
                        new Ingredients("COTO", "Corn Tortilla", Type.WRAP),
                        new Ingredients("GRBF", "Ground Beef", Type.PROTEIN),
                        new Ingredients("CARN", "Carnitas", Type.PROTEIN),
                        new Ingredients("TMTO", "Diced Tomatoes", Type.VEGGIES),
                        new Ingredients("LETC", "Lettuce", Type.VEGGIES),
                        new Ingredients("CHED", "Cheddar", Type.CHEESE),
                        new Ingredients("JACK", "Monterrey Jack", Type.CHEESE),
                        new Ingredients("SLSA", "Salsa", Type.SAUCE),
                        new Ingredients("SRCR", "Sour Cream", Type.SAUCE)
                );
                Type[] types = Ingredients.Type.values();
                for(Type type: types){
                 model.addAttribute(type.toString().toLowerCase(), filterByType
                }

                model.addAttribute("Design", new Taco());
                return "design";
    }

}
