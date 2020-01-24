package Test;

import javax.swing.*;
import java.awt.*;

public class RoadTest extends JPanel {
    int width = 150;
    int height = 50;
    int roadPositionX = 0;
    int roadPositionY = 200;
    int carPositionX = roadPositionX;
    int carPositionY = roadPositionY+ height / 6;
    //int roadSegments= 6;

    private VehicleTest vehicle;
    //private DrawCanvas canvas;
    //paint Horizontal Road

    public RoadTest(){

        //vehicle = new VehicleTest(carPositionX, carPositionY, 30,10, Color.ORANGE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(0, 0, getWidth(), getHeight());

        //paint Road Horizontal
        g.setColor(Color.BLACK);
        g.fillRect(roadPositionX, roadPositionY, width, height);
        //paint Lane Horizontal
        g.setColor(Color.WHITE);
        for (int j = 0; j < width; j = j + 30) { // line being drawn
            g.fillRect(roadPositionX + j, roadPositionY + height / 2, 20, 2);
        }
        //paint Road Vertical
        g.setColor(Color.BLACK);
        g.fillRect(roadPositionY, roadPositionX, height, width);
        //paint Lane Horizontal
        g.setColor(Color.WHITE);
        for (int j = 0; j < width; j = j + 30) { // line being drawn
            g.fillRect(roadPositionX + j, roadPositionY + height / 2, 20, 2);
        }

        //paint Traffic Light
        g.setColor(Color.GREEN);
        g.fillRect((roadPositionX + width - 30) /2 , roadPositionY - 20, 10, 20);
        g.setColor(Color.BLACK);
        g.drawRect((roadPositionX + width - 30) / 2, roadPositionY - 20, 10, 20);

        g.setColor(Color.ORANGE);
        g.fillRect(carPositionX, carPositionY , 30, 10);

    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("RoadPaint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RoadTest roadTest = new RoadTest();
        frame.add(roadTest);
        frame.setSize(600, 500);
        frame.setVisible(true);


    }
}