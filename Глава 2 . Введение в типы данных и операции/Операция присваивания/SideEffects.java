public class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;

        if(false & (++i < 100))
            System.out.println("Не отображается");
        System.out.println("Оператор if выполняется: " + i);

        if(false && (++i < 100))
            System.out.println("Не отображается");
        System.out.println("Оператор if выполняется: " + i);
    }
}
