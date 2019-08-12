<%-- 
    Document   : registration
    Created on : Mar 4, 2019, 1:37:25 PM
    Author     : Luu Thieu Gia
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <s:head/>
    </head>
    <body>
        <h3>Registration</h3>
        <s:form action="insertUserAction" method="POST">
            <s:textfield name = "username" label="Username"/>
            <s:textfield name = "fullname" label="Fullname"/>
            <s:password name = "password" label="Password"/>
            <s:password name = "confirmPassword" label="Confirm Password"/>
            <s:textfield name = "email" label="Email"/>
            <s:textfield name = "phone" label="Phone"/> 
            <s:textfield name = "address" label="Address"/> 
            <s:submit value="Insert"/>
                    
        </s:form>
        
        
        <a href="index.jsp">
            <input type="button" value="Back" />
        </a>
       </br>
    </body>
</html>
