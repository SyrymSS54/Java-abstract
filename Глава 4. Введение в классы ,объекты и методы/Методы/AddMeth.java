class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    void range(){
        System.out.println("Дальность поездки в милях: " + fuelcap * mpg);
    }
}


class AddMeth {
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

        System.out.println("Минивэн может перевезти " + minivan.passengers + " пассажиров.");
        minivan.range();
        System.out.println("Спортивный автомобиль может перевезти" + minivan.passengers + "пассажиров.");
        sportscar.range();
    }
}
