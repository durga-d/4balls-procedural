import processing.core.PApplet;

public class Balls extends PApplet {
    int[] xaxis= new int[]{0, 0, 0, 0};


    void drawBall(int xaxis[],int y,int diameter,int incrementBy){
        ellipse(xaxis[incrementBy-1],y,diameter,diameter);
        xaxis[incrementBy-1]+=incrementBy;
    }

}
