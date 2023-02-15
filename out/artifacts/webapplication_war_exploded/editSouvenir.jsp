<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Souvenir</title>
</head>
<body>

<h3>&nbsp&nbsp&nbsp&nbsp&nbspИзменение данных сувенира</h3>

<form action="editSouvenir" method="post">
    <input type="hidden" name = "id" value="${param.id}">
    <input type="text" name="name" value="${param.name}" placeholder=${param.name}>
    <input type="text" name="details" value="${param.details}" placeholder=${param.details}>
    <input type="text" name="date" value="${param.date}" placeholder=${param.date}>
    <input type="text" name="price" value="${param.price}" placeholder=${param.price}>
    <input type="hidden" name="_method" value="edit">
    <input type="submit" value="Обновить">
</form>

<form action="viewSouvenirs">
    <input type="submit" value="Вернуться к сувенирам">
</form>

</body>
</html>
