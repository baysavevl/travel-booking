<%-- 
    Document   : searchTourAdmin
    Created on : Mar 12, 2019, 4:30:50 PM
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
       
        <font color="blue">
        Welcome Admin, <s:property value="%{#session.USERNAME}" />
        </font>
        
        <h4> Search Tour</h4>
        <s:form action="searchTourAdminAction">
            <s:textfield name="searchName" label="Search Value"/>
            <s:submit value = "Search" />
        </s:form>
        
        
        
       
            <s:if test="%{list!= null}">
                <s:if test="%{list!= null}">
                    <table border="1">
                        <thead>
                            <tr>
                                <th>No</th>
                                <th>Tour ID</th>
                                <th>Name</th>
                                <th>Description</th>
                                <th>Price</th>
                                
                                <th>Vehicle</th>
                                <th>Departure Location</th>
                                <th>Destination Location</th>
                                <th>Check In Date</th>
                                <th>Check Out Date</th>
                                <th>Image</th>
                                 <th colspan="2"> Action </th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="list" status="counter">
                                <tr>
                                <td>
                                    <s:property value="#counter.count"/>
                                </td>
                                <td>
                                    <s:property value="tourID" />
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
                                <img src="<s:property value="img"/>" 
                                                     width="100" height="100" />
                                </td>
                                <td> 
                                    <a href="editTourAction?tourID=<s:property value="tourID"/>">                                       
                                        <input type="button" value="Update" />
                                    </a>
                                </td>
                                <td> 
                                    <a href="deleteTourAction?tourID=<s:property value="tourID" />">
                                        <input type="button" value="Delete Tour" />
                                    </a>
                                </td>
                                </tr>
                            </s:iterator>
   
                        </tbody>
                    </table>
                </s:if>
                </s:if>
     
        </br>
        </br>

            
        <a href="manageTourAdmin.jsp">
        <input type="button" value="Back" />
        </a>
        
        
        <a href="admin.jsp">
        <input type="button" value="Home" />
        </a>
        </br>
        
        <a href="index.jsp">
            <input type="button" value="Logout" />
        </a>
        </br>
    </body>
</html>
