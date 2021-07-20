public class Color {

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }

    private final String color;

    public Color(String color) {
        this.color = color;
    }
}
