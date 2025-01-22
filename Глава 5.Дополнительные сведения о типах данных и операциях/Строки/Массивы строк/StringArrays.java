public class StringArrays {
    public static void main(String[] args) {
        String[] strs = {"Это содержимое","является","просто","тестом"};

        System.out.print("Исходный массив: ");
        for(String s: strs){
            System.out.print(s + " ");
        }
        System.err.println("\n");

        strs[1] = "стало";
        strs[3] = "еще одним тестом!";

        System.out.println("Модифицированный массив: ");
        for(String s: strs){
            System.out.print(s + " ");
        }
    }
}
