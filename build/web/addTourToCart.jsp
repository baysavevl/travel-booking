<%-- 
    Document   : addTourToCart
    Created on : Mar 17, 2019, 1:41:30 PM
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
        <h1>Add Tour to Cart</h1>
        <s:form action="addThisToCartAction" method="POST">
        <s:textfield name="tourID" label= "Tour ID" value="%{tour.tourID}" readonly="true"/>
        <s:textfield name="tourName" label= "Tour Name" value="%{tour.tourName}" readonly="true"/>
        <s:textfield name="price" label= "Price" value="%{tour.price}" readonly="true"/>
        </br>
        </br>
        <s:textfield name="number" label= "Add Number Ticket" value="1"/>
        <s:submit value="Add" />
        </s:form>
        
        <a href="searchTourUser.jsp">
        <input type="button" value="Back" />
        </a>
        
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
        </br> 
        
    </body>
</html>
