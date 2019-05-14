package main;
import java.util.*;
public class Model{
  public List<String> getContent(String inputVal){
    List<String> returnVal = new ArrayList<String>();
    if(inputVal.toLowerCase().matches("yes|y")){
      returnVal.add("request made");
    }
    return returnVal;
  }
}
