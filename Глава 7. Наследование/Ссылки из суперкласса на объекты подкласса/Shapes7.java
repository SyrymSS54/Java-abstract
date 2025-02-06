class TwoDShape{
    private double width;
    private double height;

    TwoDShape(){
        width = height = 0.0;
    }
    TwoDShape(double w,double h){
        width = w;
        height = h;
    }
    TwoDShape(double x){
        width=height=x;
    }
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
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
    private String style;

    Triangle(){
        super();
        style = "отсутствует";
    }
    Triangle(String s,double w,double h){
        super(w,h);
        style = s;
    }
    Triangle(double x){
        super(x);
        style = "закрашенный";
    }
    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }
    double area(){
        return getHeight() * getWidth() / 2;
    }
    void showStyle(){
        System.out.println("Стиль треугольника: " + style);
    }
}

public class Shapes7 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("контурный",9.0,12.0);
        Triangle t2 = new Triangle(t1);

        System.out.println("Информация об обьекта t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация об обьекта t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь: " + t2.area());
    }
}
