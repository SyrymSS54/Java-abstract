class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    int range()
    {
        return fuelcap * mpg;
    }
}

class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range();
        range2 = sportscar.range();
        System.out.println( "Минивэн может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль . ");
        System.out.println( "Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров на расстояние " + range2 + " миль . ");
    }
}
