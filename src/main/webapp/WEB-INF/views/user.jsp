<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><c:out value="${user.name}"/></title>
</head>
<body>
<b> Your ID </b> <c:out value="${user.id}"/> <br>
<b> Your User Name</b> <c:out value="${user.name}"/> <br>
<b> Your Password </b> <c:out value="${user.password}"/> <br>
<b> Your Role </b> <c:out value="${attachments.iterator().next()}"/><br>
<c:if test="${attachments.iterator().next().id}=='admin'}">
    <form method="get" action="/admin/table">
        <td>
            <button type="submit"> Table </button>
        </td>
    </form>
</c:if>
</body>
</html>