interface Insurable{double insurance();}

abstract class Vehicle{
    String num,type;double rate;
    Vehicle(String n,String t,double r){num=n;type=t;rate=r;}
    abstract double cost(int d);
}

class Car extends Vehicle implements Insurable{
    Car(String n,double r){super(n,"Car",r);}
    double cost(int d){return rate*d;}
    public double insurance(){return 2000;}
}

class Bike extends Vehicle implements Insurable{
    Bike(String n,double r){super(n,"Bike",r);}
    double cost(int d){return rate*d;}
    public double insurance(){return 500;}
}

public class Rent{
    public static void main(String[]a){
        Vehicle[] v={new Car("UP01",1000),new Bike("UP02",300)};
        for(Vehicle x:v){
            System.out.println(x.type+" Total:"+x.cost(5)+" +Ins:"+((Insurable)x).insurance());
        }
    }
}
