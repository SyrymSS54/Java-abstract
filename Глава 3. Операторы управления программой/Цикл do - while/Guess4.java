public class Guess4 {
    public static void main(String[] args) throws java.io.IOException{
        char ch,ignore,answer = 'K';
        do{
            System.out.println("Задумана буква между А и Z.");
            System.out.print("Попробуйте ее угадать :");

            ch = (char)System.in.read();

            do{
                ignore = (char)System.in.read();
            }while(ignore != '\n');
            if(ch == answer ) System . out . println( " ** Правильно ** " );
            else {
            System . out . print(" .. . Увы , не угадали . Задуманная буква находится ") ;
            if(ch < answer) System.out.println("дальше по алфавиту.");
            else System.out.println( "ближе по алфавиту.");
            System.out.println (" Повторите попытку! \n ");
        }
        }while(answer != ch);
    }
}
