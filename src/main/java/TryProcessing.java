import processing.core.PApplet;
public class TryProcessing extends PApplet {

    public static final int WIDTH=640;
    public static final int HEIGHT=640;  // magic numbers - code smells
    private static final int DIAMETER=20;
    int x=0;int y=0;int z=0;int a=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        //size(640,480);
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(640/2,480/2,100,100);
        //ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
        //paintWhite();
        drawCircle();
    }
    private void drawCircle(){
//        ellipse(mouseX, mouseY, DIAMETER, DIAMETER);
        ellipse(x, HEIGHT/5, DIAMETER, DIAMETER);
        x++;
        ellipse(y, 2*HEIGHT/5, DIAMETER, DIAMETER);
        y+=2;
        ellipse(z, 3*HEIGHT/5, DIAMETER, DIAMETER);
        z+=3;
        ellipse(a, 4*HEIGHT/5, DIAMETER, DIAMETER);
        a+=4;
//        ellipse(x, mouseY, DIAMETER, DIAMETER);
//        x++;
    }
    private void paintWhite(){
        background(255);
    }
}
