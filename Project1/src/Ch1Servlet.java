import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch1Servlet extends HttpServlet {

//  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
//    PrintWriter out = response.getWriter();
//    java.util.Date today = new java.util.Date();
//    out.println("<html>" + "<body>" + "<h1 align=center>HF\'s Chapter1 Servlet</h1>" +"<br>" + today+"</body>" +"</html>" );
//  }
   
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    String c = request.getParameter("color");
    BeerExpert be = new BeerExpert();
    List result = be.getBrands(c);
    
//    response.setContentType("text/html");
//    PrintWriter out = response.getWriter();
//    out.println("Beer Selection Advice<br>");
    
//    Iterator<String> it = result.iterator();
//    while(it.hasNext()) {
//      out.print("<br>try: "+it.next());
//    } 
    
    request.setAttribute("styles", result);
    
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
    
  }
}
