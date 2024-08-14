package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private String jokes[]= {
			"Java developer dont have brain to write c++ ",
			"Java questions is Better than wife questions",
			"Coders are fatty and foody",
			"java runs faster then python because total number of letters"
	};
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		String s3=request.getParameter("option");
		
		if(s1==null ||s2==null || s1.isEmpty() || s2.isEmpty()){
			response.getWriter().append("Numbers are Not Entered");
			return;
	 }
		
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		double ans = 0;
		
		if(s3.equals("1")) ans=num1+num2;
		else if(s3.equals("2")) ans=num1-num2;
		else if(s3.equals("3")) ans=num1*num2;
		else if (s3.equals("4")) {
            if (num2 != 0) {
                ans = num1 / (double) num2;
            } else {
                response.getWriter().append("Cannot divide by zero.");
                return;
            }
		}
		int randomindex=(int)(Math.random()*jokes.length);
		String joke=jokes[randomindex];
		//response.getWriter().append("Ans : "+ans);
		response.sendRedirect("NewFile.jsp?ans="+ans+"&joke="+joke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		response.getWriter().append("DoPost is Calling");
	}

}
