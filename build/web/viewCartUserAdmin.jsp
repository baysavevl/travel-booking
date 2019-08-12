<%-- 
    Document   : viewCartUserAdmin
    Created on : Mar 17, 2019, 10:27:22 PM
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
       <font color="Blue">
            Welcome Admin, <s:property value="%{#session.USERNAME}" />
        </font>
        
            
        <h4>Your Paid Cart's Items include</h4>   
        <s:if test="listPaidCart != null">
            <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                        
                    </tr>
                </thead>
                <tbody>
                    
                        <s:iterator value="listPaidCart" status="counter">
                    
                    <tr>
                        <td>
                            
                            <s:property value="#counter.count" />
                        </td>
                        <td>
                            <s:property value="tourID" />
                        </td>
                        <td>
                            <s:property value="number" />
                        </td>
                        <td>
                            <s:property value="price" />
                        </td>
                        <td>
                            <s:property value="total" />
                          
                        </td>
   
                    </tr>
                        </s:iterator>
                    
                    </br>
 
                     </s:if>
                   
                </tbody>
            </table>
            

            
            
       
        <s:if test="%{listPaidCart == null}">
            <font color="red"> No Paid Cart is existed </font>
        </s:if>
            
      
            
            <br/>
        <a href="manageUserAdmin.jsp">
        <input type="button" value="Back" />
        </a>
        
        
        <a href="index.jsp">
            <input type="button" value="Logout" />
        </a>
        </br>    
    </body>
</html>
