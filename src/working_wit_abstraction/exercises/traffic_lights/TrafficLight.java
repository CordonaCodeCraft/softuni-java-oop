package working_wit_abstraction.exercises.traffic_lights;

public class TrafficLight {
    private String color;

    public TrafficLight(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void changeColor() {
        switch (this.color) {
            case "RED":
                this.color = TrafficLightColors.values()[1].toString();
                break;
            case "GREEN":
                this.color = TrafficLightColors.values()[2].toString();
                break;
            case "YELLOW":
                this.color = TrafficLightColors.values()[0].toString();
                break;
        }
    }
}
