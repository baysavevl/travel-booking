<%-- 
    Document   : insertTour
    Created on : Mar 4, 2019, 11:35:23 AM
    Author     : Luu Thieu Gia
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-dojo-tags" prefix="sx" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Tour</title>
        <sx:head/>
        <s:head/>
    </head>
    <body>
        <font color="Blue">
            Welcome Admin, <s:property value="%{#session.USERNAME}" />
        </font>
        <h4>Insert Tour</h4>
        <s:form action="insertTourAction" method="POST">           
            <s:textfield name = "tourName" label="Tour Name"/>
            <s:textfield name = "description" label="Description"/>
            <s:textfield name = "price" label="Price"/>
            <s:textfield name = "numberTicket" label="Number Ticket"/>
            <s:textfield name = "vehicle" label="Vehicle"/> 
             
            <s:textfield name = "depLocation" label="Departure Location"/> 
            
            
            <s:textfield name = "desLocation" label="Destination Location"/> 
            
            <sx:datetimepicker name="checkInDate" label="Check In Date (yyyy-MMM-dd)" 
                    displayFormat="yyyy-MMM-dd" value="Check In Date"/>
            <sx:datetimepicker name="checkOutDate" label="Check Out Date (yyyy-MMM-dd)" 
                    displayFormat="yyyy-MMM-dd" value="Check Out Date"/>
            
            
            <h5>Choose File & Upload</h5>  
            <s:form action="/upload/perform-upload" method="post" enctype="multipart/form-data" theme="simple">  
                <s:file name="img"   
                        title="Choose File to Upload"  
                        accept=".doc,.jar,image/png,video/*"   
                        />  
                <button>Upload</button>  
                <br/><br/>  
                <s:if test="successMsg != null">  
                </s:if>  
                <s:fielderror cssStyle="color:red;"></s:fielderror>  
            </s:form>  
            
            
            <s:submit value="Insert"/>
                    
        </s:form>
        
        
        <a href="admin.jsp">
            <input type="button" value="Back" />
        </a>
       </br>
    </body>
</html>
