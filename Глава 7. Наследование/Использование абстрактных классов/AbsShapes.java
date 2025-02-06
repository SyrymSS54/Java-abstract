abstract class TwoDShapes{
    private double width;
    private double height;
    private String name;

    TwoDShapes(){
        width=height=0.0;
        name = "без имени";
    }
    TwoDShapes(double w,double h,String n){
        width = w;
        height = h;
        name = n;
    }
    TwoDShapes(double x,String n){
        width = height = x;
        name =n;
    }
    TwoDShapes(TwoDShapes ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width =w ;
    }
    void setHeight(double h){
        height = h;
    }
    String getName(){
        return name;
    }
    void showDim(){
        System.out.println("Ширина и высота: " + width + " и " + height);
    }
    abstract double area();
}

class Triangle extends TwoDShapes{
    private String style;

    Triangle(){
        super();
        style = "отсутствует";
    }
    Triangle(String s,double w,double h){
        super(w,h,"треугольник");
        style =s;
    }
    Triangle(double x){
        super(x,"треугольник");
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
        System.out.println("Стиль треугольник: " + style);
    }
}

class Rectangle extends TwoDShapes{
    Rectangle(){
        super();
    }
    Rectangle(double w,double h){
        super(w,h,"прямоугольник");
    }
    Rectangle(double x){
        super(x,"прямоугольник");
    }
    Rectangle(Rectangle ob){
        super(ob);
    }
boolean isSqaure(){
    return getWidth() == getHeight();
}
double area(){
    return getWidth() * getHeight();
}
}

public class AbsShapes {
    public static void main(String[] args) {
        TwoDShapes[] shapes = new TwoDShapes[4];

        shapes[0] = new Triangle("контурный",8.0,12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);

        for(int i = 0;i<shapes.length;i++){
            System.out.println("Обьект с именем: " + shapes[i].getName());
            System.out.println("Площадь: " + shapes[i].area());
            System.out.println();
        }
    }
}
