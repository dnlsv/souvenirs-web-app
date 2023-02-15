<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Souvenir</title>
</head>
<body>

<h3>&nbsp&nbsp&nbsp&nbsp&nbspУдаление сувенира</h3>

Вы действительно хотите удалить сувенир ${param.id}?

<form action="deleteSouvenir" method="post">
    <input type="hidden" name="id" value="${param.id}">
    <input type="hidden" name="_method" value="delete">
    <br><input type="submit" value="Удалить" name="del">
</form>

<form action="viewSouvenirs">
    <input type="submit" value="Вернуться к сувенирам">
</form>

</body>
</html>