import java.awt.*;

public class Bus extends Vehicle {
    Bus(Road road){
        super(road);
        width = 45;
        height = 15;
    }
    //paint bus horizontally for the horizontal road
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(xPos, yPos, width, height);
    }
    //paint bus vertically for the vertical road
    public void paintMeVertical(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(yPos, xPos, height, width);
    }
}
