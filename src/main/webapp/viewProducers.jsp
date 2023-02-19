<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Producers</title>
</head>
<body>

<h2>Производители</h2>

<table border="2">
    <tr>
        <td>ID</td>
        <td>Назавание</td>
        <td>Страна</td>
        <td></td>
        <td></td>
    </tr>
    <c:forEach items="${producers}" var = "producer">
        <tr>
            <td>${producer.getProducerId()}</td>
            <td>${producer.getProducerName()}</td>
            <td>${producer.getProducerCountry()}</td>
            <td>
                <form action = "editProducer" method="post">
                    <input type="hidden" name="id" value="${producer.getProducerId()}">
                    <input type="hidden" name="name" value="${producer.getProducerName()}">
                    <input type="hidden" name="country" value="${producer.getProducerCountry()}">
                    <input type="submit" value="Изменить" style="float:left">
                </form></td>
            <td>
                <form action="deleteProducer" method="post">
                    <input type="hidden" name="id" value="${producer.getProducerId()}">
                    <input type="submit" value="Удалить" style="float:left">
                </form></td>
        </tr>
    </c:forEach>
</table>

<br>
<form action = "addProducer">
    <input type="submit"  value="Добавить нового производителя"></span>
</form>

<br>
<form action = "/producersAdditionalFunctions.html">
    <input type="submit"  value="Дополнительные функции"></span>
</form>

<br>
<form action = "/index.jsp">
    <input type="submit"  value="Вернуться"></span>
</form>

</body>
</html>
