package main;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Controller extends HttpServlet{
  public void doGet(HttpServletRequest request,
		    HttpServletResponse response) throws IOException{
    Model model = new Model();
    HttpSession session = request.getSession();
    List<String> content = model.getContent(request.getParameter("inputVal"));
    List<String> newContent = (ArrayList<String>)session.getAttribute("returnVal");
    if(newContent != null){
      content.addAll(newContent);
    }
    try{
      session.setAttribute("returnVal", content);
      RequestDispatcher view = request.getRequestDispatcher("result.jsp");
      view.forward(request,response);
    }
    catch(Exception e){}

  }
}
