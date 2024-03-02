import javax.servlet.GenericServlet
public LoginServlet extends GenericServlet {
  public void service(ServletRequest req, ServletResponse res) {
    
        String userName = req.getParameter("username");
        String passWord = req.getParameter("pword");
  
        if(userName.equals("charan") && passWord.equals("cherry")) {
            res.getRequestDispatcher().include("LoginPage.jsp");
        }
    }  
}
