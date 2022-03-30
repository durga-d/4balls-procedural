import processing.core.PApplet;

public class ArgsClass extends PApplet {
    private int width;
    private int height;
    private int diameter;
    private int division=5;
    public int speed1=0,speed2=0,speed3=0,speed4=0;
    private int H1,H2,H3,H4;

    ArgsClass(int width, int height, int diameter){
        this.width=width;
        this.height=height;
        //this.division=division;
        this.diameter=diameter;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getH1() {
        return this.height/division;
    }

    public int getH2() {
        return 2*this.height/division;
    }

    public int getH3() {
        return 3*this.height/division;
    }

    public int getH4() {
        return 4*this.height/division;
    }


//    private void paintBG(){
//        background(255);
//    }


}
