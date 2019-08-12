<%-- 
    Document   : ModifyTourUserAction
    Created on : Mar 17, 2019, 4:30:10 PM
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
        <s:form action="modifyTourUserAction" method="POST">
        <s:textfield name="tourID" label= "Tour ID" value="%{bill.tourID}" readonly="true"/>
        
        <s:textfield name="price" label= "Price" value="%{bill.price}" readonly="true"/>
        </br>
        </br>
        <s:textfield name="number" label= "Modify Number Ticket" value="%{bill.number}"/>
        <s:submit value="Update" />
        </s:form>
        
        <a href="viewCartUserAction?userID=<s:property value="%{#session.ID}"/>">                                       
        <input type="button" value="View Cart" />
        </a> 
        </br>
    </body>
</html>
