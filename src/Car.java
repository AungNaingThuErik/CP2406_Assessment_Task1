import java.awt.*;

public class Car extends Vehicle {
    Car(Road road){
        super(road);
        width = 30;
        height = 12;
    }
    //paint car horizontally for the horizontal road
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(xPos, yPos, width, height);
    }
    //paint car vertically for the vertical road
    public void paintMeVertical(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(yPos, xPos, height, width);
    }
}
