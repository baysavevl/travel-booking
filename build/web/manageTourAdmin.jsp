<%-- 
    Document   : manageTourAdmin
    Created on : Mar 15, 2019, 9:59:51 PM
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
        
        <h1>Manage Tour</h1>
        
        <a href="insertTour.jsp">
            <input type="button" value=" Insert Tour" />
        </a>
        <br/>
        
        <a href="searchTourAdmin.jsp">
            <input type="button" value=" Search Tour" />
        </a>
        <br/>
        
       
        
        <a href="admin.jsp">
        <input type="button" value="HOME" />
        </a>
        </br>
    </body>
</html>
