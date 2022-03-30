import processing.core.PApplet;

public class TryProcessing extends PApplet {

    final int noOfBalls=4;
    int[] xaxis= new int[]{0, 0, 0, 0};
    ArgsClass ac=new ArgsClass(640,480,20);
    Balls balls=new Balls();
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);


    }
    @Override
    public void setup() {
    }
    @Override
    public void settings() {
        super.settings();
        size(ac.getWidth(),ac.getHeight());
        //System.out.println("H1 = "+ac.getH1());
    }

    @Override
    public void draw() {
        drawCircle();
    }
//    void drawCircle() {
//        ellipse(ac.speed1, ac.getH1(), ac.getDiameter(), ac.getDiameter());
//        ac.speed1++;
//        ellipse(ac.speed2, ac.getH2(), ac.getDiameter(), ac.getDiameter());
//        ac.speed2 += 2;
//        ellipse(ac.speed3, ac.getH3(), ac.getDiameter(), ac.getDiameter());
//        ac.speed3 += 3;
//        ellipse(ac.speed4, ac.getH4(), ac.getDiameter(), ac.getDiameter());
//        ac.speed4 += 4;
//    }

    void drawCircle(){
        drawBall(xaxis,ac.getH1(), ac.getDiameter(),1);
        drawBall(xaxis,ac.getH2(), ac.getDiameter(),2);
        drawBall(xaxis,ac.getH3(), ac.getDiameter(),3);
        drawBall(xaxis,ac.getH4(), ac.getDiameter(),4);
    }
    void drawBall(int xaxis[],int y,int diameter,int incrementBy){
        ellipse(xaxis[incrementBy-1],y,diameter,diameter);
        xaxis[incrementBy-1]+=incrementBy;
    }
//    void drawBall2(){
//        ellipse(ac.speed2, ac.getH2(), ac.getDiameter(), ac.getDiameter());
//        ac.speed2+=2;
//    }

}
