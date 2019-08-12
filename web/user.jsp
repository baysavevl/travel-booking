<%-- 
    Document   : user
    Created on : Mar 3, 2019, 6:08:09 PM
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
        <font color="green">
        Welcome, <s:property value="%{#session.USERNAME}" />
        </font>
        
        <br/>
        <br/>
        <br/>
        <a href="searchTourUser.jsp">
            <input type="button" value="Book Tour" />
        </a>
        </br>
        
   
        
        <a href="editUserAction?userID=<s:property value="%{#session.ID}" />">                                       
           <input type="button" value="Update My Info" />
        </a> 
        </br>
        
        <a href="editPasswordUserAction?userID=<s:property value="%{#session.ID}" />">                                       
           <input type="button" value="Update Password" />
        </a> 
        </br>

        <br/> 
         
        <a href="viewCartUserAction?userID=<s:property value="%{#session.ID}"/>">                                       
           <input type="button" value="View Cart" />
        </a> 
        </br>
         
         
         
         <a href="index.jsp">
            <input type="button" value="Logout" />
         </a>
         </br>
        
    </body>
</html>
