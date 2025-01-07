class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return mpg * fuelcap;
    }

    double fuelNeeder(int miles){
        return (double)miles/mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelNeeder(dist);

        System.out.println("Для поездки на расстояние " + dist + " миль минивэну требуется " + gallons + " галлонов топлива ." );

        gallons = sportcar.fuelNeeder(dist);

        System.out.println("Для поездки на расстояние " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива ." );
    }
}
