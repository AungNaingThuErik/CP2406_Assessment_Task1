import java.util.ArrayList;

public class Map{

    //For adding roads, vehicles, and traffic lights on the map
    static ArrayList<Road> roads = new ArrayList<>();
    static ArrayList<Vehicle> cars = new ArrayList<>();
    static ArrayList<TrafficLight> trafficLights = new ArrayList<>();
    public Map(){
    }
    //Methods to add road
    public void addRoad(Road road){
        roads.add(road);
    }
    //Methods to add car
    public void addCar(Vehicle car){
        cars.add(car);
    }
    //Methods to add traffic light
    public void addTrafficLight(TrafficLight light) {
        trafficLights.add(light);
    }


}
