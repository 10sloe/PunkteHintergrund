import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    // Diese Methode wird einmal ausgeführt
    void setup(GraphicsContext gc)
    {
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,400,400);
    }

    // Diese Methode wird immer und immer wieder ausgeführt
    void draw(GraphicsContext gc){
        double r = Math.random()*30+10;
   
        double x = Math.random()*400;
        double y = Math.random()*400;
        
        double rot = Math.random();
        double blau = Math.random();
        
     
        gc.setFill(Color.color(rot,0,blau,0.5));
        gc.fillOval(x,y,r,r);                 
    }

}
