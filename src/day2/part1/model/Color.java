package day2.part1.model;

public enum Color {
    BLUE,
    RED,
    GREEN;

    public static Color getColor(String color){
        switch (color){
            case "blue":
                return Color.BLUE;
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            default:
                throw new IllegalArgumentException("Unknown color: " + color);
        }
    }
}
