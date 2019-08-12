<%-- 
    Document   : searchUserAdmin
    Created on : Mar 12, 2019, 4:31:42 PM
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
        
        
        <s:form action="searchUserAdminAction">
            <s:textfield name="searchUserName" label="Search userName"/>
            <s:submit value = "Search" />
        </s:form>

            <s:if test="%{listUser!= null}">
                <s:if test="%{listUser!= null}">
                    <table border="1">
                        <thead>
                            <tr>
                                <th>No</th>
                                <th>Account Name</th>
                                <th>Full Name</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Address</th>
                                
                                 <th colspan="2"> Action </th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="listUser" status="counter">
                                <tr>
                                <td>
                                    <s:property value="#counter.count"/>
                                </td>
                                <td>
                                    <s:property value="username" />
                                </td>
                                <td>
                                    <s:property value="fullname" />
                                </td>
                                <td>
                                    <s:property value="email" />
                                </td>
                                <td>
                                    <s:property value="phone" />
                                </td>
                                
                                <td>
                                    <s:property value="address" />
                                </td>
                                
                                <td> 
                                    <a href="deleteUserAdminAction?userID=<s:property value="userID" />">                                       
                                        <input type="button" value="Ban" />
                                    </a>
                                </td>
                                <td> 
                                    <a href="viewCartAdminAction?userID=<s:property value="userID" />">
                                        <input type="button" value="View Cart" />
                                    </a>
                                </td>
                                </tr>
                            </s:iterator>
   
                        </tbody>
                    </table>
                </s:if>
                </s:if>
        <s:if test="%{listUser==null}">
            No record
        </s:if>

        
       <br/>
       </br>

        
            
        <a href="admin.jsp">
        <input type="button" value=" Back" />
        </a>
        </br>
        
        <a href="index.jsp">
            <input type="button" value=" Logout" />
        </a>
        </br>
    </body>
        
        
    </body>
</html>
