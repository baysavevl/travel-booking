<%-- 
    Document   : viewCartUser
    Created on : Mar 17, 2019, 12:28:15 PM
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
        <h4>Your Cart's Items include</h4>
        
        <s:if test="%{#session.ID != 0}">
            <s:if test="listCart != null">
            <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                        <th colspan="4"> Action </th>
                    </tr>
                </thead>
                <tbody>
                    
                        <s:iterator value="listCart" status="counter">
                    
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
                        <td> 
                            <a href="payTourAction?billID=<s:property value="billID"/>">                                       
                                <input type="button" value="PAY" />
                            </a>
                        </td>
                        <td> 
                            <a href="viewTourDetailUserAction?tourID=<s:property value="tourID"/>">                                       
                                <input type="button" value="View Detail" />
                            </a>
                        </td>
                        <td> 
                            <a href="editNumberCartAction?billID=<s:property value="billID"/>">                                       
                                <input type="button" value="Modify" />
                            </a>
                        </td>
                        <td> 
                            <a href="removeFromCartAction?billID=<s:property value="billID"/>">                                       
                                <input type="button" value="Remove From Cart" />
                            </a>
                        </td>
                        
                    </tr>
                        </s:iterator>
                    </s:if> 
                </tbody>
            </table>
            
            
            
            
        
        <s:if test="listCart == null">
            <font color="red"> You haven't bought anything </font>
        </s:if>
            
         
            
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
                        <th>Action</th>
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
                        
                        <td> 
                            <a href="viewTourDetailUserAction?tourID=<s:property value="tourID"/>">                                       
                                <input type="button" value="View Detail" />
                            </a>
                        </td>
                       
                        
                    </tr>
                        </s:iterator>
                    
                    </br>
                <font color="blue">
                Total You Paid : <s:property value="%{#session.TOTAL}" />
                </font>
                    
                    
                     </s:if>
                   
                </tbody>
            </table>
            

            
            
       
        <s:if test="%{listPaidCart == null}">
            <font color="red"> No Paid Cart is existed </font>
        </s:if>
            
       </s:if>
            
            
        <a href="user.jsp">
        <input type="button" value="Back" />
        </a>
        
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
        </br>    
    </body>
</html>
