import java.util.ArrayList;

public class BeerExpert {

  public ArrayList<String> getBrands(String color) {

    ArrayList<String> brands = new ArrayList<String>();
    if (color.equals("amber")) {
      brands.add("Jack Amber");
      brands.add("Red Moose");
    } else {
      brands.add("Jail PAle Ale");
      brands.add("Gout Stout");
    }
    return (brands);
  }

}
