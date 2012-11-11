<%-- 
    Document   : ViewAllClothes
    Created on : 13.10.2012, 11:05:12
    Author     : student
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" cellpadding="5" cellspacing="5">
        <tr>
            <th>ID</th>
            <th>MerchantID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Size</th>
        </tr>
 
        <c:forEach var="clothes" items="${allClothes}">
            <tr>
                <td>${clothes.ID}</td>
                <td>${clothes.merchantID}</td>
                <td>${clothes.name}</td>
                <td>${clothes.price}</td>
                <td>${clothes.size}</td>
            </tr>
        </c:forEach>
            
         <tr>
            <th>"Hello ${UserBean.lastName} ${UserBean.firstName}"</th>
        </tr>
    </table>
        
            
    </body>
</html>
