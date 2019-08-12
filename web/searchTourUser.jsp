<%-- 
    Document   : searchTourUser
    Created on : Mar 12, 2019, 4:31:03 PM
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
    <font color="green">
            Welcome, <s:property value="%{#session.USERNAME}" />
    </font>
  
    <h4> Search Tour</h4>
    <s:form action="searchTourUserAction">
        <s:textfield name="searchName" label="Input Tour Name"/>
        <s:submit value = "Search" />
    </s:form>


            <s:if test="%{list!= null}">
                <table border="1">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Price</th>
                            
                            <th>Vehicle</th>
                            <th>Departure Location</th>
                            <th>Destination Location</th>
                            <th>Check In Date</th>
                            <th>Check Out Date</th>
                            
                            <th>BOOK</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="list" status="counter">
                            <tr>
                                <td>
                                    <s:property value="#counter.count"/>
                                </td>
                                <td>
                                    <s:property value="tourName" />
                                </td>
                                <td>
                                    <s:property value="description" />
                                </td>
                                <td>
                                    <s:property value="price" />
                                </td>
                                

                                <td>
                                    <s:property value="vehicle" />
                                </td>
                                <td>
                                    <s:property value="depLocation" />
                                </td>
                                <td>
                                    <s:property value="desLocation" />
                                </td>
                                <td>
                                    <s:property value="checkInDate" />
                                </td>
                                <td>
                                    <s:property value="checkOutDate" />
                                </td>
                               
                                <td> 
                                    <a href="addToCartAction?tourID=<s:property value="tourID" />">                                       
                                        <input type="button" value="Book" />
                                    </a>
                                </td>

                            </tr>
                        </s:iterator>

                    </tbody>
                </table>
            </s:if>
        
        
        </br>
 

   
    <a href="viewCartUserAction?userID=<s:property value="%{#session.ID}"/>">                                       
        <input type="button" value="View Cart" />
    </a> 
    </br>

    <br/>
    <br/>

    <a href="user.jsp">
        <input type="button" value="Home" />
    </a>
    </br>

    <a href="index.jsp">
        <input type="button" value="Logout" />
    </a>
    </br>
</html>
