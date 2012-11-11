<%-- 
    Document   : AddNewClothes
    Created on : 13.10.2012, 11:04:55
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="ClothesServlet" METHOD="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Clothes Name</td>
                        <td><INPUT TYPE="text" NAME="clothesName" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><INPUT TYPE="text" NAME="clothesPrice" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                    <tr>
                        <td>Size</td>
                        <td><INPUT TYPE="text" NAME="clothesSize" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                    <tr>
                        <td>ID</td>
                        <td><INPUT TYPE="text" NAME="clothesID" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                     <tr>
                        <td>MerchantID</td>
                        <td><INPUT TYPE="text" NAME="clothesMerchantID" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                    <tr>
                        <td><INPUT TYPE="submit" NAME="sendbtn"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
