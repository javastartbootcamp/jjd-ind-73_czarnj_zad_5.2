package pl.javastart.task;

public class Room {
    private double area;
    private double temperature;
    private boolean isAirConditioner;
    private double limitTemperature;

    public Room(double area, double temperature, boolean isAirConditioner, double limitTemperature) {
        this.area = area;
        this.isAirConditioner = isAirConditioner;
        this.limitTemperature = limitTemperature;
        if(temperature < limitTemperature)
            this.temperature = limitTemperature;
        else
            this.temperature = temperature;
    }

    public boolean decreaseTemperature() {
        if(isAirConditioner) {
            if(temperature - 1 >= limitTemperature) {
                temperature--;
                return true;
            }
            else if(temperature > limitTemperature) {
                temperature = limitTemperature;
                return true;
            }
            else
                return false;
        }

        return false;
    }

    public String getRoomInfo() {
        return String.format("Area: %.1f Temperature: %.1f Is air conditioner: %b Limit temperature: %.1f",
                             area, temperature, isAirConditioner, limitTemperature);
    }
}
