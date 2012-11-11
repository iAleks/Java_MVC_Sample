<%-- 
    Document   : Login
    Created on : 10.11.2012, 12:26:23
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
        <h1>Enter your login and password or Register</h1>
        <form action="LR2LoginServlet" METHOD="POST">
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
                        <td><INPUT TYPE="submit" NAME="postAction" value="Log In"></td>
                    </tr>
                    <tr>
                        <td><INPUT TYPE="submit" NAME="postAction" value="Register"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
