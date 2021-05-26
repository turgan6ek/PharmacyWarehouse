<%@ page import="kz.iitu.test.entity.Medicine" %><%--
  Created by IntelliJ IDEA.
  User: turga
  Date: 26.05.2021
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Medicines</title>
</head>
<body>
<jsp:useBean id="medicines" scope="request" type="java.util.List<kz.iitu.test.entity.Medicine>"/>
<jsp:include page="index.jsp"/>
<div class="wrapper d-flex align-items-stretch">
    <div id="content" class="p-4 p-md-5 pt-5">
        <br>
        <table class="table table-dark">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Manufacturer</th>
                <th scope="col">Price</th>
            </tr>
            </thead>
            <tbody>
            <%
                for (Medicine medicine: medicines) {
            %>
            <tr>
                <th scope="row"><%=medicine.getId()%></th>
                <td><%=medicine.getName()%></td>
                <td><%=medicine.getManufacturer()%></td>
                <td><%=medicine.getPrice()%></td>
            </tr>
            <%
                }
            %>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>
