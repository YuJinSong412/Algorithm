import java.util.ArrayList;

public class Country {
  
  public ArrayList<String> getCountry(String country){
    ArrayList<String> countries = new ArrayList<String>();
    
    if(country.equals("extreme knitting")) {
      countries.add("Fred");
      countries.add("Pradeep");
      countries.add("Philippe");
    }else {
      countries.add("Korea");
    }
    
    return (countries);
  }

}
