class OverLoad{
    void ovlDemo(){
        System.out.println("Без параметров");
    }

    void ovlDemo(int a){
        System.out.println("Один параметр типа int: " + a);
    }

    int ovlDemo(int a,int b){
        System.out.println("Два параметр типа int: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b){
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }
}

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad ob= new OverLoad();
        int resI;
        double resD;

        ob.ovlDemo();
        ob.ovlDemo(2);
        ob.ovlDemo(2, 4);
        ob.ovlDemo(2.5, 2.32);
    }
}
