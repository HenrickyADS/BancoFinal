

<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Extrato</title>
    </head>
    <body>
        <%
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/banco?zeroDateTimeBehavior=convertToNull","root","123456");
            PreparedStatement  p =  c.prepareStatement("select * from banco");
            ResultSet r =  p.executeQuery() ; %>
            <table border="1" > 
                <tr> 
                    <td> Id </td>
                    <td> Cpf  </td>
                  
					</tr>
           <% while (r.next()){ %>
            <tr> 
                
            <td><%=r.getString("Id")%>  </td>
            <td> <%=r.getString("Cpf")%> </td>
			   
            </tr>
            <%}
        } catch (Exception ex) {
          response.getWriter().print("Erro na conexão: " + ex.getMessage());
        }
        %>
            </table>
    </body>
</html>
