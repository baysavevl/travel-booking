<%-- 
    Document   : updateInfoUsẻ.jsp
    Created on : Mar 16, 2019, 5:13:13 PM
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
        <font color="green">
        Welcome, <s:property value="%{#session.USERNAME}" />
        </font>
        
       <h4>Update Info</h4>
       
        <s:form action="updateUserAction" method="POST">
            <s:textfield name="userID" label= "User ID" value="%{user.userID}" readonly="true"/>
            <s:textfield name="username" label= "User Name" value="%{user.username}" readonly="true"/>
            <s:textfield name="fullname" label= "Fullname" value="%{user.fullname}"/>
            <s:textfield name="email" label= "Email" value="%{user.email}"/>
            <s:textfield name="phone" label= "Phone" value="%{user.phone}"/>
            <s:textfield name="address" label= "Address" value="%{user.address}"/>
            
            <s:submit value="Update" />
        </s:form>
       
       
       <a href="user.jsp">
        <input type="button" value="Back" />
        </a>
        
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
        </br>
    </body>
</html>
