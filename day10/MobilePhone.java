public class MobilePhone {
    //States --> instance variables
    String brand, model;
    int batteryPercentage;
    //Constructor
    public MobilePhone(String brand, String model, int batteryPercentage){
        this.brand = brand;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
    }
    public void makeCall(){
        if (this.batteryPercentage >=2)
            this.batteryPercentage -= 2;
        else if (this.batteryPercentage==1)
            this.batteryPercentage = 0;
    }
    public void chargePhone(){
        if (this.batteryPercentage <= 95)
            this.batteryPercentage += 5;
        else if (this.batteryPercentage > 95 && this.batteryPercentage < 100)
            this.batteryPercentage=100;
    }
    public int getBatteryPercentage(){
        return batteryPercentage;
    }
    public String toString(){
        return String.format("MobilePhone[Brand='%s', Model='%s', Battery=%d%%]", brand, model, batteryPercentage);
    }    
}
