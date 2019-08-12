<%-- 
    Document   : admin
    Created on : Mar 3, 2019, 6:07:31 PM
    Author     : Luu Thieu Gia
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <font color="Blue">
            Welcome Admin, <s:property value="%{#session.USERNAME}" />
        </font>
       
        
        </br>
        
        <a href="manageTourAdmin.jsp">
        <input type="button" value="Manage Tour" />
        </a>
        </br>

        
        <a href="manageUserAdmin.jsp">
        <input type="button" value="Manage User" />
        </a>
        
        
        </br>
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
       </br>
        
      
    </body>
</html>
