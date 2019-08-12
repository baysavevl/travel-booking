<%-- 
    Document   : manageUserAdmin
    Created on : Mar 15, 2019, 10:00:07 PM
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
        
        <h4>Manage User</h4>
        
        <a href="searchUserAdmin.jsp">
            <input type="button" value=" Search User" />
        </a>
        <br/>
        
        
        <a href="admin.jsp">
        <input type="button" value="HOME" />
        </a>
        </br>
    </body>
</html>
