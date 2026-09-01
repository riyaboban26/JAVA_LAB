class Vehiclecl{
    private int regNO ;
    private double dailyRate;

    Vehiclecl(int regNo, double dailyRate){
        this.regNO = regNo;
        this.dailyRate = dailyRate;
    }

    public int getRegNO() {
        return regNO;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    
    public  double computeRent(int days){
        return days * getDailyRate();
    }

    public void displayDetails(){
         System.out.println("Vehicle Registration Number: " + getRegNO());
         System.out.println("Daily Rate: " + getDailyRate());
    }


}
class Car extends Vehiclecl{
    private int numDoors;
    Car(int regNo, double dailyRate, int numDoors){
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

  
    public double computeRent (int days){
        return super.computeRent(days)+200;

    }


}
public class Vehicle{
    public static void main(String[] args){
        Car c = new Car(2345, 1000.0, 4);
        c.displayDetails();
        c.computeRent(5);
        System.out.println("Total Rent for 5 days: " + c.computeRent(5));
    }
}















