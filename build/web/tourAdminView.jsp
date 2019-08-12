<%-- 
    Document   : tourAdminView
    Created on : Mar 3, 2019, 11:51:49 PM
    Author     : Luu Thieu Gia
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tour View</title>
    </head>
    <body>
        
        <h3> <font color="blue"> View Tour </font> </h3>
        
        <a href="admin.jsp">
            <input type="button" value=" Back to Admin Index" />
        </a>
        </br>
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
       </br>

           <s:if test="%{list != null}">
            <table border="1">
               
                    <tr>
                        <th>No</th>
                        <th>Tour ID</th>
                        <th>Tour Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Number Ticket</th>
                        <th>Vehicle</th>
                        <th colspan="2"> Action </th>
                    </tr>
                        
                   <s:iterator value="list" status="number">
                    <tr>
                        <td><s:property value="%{#number.count}"/> </td>
                        <td><s:property value="tourID"/></td>
                        <td><s:property value="tourName"/></td>
                        <td><s:property value="description"/></td>
                        <td><s:property value="price"/></td>
                        <td><s:property value="numberTicket"/></td>
                        <td><s:property value="vehicle"/></td>
                        <td><a href="updateTourAction?tourID=<s:property value="tourID" />" 
                               <input type="button" value="Update" />
                            </a>
                        </td>
                        <td><a href="deleteTourAction?tourID=<s:property value="tourID" />" 
                              <input type="button" value="Delete" />
                            </a>
                        </td>
                    </tr>
                    
    
                    </s:iterator>

        
            </s:if>
    </body>
</html>
