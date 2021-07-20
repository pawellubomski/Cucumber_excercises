import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ExampleStepDefinition {
    @Given("User has {int} iap")
    public void userHasIap(int wpisanesubskrypcje) {
        System.out.format("Liczba sybskrypcji " + wpisanesubskrypcje);
    }

    @And("Posprzątaj w pokoju")
    public void posprzatajWPokoju() {
        System.out.format("\nPosprzątaj! ");
    }

    @ParameterType("dark|white")
    public Color color(String color) {
        return new Color(color);
    }

    @Given("Set {color} theme")
    public void IsetDarkTheme(Color color) {
        System.out.println("theme is " + color);
        }

}

