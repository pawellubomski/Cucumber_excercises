import io.cucumber.java.en.Given;

import java.util.List;
import java.util.stream.Collectors;

public class ColorStepDefinition {
    @Given("the following colors:")
    public void theFollowingColors(List<String> colors) {
        System.out.println("Colours list :"+colors.stream().collect(Collectors.joining(", ")));
    }
}
