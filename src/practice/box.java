package practice;

public class box {
    double width;
    double height;
    double depth;
    double vol(){
        return width*height*depth;
    }
}
class BoxDemo4{
    public static void main(String[] args) {
        box mybox1=new box();
        box mybox2=new box();
        double vol;
        mybox1.width=20;
        mybox1.height=50;
        mybox1.depth=10;
        mybox2.width=10;
        mybox2.height=50;
        mybox2.depth=20;
        System.out.println("volume is :"+mybox1.vol());
        System.out.println("volume is :"+mybox2.vol());
    }
}


