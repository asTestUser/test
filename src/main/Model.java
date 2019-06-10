package main;
import java.util.*;
import org.owasp.html.*;
import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.Sanitizers;
public class Model{
  public List<String> getContent(String inputVal){
    List<String> returnVal = new ArrayList<String>();
    if(inputVal.toLowerCase().matches("yes|y")){
      returnVal.add(Sanitizers.FORMATTING.sanitize("<p>sanitized response24</p>"));
    }
    return returnVal;
  }
}
