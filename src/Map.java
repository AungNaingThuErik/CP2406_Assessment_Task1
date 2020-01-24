import java.util.ArrayList;

public class Map{
    static ArrayList<Road> roads = new ArrayList<>();
    static ArrayList<Vehicle> cars = new ArrayList<>();
    static ArrayList<TrafficLight> trafficLights = new ArrayList<>();
    public Map(){
    }

    public void addRoad(Road road){
        roads.add(road);
    }
    public void addCar(Vehicle car){
        cars.add(car);
    }
    public void addTrafficLight(TrafficLight light) {
        trafficLights.add(light);
    }


}
