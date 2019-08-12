<%-- 
    Document   : updateTour
    Created on : Mar 4, 2019, 12:08:57 PM
    Author     : Luu Thieu Gia
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-dojo-tags" prefix="sx" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Tour</title>
        <sx:head/>
        <s:head/>
    </head>
    <body>
        <h1>Update Tour</h1>
        <s:form action="updateTourAction" method="POST">
            <s:textfield name="tourID" label= "Tour ID" value="%{tour.tourID}" readonly="true"/>
            <s:textfield name="tourName" label= "Tour Name" value="%{tour.tourName}" />
            <s:textfield name="description" label= "Description" value="%{tour.description}"/>
            <s:textfield name="price" label= "Price" value="%{tour.price}"/>
            <s:textfield name="numberTicket" label= "Number Ticket" value="%{tour.numberTicket}"/>
            <s:textfield name="vehicle" label= "Vehicle" value="%{tour.vehicle}"/>
            <s:textfield name="depLocation" label= "Depart Location" value="%{tour.depLocation}"/>
            <s:textfield name="desLocation" label= "Destinate Location" value="%{tour.desLocation}"/>
            
            <sx:datetimepicker name="checkInDate" label="Check In Date (yyyy-MMM-dd)" 
                    displayFormat="yyyy-MMM-dd" value="%{tour.checkInDate}"/>
            <sx:datetimepicker name="checkOutDate" label="Check Out Date (yyyy-MMM-dd)" 
                    displayFormat="yyyy-MMM-dd" value="%{tour.checkOutDate}"/>
            
            
            
            <s:textfield name="img" label= "Image" value="%{tour.img}"/>
            <s:submit value="Update" />
            
            
        <a href="manageTourAdmin.jsp">
        <input type="button" value="Back" />
        </a>
        
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
        </br>
        </s:form>
    </body>
</html>
