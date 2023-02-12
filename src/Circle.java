public class Circle {
     static  int pi;
     static  int radius;

    public Circle(int radius,int pi) {
        this.radius=radius;
        this.pi= pi;
    }

    static void area(){

        System.out.println(pi*(radius*radius));

    }
    static void circumference(){
        System.out.println(pi*2*radius);
    }
}
