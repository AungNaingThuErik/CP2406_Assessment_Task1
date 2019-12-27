public class Vehicle {
    protected String vehicleType;
    protected int vehicleNumber, currentPosition ;
    protected Road currentRoad;
    //Default Constructor
    public Vehicle(){

    }
    //Constructor with named Parameters
    public Vehicle(int vehicleNumber, String vehicleType, int currentPosition, Road currentRoad){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        this.currentPosition=currentPosition;
        this.currentRoad=currentRoad;
    }
    //Method to define the behaviour of the Vehicle
    
}
