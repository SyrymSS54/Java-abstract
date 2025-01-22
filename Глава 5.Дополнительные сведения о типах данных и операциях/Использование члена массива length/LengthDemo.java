public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1,2,3};
        int table[][] = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        System.out.println("Длина list: " + list.length );
        System.out.println("Длина nums: " + nums.length);
        System.out.println("Длина table: " + table.length);
        System.out.println("Длина table[0]: " + table[0].length);
        System.out.println("Длина table[1]: " + table[1].length);
        System.out.println("Длина table[2]: " + table[2].length);
        System.err.println();

        for(int i = 0;i < list.length;i++){
            list[i] = i * i;
        }

        System.out.print("Содержимое list: ");
        for(int i=0;i < list.length;i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
