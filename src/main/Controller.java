package main;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import org.owasp.html.*;
import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.Sanitizers;

@SuppressWarnings("unchecked")
public class Controller extends HttpServlet{
  public void doGet(HttpServletRequest request,
		    HttpServletResponse response) throws IOException{
    Model model = new Model();
    List<String> content = model.getContent(request.getParameter("inputVal"));
    try{
      HttpSession session = request.getSession();
      if (session != null && session.getAttribute("returnVal") != null){
        List<String> oldContent = (ArrayList<String>)session.getAttribute("returnVal");
        content.addAll(oldContent);
      }
      session.setAttribute("returnVal", content);
      request.setAttribute("forEncode", "abc<>");
      RequestDispatcher view = request.getRequestDispatcher("result.jsp");
      view.forward(request,response);
    }
    catch(Exception e){}

  }
}
