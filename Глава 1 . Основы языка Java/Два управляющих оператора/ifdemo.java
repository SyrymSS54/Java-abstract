public class ifdemo {
    public static void main(String[] args){
        int a,b,c;

        a = 2;
        b = 3;
        
        if(a < b) System.out.println("Значение b больше чем a");
        if(a == b) System.out.println("Это вы не увидите");

        c = a-b;

        System.out.println(c);
        if(c >= 0) System.out.println("Значение не отрицательное");
        if(c < 0 ) System.out.println("Значение отрицательное");

        c = b-a;
        System.out.println(c);
        if(c >= 0) System.out.println("Значение не отрицательное");
        if(c < 0 ) System.out.println("Значение отрицательное");
    }
}
