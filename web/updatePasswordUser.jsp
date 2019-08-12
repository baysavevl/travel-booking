<%-- 
    Document   : updatePasswordUser
    Created on : Mar 16, 2019, 5:13:43 PM
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
        <h1>Reset Password</h1>
        <s:form action="resetPasswordUserAction" method="POST">
            <s:password name="oldPassword" label= "Input current password" />
            <s:password name="newPassword" label= "New Password" />
            <s:password name="confirmPassword" label= "Confirm Password" />

            <s:submit value="Reset Password" />
        </s:form>
        <font color="red">
            <s:property value="%{annouce}" />
        </font>
        
        </br>
        
        <a href="user.jsp">
        <input type="button" value="Back" />
        </a>
        
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
        </br>
    </body>
</html>
