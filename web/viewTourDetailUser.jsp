<%-- 
    Document   : viewTourDetailUser
    Created on : Mar 17, 2019, 4:23:39 PM
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
        <h1>Welcome , <s:property value="%{#session.USERNAME}" /></h1>
        <s:form action="detail" method="POST">
            <s:textfield name="tourID" label= "Tour ID" value="%{tour.tourID}" readonly="true"/>

            <s:textfield name="tourName" label= "Tour Name" value="%{tour.tourName}" readonly="true"/>

            <s:textfield name="price" label= "Price" value="%{tour.price}" readonly="true"/>

            <s:textfield name="vehicle" label= "Vehicle" value="%{tour.vehicle}" readonly="true"/>

            <s:textfield name="checkInDate" label= "Check In Date" value="%{tour.checkInDate}" readonly="true"/>

            <s:textfield name="checkOutDate" label= "Check Out Date" value="%{tour.checkOutDate}" readonly="true"/>

            <s:textfield name="depLocation" label= "Depart Location" value="%{tour.depLocation}" readonly="true"/>

            <s:textfield name="desLocation" label= "Destinate Location" value="%{tour.desLocation}" readonly="true"/>

            <s:textfield name="img" label= "Image" value="%{tour.address}" readonly="true"/>

            <s:textfield name="description" label= "Description" value="%{tour.description}" readonly="true"/>
        </s:form>
        
        
     <a href="user.jsp">
        <input type="button" value="Home" />
        </a>
        
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
        </br>   

    </body>
</html>
