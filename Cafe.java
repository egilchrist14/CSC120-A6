/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCream;
    private int nCups;

    public Cafe(String name, String address, int nFloors){
        super(name, address, nFloors);
        this.nCoffeeOunces = 1000;
        this.nSugarPackets = 1500;
        this.nCream = 500;
        this.nCups = 50;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (nCoffeeOunces>0){
            this.nCoffeeOunces = nCoffeeOunces - size;
        }
        else if (nSugarPackets>0){
            this.nSugarPackets = nSugarPackets - size;
        }
        else if (nCream>0){
            this.nCream = nCream - size;
        }
        else if (nCups>0){
            this.nCups -=1;
        }
        else restock(size, nSugarPackets, nCreams, nCups);
        System.out.println("Remaining inventory is: " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " sugar packets, " + nCream + "creamers and " + nCups + " cups.");
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if (nCoffeeOunces<=0){
            this.nCoffeeOunces = 1000;
        }
        if (nSugarPackets<=0){
            this.nSugarPackets = 1500;
        }
        if (nCream<=0){
            this.nCream = 500;
        }
        if (nCups<=0){
            this.nCups = 50;
        }
    }    

    public static void main(String[] args) {
        Cafe Emporium = new Cafe("The Emporium", "233 Xenia Ave", 1);
        System.out.println(Emporium);
    }
    
}
