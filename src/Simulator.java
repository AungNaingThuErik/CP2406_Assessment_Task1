public class Simulator {
    public static void main(String []args) throws InterruptedException, NullPointerException{
        boolean isStop = false;
        //Declaring Vehicle Object
        Vehicle car;
        car=new Vehicle(1,"Car",1,null);
        //Declaring TrafficLight Object
        TrafficLight trafficLight;
        trafficLight=new TrafficLight("Green",5.0);
        //Declaring Road Object
        Road road;
        Road thirdRoad = new Road(3,"Third Road", 4, car, trafficLight, null);
        Road secondRoad = new Road(2,"Second Road", 4, car, trafficLight, thirdRoad);
        Road firstRoad = new Road(1,"First Road", 3, car, trafficLight, secondRoad);
        //Put Car on the Road
        car.currentRoad=firstRoad;
        road=car.currentRoad;
        //Run the simulation
        while(isStop == false){
            //the simulator will keep running until user choose to end
            trafficLight.Operate();
            System.out.println("Vehicle Number: " + car.vehicleNumber + " is a "+ car.vehicleType +
                    ". It's on " + car.currentRoad.name + " and at the Position: "+ car.currentPosition +" Traffic Light: "+trafficLight.color);
            car.move();
            road.UpdatePosition(car);
            if(road.isEndOfRoad==true)
            {
                if(road.nextRoad == null)
                    isStop=true;
                road=car.currentRoad;
            }
            Thread.sleep(2000);
        }
    }
}
