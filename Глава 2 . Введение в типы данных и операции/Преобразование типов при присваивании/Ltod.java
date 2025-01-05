public class Ltod {
    public static void main(String[] args) {
        long L;
        double D;  

        L = 100123285L;
        D = L;

        //D = 100123285.0;
        //L = D не разрешено!!

        System.out.println("L & D: " + L + " " + D);
    }
}
