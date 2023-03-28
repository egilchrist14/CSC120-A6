/* This is a stub for the Library class */
import java.util.Hashtable;
public class Library extends Building{
    private Hashtable<String, Boolean> collection;
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<String, Boolean>();
    }

    public void addTitle(String title){
      collection.put(title, true);
    }

    public String returnTitle(String title){
      collection.remove(title, false);
      return title;
    }

    public void checkOut(String title){
      collection.replace(title, true);
    }

    public void returnBook(String title){
      collection.replace(title, true);
    }

    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title){
      return collection.containsKey(title);
    }

    public void printCollection(){
      System.out.println("Library: " + collection);
    }

    public static void main(String[] args) {
      Library greene = new Library("Greene County Public Library", "415 Xenia Ave", 1);
      System.out.println(greene);
    }
  }