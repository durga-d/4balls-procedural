import processing.core.PApplet;
public class TryProcessing extends PApplet {

    public static final int WIDTH=640;
    public static final int HEIGHT=640;  // magic numbers - code smells
    private static final int DIAMETER=20;
    int speed1=0,speed2=0,speed3=0,speed4=0;
    public static final int H1=HEIGHT/5,H2=2*HEIGHT/5,H3=3*HEIGHT/5,H4=4*HEIGHT/5;

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
        ellipse(speed1, H1, DIAMETER, DIAMETER);
        speed1++;
        ellipse(speed2, H2, DIAMETER, DIAMETER);
        speed2+=2;
        ellipse(speed3, H3, DIAMETER, DIAMETER);
        speed3+=3;
        ellipse(speed4, H4, DIAMETER, DIAMETER);
        speed4+=4;
//        ellipse(x, mouseY, DIAMETER, DIAMETER);
//        x++;
    }
    private void paintWhite(){
        background(255);
    }
}
