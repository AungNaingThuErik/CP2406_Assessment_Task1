import java.awt.*;

public class Car extends Vehicle {
    Car(Road road){
        super(road);
        width = 30;
        height = 12;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(xPos, yPos, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(yPos, xPos, height, width);
    }
}
