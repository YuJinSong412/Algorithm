

public class Product {
  
  public String getContext(String text) {
    
    String result = "";
    if(text.equals("1")) {
      result = "hello";
    }else if(text.equals("2")) {
      result = "yujin";
    }else {
      result = "else~~";
    }
    
    return result;
  }
  
  

}
