<%--
  Created by IntelliJ IDEA.
  User: xxtyo
  Date: 10/29/2020
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ứng dụng Product Discount Calculator</title>
</head>
<body>
<form method="post" action="/calculate">
    <h1>Product Discount Calculator</h1>
    <h2>== C0720I1 ==</h2>
    <hr>
    <input type="text" name="desc" placeholder="Description"/>
    <br>
    <br>
    <input type="text" name="price" placeholder="Price"/>
    <br>
    <br>
    <input type="text" name="percent" placeholder="Discount Percent"/>
    <br>
    <br>
    <input type="submit" value="Calculate Discount"/>
</form>
</body>
<style>
    input {
        height: 50px;
        width: 250px;
        font-size: larger;
    }
</style>
</html>

