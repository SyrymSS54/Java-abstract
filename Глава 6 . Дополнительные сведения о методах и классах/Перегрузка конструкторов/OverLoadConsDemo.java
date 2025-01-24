class MyClass{
    int x;
    MyClass(){
        System.out.println("Внутри MyClass().");
        this.x = 0;
    }

    MyClass(int i){
        System.out.println("Внутри MyClass(int).");
        this.x = i;
    }

    MyClass(double d){
        System.out.println("Внутри MyClass(double).");
        this.x = (int) d;
    }

    MyClass(int i,int j){
        System.out.println("Внутри MyClass(int ,int).");
        this.x = i * j;
    }
}

public class OverLoadConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2,4);

        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        System.out.println(t4.x);
    }
}
