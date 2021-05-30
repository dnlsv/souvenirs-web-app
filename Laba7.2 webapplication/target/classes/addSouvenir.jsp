<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Souvenir</title>
</head>
<body>

<%--<p style="text-align:center"><span style="font-size:22px">Добавление сувенира</span></p>--%>
<h3>&nbsp&nbsp&nbsp&nbsp&nbspДобавление сувенира</h3>

<form action = "addSouvenir" method = "post">
    <p><%--<span style="font-size:18px">--%>Название сувенира&nbsp;
    <input name="nameOfSouvenir" <%--required="required"--%> type="text" /><%--</span>--%></p>

    <p><%--<span style="font-size:18px">--%>Реквизиты производителя&nbsp;
    <input name="producerDetails" <%--required="required"--%> type="text" /><%--</span>--%></p>

    <p><%--<span style="font-size:18px">--%>Дата выпуска&nbsp;
    <input name="releaseDate" <%--required="required"--%> type="text" /><%--</span>--%></p>

    <p><%--<span style="font-size:18px">--%>Цена&nbsp;
    <input name="price" <%--required="required"--%> type="text" /><%--</span>--%></p>

    <input type = "submit" value = "Добавить">
</form>

<form action = "viewSouvenirs">
    <input type="submit"  value="Вернуться к сувенирам">
</form>

</body>
</html>
