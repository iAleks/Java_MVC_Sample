<%-- 
    Document   : Register
    Created on : 10.11.2012, 12:26:33
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
        <h1>Please enter your personal data!</h1>
        <form action="LR2RegisterServlet" METHOD="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Login</td>
                        <td><INPUT TYPE="text" NAME="login" SIZE="15" MAXLENGTH="30"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><INPUT TYPE="text" NAME="password" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                    <tr>
                        <td>First Name</td>
                        <td><INPUT TYPE="text" NAME="firstname" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><INPUT TYPE="text" NAME="lastname" SIZE="15" MAXLENGTH="20"></td>
                    </tr>
                    <tr>
                        <td><INPUT TYPE="submit" NAME="register" value="Register"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
