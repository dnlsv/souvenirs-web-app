<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Producer</title>
</head>
<body>

<h3>&nbsp&nbsp&nbsp&nbsp&nbspДобавление производителя</h3>

<form action = "addProducer" method = "post">
    <p>Название производителя&nbsp;
        <input name="nameOfProducer" type="text" /></p>

    <p>Страна производителя
        <input name="Country" type="text" /></p>

    <input type = "submit" value = "Добавить">
</form>

<form action = "viewProducers">
    <input type="submit"  value="Вернуться к производителям">
</form>

</body>
</html>
