class TwoDShape{
    private double width;
    double height;

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

    double area(){
        return getHeight() * getWidth() /2;
    }

    void showStyle(){
        System.out.println("Стиль треугольника: " + style);
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "закрашенный" ;
        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

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
