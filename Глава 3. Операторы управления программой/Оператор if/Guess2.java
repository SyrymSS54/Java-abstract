public class Guess2 {
    public static void main(String[] args) throws java.io.IOException{
        char ch, answer = 'K';

        System.out.println("Задумана буква между A и Z.");
        System.out.print("Попробуйте ее угадать :");
        ch = (char) System.in.read();
        if(ch == answer) System.out.println("** Правильно **");
    }
}
