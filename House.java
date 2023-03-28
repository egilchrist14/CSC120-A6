/* This is a stub for the House class */
import java.util.ArrayList;
/**
 * Create a class House which inherits the methods and attributes of the Building class.
 */
public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  public int hasResidents;

  /**
   * Constructor that creates a House
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  /**
   * Identifies whether a house has a dining hall or not
   * @return true is the house has a dining hall; false if not
   */
  public boolean hasDiningRoom(){
    if(hasDiningRoom == true){
      return true;
    } else{
      return false;
    }
  }

  /**
   * How many residents are in the house
   * @return the number of residents
   */
  public int nResidents(){
    return residents.size();
  }

  /**
   * Moves a new student into the house
   * @param name Name of new resident
   */
  public void moveIn(String name){
    this.residents.add(name);
  }

  /**
   * Moves a student out of the house
   * @param name Name of student moving out
   * @return the name of the student that has moved out
   */
  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  }

  /**
   * Identifies whether a students lives in the house
   * @param person The student
   * @return true if the student lives there; false if not
   */
  public boolean isResident(String person){
    return residents.contains(person);
  }

  public String toString(){
    String description = super.toString();
    description += " There are currently " + this.residents.size() + " residents in this house.";
    description += " This house:";
    if (this.hasDiningRoom){
      description += " has";
    } else{
      description += " does not have";
    }
    description += " a dining room.";
    return description;
  }

  public static void main(String[] args) {
    House comstock = new House("Comstock", "1 Mandelle Road", 3, true);
    System.out.println(comstock);
  }
  
}