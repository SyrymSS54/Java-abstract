public class NoBreak {
    public static void main(String[] args) {
        int x;
        for(x=0; x<5; x++){
            switch(x){
                case 0:
                    System.out.println("i меньше 1");
                case 1:
                    System.out.println("i меньше 2");
                case 2:
                    System.out.println("i меньше 3");
                case 3:
                    System.out.println("i меньше 4");
                case 4:
                    System.out.println("i меньше 5");
            }
            System.out.println();
        }
    }
}
