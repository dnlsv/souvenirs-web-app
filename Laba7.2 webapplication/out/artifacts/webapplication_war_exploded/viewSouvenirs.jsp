<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Souvenirs</title>
</head>
<body>

<h2>Сувениры</h2>

<table border="2">
    <tr>
        <td>ID</td>
        <td>Название</td>
        <td>Характеристики производителя</td>
        <td>Дата выпуска</td>
        <td>Цена</td>
        <td></td>
        <td></td>
    </tr>
    <c:forEach items="${souvenirs}" var = "souvenir">
        <tr>
            <td>${souvenir.getId()}</td>
            <td>${souvenir.getName()}</td>
            <td>${souvenir.getDetails()}</td>
            <td>${souvenir.getDate()}</td>
            <td>${souvenir.getPrice()}</td>
            <td>
                <form action = "editSouvenir" method="post">
                    <input type="hidden" name="id" value="${souvenir.getId()}">
                    <input type="hidden" name="name" value="${souvenir.getName()}">
                    <input type="hidden" name="details" value="${souvenir.getDetails()}">
                    <input type="hidden" name="date" value="${souvenir.getDate()}">
                    <input type="hidden" name="price" value="${souvenir.getPrice()}">
                    <input type="submit" value="Изменить" style="float:left">
                </form></td>
            <td>
                <form action="deleteSouvenir" method="post">
                    <input type="hidden" name="id" value="${souvenir.getId()}">
                    <input type="submit" value="Удалить" style="float:left">
                </form></td>
        </tr>
    </c:forEach>
</table>

<br>
<form action = "addSouvenir">
    <input type="submit"  value="Добавить новый сувенир"></span>
</form>

<br>
<form action = "/webapplication_war_exploded/souvenirsAdditionalFunctions.html">
    <input type="submit"  value="Дополнительные функции"></span>
</form>

<br>
<form action = "/webapplication_war_exploded/index.jsp">
    <input type="submit"  value="Вернуться"></span>
</form>

<%--<br>
<button type="submit"
        onClick="location.href='http://localhost:8080/webapplication_war_exploded/index.jsp'">
    Дополнительные функции</button>

<button type="submit"
        onClick="location.href='http://localhost:8080/webapplication_war_exploded/index.jsp'">
    Вернуться</button>--%>

</body>
</html>

<%--<hr />
<p><%if (request.getAttribute("souvenirs") != null) {
    out.println("<p>" + request.getAttribute("souvenirs").toString() + "</p>");
}
if (request.getAttribute("souvenirs") == null)
    out.println("<p>" + "СУУУУУУУКААААААА" + "</p>");%></p>
<hr />--%>

<%--<%
        ArrayList<Souvenir> souvenirs = (ArrayList<Souvenir>) request.getAttribute("objectOfSouvenirs");
        if (souvenirs == null)
            System.out.println("Как так то!!!!!!!");
        else
            System.out.println("Не может быть!!!!");
    %>--%>
