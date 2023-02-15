<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Producer</title>
</head>
<body>

<h3>&nbsp&nbsp&nbsp&nbsp&nbspУдаление производителя</h3>

Вы действительно хотите удалить производителя ${param.id}?

<form action="deleteProducer" method="post">
    <input type="hidden" name="id" value="${param.id}">
    <input type="hidden" name="_method" value="delete">
    <br><input type="submit" value="Удалить" name="del">
</form>

<form action="viewProducers">
    <input type="submit" value="Вернуться к производителям">
</form>

</body>
</html>