/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-11-09 17:42:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.project.connectionprovider.ConnectionProvider;
import java.sql.*;

public final class editProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1726653006232L));
    _jspx_dependants.put("/admin/adminHeader.jsp", Long.valueOf(1726650940164L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("com.project.connectionprovider.ConnectionProvider");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/d72ad669ec.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!--Get your own code at fontawesome.com-->\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("   \r\n");
      out.write("            <center><h2>Online shopping (BTech Days)</h2></center>\r\n");
      out.write("            <a href=\"addNewProduct.jsp\">Add New Product <i class=\"fa fa-plus-square\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("            <a href=\"allProductEditProduct.jsp\">All Products & Edit Products <i class=\"fab fa-elementor\"></i></a>\r\n");
      out.write("            <a href=\"messagesReceived.jsp\">Messages Received <i class=\"fas fa-comment-alt\"></i></a>\r\n");
      out.write("            <a href=\"ordersReceived.jsp\">Orders Received <i class=\"fas fa-archive\"></i></a>\r\n");
      out.write("            <a href=\"cancelOrders.jsp\">Cancel Orders <i class=\"fas fa-window-close\"></i></a>\r\n");
      out.write("            <a href=\"deliveredOrders.jsp\">Delivered Orders <i class=\"fas fa-dolly\"></i></a>\r\n");
      out.write("            <a href=\"../logout.jsp\">Logout <i class=\"fas fa-share-square\"></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write('\r');
      out.write('\n');
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved &copy; Online Shop</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/addNewProduct-style.css\">\r\n");
      out.write("<title>Add New Product</title>\r\n");
      out.write("<style>\r\n");
      out.write(".back\r\n");
      out.write("{\r\n");
      out.write("  color: white;\r\n");
      out.write("  margin-left: 2.5%\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <h2><a class=\"back\" href=\"allProductEditProduct.jsp\"><i class='fas fa-arrow-circle-left'> Back</i></a></h2>\r\n");
      out.write("\r\n");

String id = request.getParameter("id");
try(Connection connection=ConnectionProvider.getConnection();
		Statement statement = connection.createStatement())
{
	String sql =  "select * from product where id ='"+id+"'";
	ResultSet rs=statement.executeQuery(sql);
	while(rs.next())
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"editProductAction.jsp\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"id\" value=\"");
 out.println(id); 
      out.write("\">\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write(" <h3>Enter Name</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"name\" value=\"");
      out.print(rs.getString("name") );
      out.write("\">\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Enter Category</h3>\r\n");
      out.write(" <input class=\"input-style\" type=\"text\" name=\"category\" value=\"");
      out.print(rs.getString("category") );
      out.write("\">\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Enter Price</h3>\r\n");
      out.write(" <input class=\"input-style\" type=\"text\" name=\"price\" value=\"");
      out.print(rs.getString("price") );
      out.write("\">\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Active</h3>\r\n");
      out.write("<select class=\"input-style\" name=\"active\">\r\n");
      out.write("   <option value=\"Yes\">Yes</option>\r\n");
      out.write("   <option value=\"No\">No</option>\r\n");
      out.write("   </select>\r\n");
      out.write(" <hr>\r\n");
      out.write("</div>\r\n");
      out.write("<button class=\"button\">Save <i class='far fa-arrow-alt-circle-right'></i></button>\r\n");
      out.write("</form>\r\n");

}
}
catch(Exception e)
{
	e.printStackTrace();
}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
