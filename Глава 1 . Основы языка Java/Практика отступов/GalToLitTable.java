public class GalToLitTable {
    public static void main(String[] args)
    {
        double gallons,liters;
        int counter = 0;

        for (gallons = 0;gallons <= 100; gallons++)
        {
            liters = gallons * 3.7854;
            System.out.println(gallons + " галоны соотвествует " + liters + " литрам");
            counter++;
            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
