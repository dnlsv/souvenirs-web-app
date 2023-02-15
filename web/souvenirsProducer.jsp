<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 25.11.2020
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Information about souvenirs of a given producer</title>
</head>
<body>

<h3>&nbsp&nbsp&nbsp&nbsp&nbspИнформация о сувенирах заданного производителя</h3>

<form action = "souvenirsProducer" method = "post">
    Название производителя&nbsp;
        <input name="nameOfProducer" type="text" />
    &nbsp&nbsp&nbsp<input type = "submit" value = "Найти">
</form>

<h3>Сувениры</h3>

<table border="2">
    <tr>
        <td>ID</td>
        <td>Название</td>
        <td>Характеристики производителя</td>
        <td>Дата выпуска</td>
        <td>Цена</td>
    </tr>
    <c:forEach items="${souvenirs}" var = "souvenir">
        <tr>
            <td>${souvenir.getId()}</td>
            <td>${souvenir.getName()}</td>
            <td>${souvenir.getDetails()}</td>
            <td>${souvenir.getDate()}</td>
            <td>${souvenir.getPrice()}</td>
        </tr>
    </c:forEach>
</table>

<br>
<form action = "/webapplication_war_exploded/souvenirsAdditionalFunctions.html">
    <input type="submit"  value="Вернуться к функциям"></span>
</form>

</body>
</html>
