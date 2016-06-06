<%--
  Created by IntelliJ IDEA.
  User: Johnny
  Date: 05/06/2016
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>${titulo}</title>
    <style type="text/css">
        @IMPORT url("${path}/static/bootstrap/css/bootstrap-theme.min.css");
        @IMPORT url("${path}/static/bootstrap/css/bootstrap.min.css");
    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>#</td>
        <td>nome</td>
        <td>categoria</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ingredientes}" var="ingrediente">
        <td>${ingrediente.id}</td>
        <td>${ingrediente.nome}</td>
        <td>${ingrediente.categoria}</td>
        <td>
            <button type="button" class="btn btn-warning btn-editar">Editar</button>
        </td>
        <td>
            <button type="button" class="btn btn-danger btn-deletar">Deletar</button>
        </td>
        </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <td colspan="3">Ingredientes Cadastrados: ${ingredientes.size()}</td>
    </tfoot>


</table>
<script type="text/javascript" src="${path}/static/js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
