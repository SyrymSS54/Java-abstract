class TwoDShape{
    private double width;
    private double height;

    TwoDShape(){
        height = width = 0.0;
    }

    TwoDShape(double w,double h){
        width = w;
        height = h;
    }

    TwoDShape(double x){
        height = width = x;
    }

    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        height = h;
    }
    void showDim(){
        System.out.println("Ширина и высота: " + width + " и " + height);
    }
}

class Triangle extends TwoDShape{
    String style;

    Triangle(){
        super();
        style = "отсутствует";
    }

    Triangle(String s,double w,double h){
        super(w, h);
        style = s;
    }

    Triangle(double x){
        super(x);
        style = "закрашенный";
    }

    double area(){
        return getHeight() * getWidth() /2;
    }

    void showStyle(){
        System.out.println("Стиль треугольника: " + style);
    }
}

public class Shapes5 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("контурный",8.0,12.0);
        Triangle t3 = new Triangle(4.0);

        System.out.println("Информация об обьекта t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация об обьекта t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь: " + t2.area());

        System.out.println();

        System.out.println("Информация об обьекта t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь: " + t3.area());
    }
}
