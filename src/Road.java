public class Road {
    protected String name; //Name of Road
    protected int roadNumber, length;
    protected boolean isEndOfRoad = false;
    private Object [] roadObject;
    protected Road nextRoad;
    private Vehicle vehicle=new Vehicle();
    private TrafficLight trafficLight=new TrafficLight();
    //Default Constructor
    public Road(){

    }
    //Constructor with named Parameters
    public Road(int roadNumber, String name, int length, Vehicle vehicle, TrafficLight trafficLight, Road nextRoad){
        this.roadNumber=roadNumber;
        this.name= name;
        this.length=length;
        this.vehicle=vehicle;
        this.trafficLight=trafficLight;
        this.nextRoad=nextRoad;
        AddVehicle(vehicle);
        AddTrafficLight(trafficLight);
    }
    //Method to add vehicle on the road object
    public void AddVehicle(Vehicle vehicle){
        this.roadObject=new Object[length];
        roadObject[0]=vehicle;

    }
    //Method to add traffic light on the road object
    public void AddTrafficLight(TrafficLight trafficLight){
        this.roadObject=new Object[length];
        roadObject[this.length-1]=trafficLight;

    }
    
}
