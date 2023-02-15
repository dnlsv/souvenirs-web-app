<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Information about manufacturers whose souvenir prices are less than the specified one</title>
</head>
<body>

<h3>&nbsp&nbsp&nbsp&nbsp&nbspИнформация о производителях, чьи цены на сувениры меньше заданной</h3>

<form action = "producersPrice" method = "post">
    Цена сувенира&nbsp;
    <input name="price" type="text" />
    &nbsp&nbsp&nbsp<input type = "submit" value = "Найти">
</form>

<h3>Производители</h3>

<table border="2">
    <tr>
        <td>ID</td>
        <td>Назавание</td>
        <td>Страна</td>
    </tr>
    <c:forEach items="${producers}" var = "producer">
        <tr>
            <td>${producer.getProducerId()}</td>
            <td>${producer.getProducerName()}</td>
            <td>${producer.getProducerCountry()}</td>
        </tr>
    </c:forEach>
</table>

<br>
<form action = "/webapplication_war_exploded/producersAdditionalFunctions.html">
    <input type="submit"  value="Вернуться к функциям"></span>
</form>

</body>
</html>
