<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Producer</title>
</head>
<body>

<h3>&nbsp&nbsp&nbsp&nbsp&nbspИзменение данных производителя</h3>

<form action="editProducer" method="post">
    <input type="hidden" name = "id" value="${param.id}">
    <input type="text" name="name" value="${param.name}" placeholder=${param.name}>
    <input type="text" name="country" value="${param.country}" placeholder=${param.country}>
    <input type="hidden" name="_method" value="edit">
    <input type="submit" value="Обновить">
</form>

<form action="viewProducers">
    <input type="submit" value="Вернуться к производителям">
</form>

</body>
</html>
