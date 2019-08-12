<%-- 
    Document   : index
    Created on : Mar 3, 2019, 5:20:50 PM
    Author     : Luu Thieu Gia
--%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Login Page</h1>
        <s:form action="loginAction" method="POST">
             <s:textfield name="username" label="Username"></s:textfield>
             <s:password  name="password" label="Password"></s:password>
            <s:submit value="Login"/>
        </s:form>
        
        
        <a href="registration.jsp">
            <input type="button" value="Register" />
        </a>
        <br/>
    </body>
</html>
