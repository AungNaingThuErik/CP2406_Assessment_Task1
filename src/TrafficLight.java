public class TrafficLight {
    protected String color;
    protected double rateOfChange;
    private double randomRange, maxRange = 10.0, minRange = 1.0;
    //Default Constructor
    public TrafficLight(){

    }
    //Constructor with named Parameters
    public TrafficLight(String color, double rateOfChange){
        this.color=color;
        this.rateOfChange=rateOfChange;
    }
    //Method to return random double value between minimum and maximum range
    public static double GetRandomRange(double maxRange, double minRange){
        return (Math.random()*((maxRange-minRange)+1))+minRange;
    }
    //Method to define the state of the Traffic Light
    public void Operate(){
        randomRange = GetRandomRange(maxRange,minRange);
        if(rateOfChange>randomRange)
            color="Green";
        else
            color="Red";
    }
}
