public enum TrafficLightColor {
    Red(1),
    Green(2),
    Yellow(3);
    private final int color;
    private TrafficLightColor(int color) {
        this.color = color;
    }
    public int getColor() {
        return color;
    }
}
