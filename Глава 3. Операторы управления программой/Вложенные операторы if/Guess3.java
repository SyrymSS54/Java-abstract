public class Guess3 {
    public static void main(String[] args) throws java.io.IOException{
        char ch, answer = 'K';

        System.out.println("Задумана буква между A и Z.");
        System.out.print("Попробуйте ее угадать :");
        ch = (char) System.in.read();
        if(ch == answer) System.out.println("** Правильно **");
        else{
            System.out.print(". Увы , не угадали . Задуманная буква находится ");

            if(ch < answer) System.out.println("Дальше по алфавиту");
            else System.out.println("Ближе по алфавиту");
        }
    }
}
