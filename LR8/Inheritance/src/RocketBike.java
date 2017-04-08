
public class RocketBike extends Bicycle {

    private int fuel;//топливо

    public RocketBike(int startFuel, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear); //вызов конструктора супер класса
        fuel = startFuel;
    }

    //заправка топливом
    public void fuelBike(int fuel) {
        this.fuel = this.fuel + fuel;
    }

    //перегрузка метода
    public void fuelBike(String  fuel) {
        this.fuel = this.fuel + Integer.parseInt(fuel);
    }

    //получение характеристик
    public int getFuel() {
        return fuel;
    }

    public int getCadence (){
        return this.cadence;
    }

    public int getSpeed (){
        return this.speed;
    }

    public int getGear (){
        return this.gear;
    }

    //переопределение метода повышения скорости - если новая скорость превышает 60 км/ч, то скорость не увеличивается и
    // пользователь видит сообщение с предупреждением
    public void speedUp(int increment) {
        if (speed + increment < 60){
            speed += increment;
        }
        else {
            System.out.println("Warning! Slow down your speed!");
        }
    }

    //переопределение методов
    @Override
    public void setCadence(int newValue) {
        System.out.println("Setting cadance inside RocketBike");
        cadence = newValue;
    }

    @Override
    public void setGear(int newValue) {
        System.out.println("Setting gear inside RocketBike");
        gear = newValue;
    }

    @Override
    public void printDescription(){
        super.printDescription();
        System.out.println("Fuel level: " + + this.fuel);
    }

}
