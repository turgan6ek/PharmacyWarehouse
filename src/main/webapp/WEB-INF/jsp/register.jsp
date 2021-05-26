<%--
  Created by IntelliJ IDEA.
  User: turga
  Date: 26.05.2021
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<div class="wrapper d-flex align-items-stretch">
    <div id="content" class="p-4 p-md-5 pt-5">
        <form:form action="${pageContext.request.contextPath}/firms/registerFirm" method="post">
            <label>
                <p class="label-txt">ENTER YOUR NAME</p>
                <input type="text" class="input" name="name">
                <div class="line-box">
                    <div class="line"></div>
                </div>
            </label>
            <label>
                <p class="label-txt">ENTER USERNAME</p>
                <input type="text" class="input" name="username">
                <div class="line-box">
                    <div class="line"></div>
                </div>
            </label>
            <label>
                <p class="label-txt">ENTER ADDRESS</p>
                <input type="text" class="input" name="address">
                <div class="line-box">
                    <div class="line"></div>
                </div>
            </label>
            <label>
                <p class="label-txt">ENTER YOUR PASSWORD</p>
                <input type="password" class="input" name="password">
                <div class="line-box">
                    <div class="line"></div>
                </div>
            </label>
            <button type="submit">submit</button>
        </form:form>
    </div>
</div>
</body>
</html>
