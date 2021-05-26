<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
  	<title>Pharmaco</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="<s:url value='/css/style.css'/>">
  </head>
  <body>
		
		<div class="wrapper d-flex align-items-stretch">
			<nav id="sidebar">
				<div class="custom-menu">
					<button type="button" id="sidebarCollapse" class="btn btn-primary">
	          <i class="fa fa-bars"></i>
	          <span class="sr-only">Toggle Menu</span>
	        </button>
        </div>
				<div class="p-4 pt-5">
		  		<h1><a href="index.jsp" class="logo">Pharmaco</a></h1>
	        <ul class="list-unstyled components mb-5">
	          <li class="active">
	            <a href="${pageContext.request.contextPath}/index" >Home</a>
	          </li>
	          <li>
	              <a href="${pageContext.request.contextPath}/medicines/list">Medicines</a>
	          </li>
				<li class="active">
					<a href="${pageContext.request.contextPath}/requests/" >Requests</a>
				</li>

	          <li>
              	<a href="${pageContext.request.contextPath}/register">Register</a>
				  <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Firms</a>
				  <ul class="collapse list-unstyled" id="pageSubmenu">
					  <li>
						  <a href="${pageContext.request.contextPath}/firms/registerManager">Register Manager</a>
					  </li>
					  <li>
						  <a href="${pageContext.request.contextPath}/firms/registerManager">See the request list</a>
					  </li>
				  </ul>
			  </li>
	        </ul>

	        <div class="mb-5">
				<h3 class="h6">Login</h3>
					<form:form action="${pageContext.request.contextPath}/login" method="post" class="colorlib-subscribe-form">
	            		<div class="form-group d-flex">
	            			<div class="icon"><span class="icon-paper-plane"></span></div>
	              				<input type="text" class="form-control" name="username" placeholder="Username">
	            		</div>
						<div class="form-group d-flex">
							<div class="icon"><span class="icon-paper-plane"></span></div>
							<input type="password" class="form-control" name="password" placeholder="Password">
						</div>
						<button name="submit" type="submit">Login</button>
	          		</form:form>
			</div>

	        <div class="footer">
	        	<p>
					Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Yerulan Turganbek</a>
				</p>
	        </div>

	      </div>
    	</nav>
		<script src="<s:url value='/js/jquery.min.js'/>"></script>
		<script src="<s:url value='/js/popper.js'/>"></script>
		<script src="<s:url value='/js/bootstrap.min.js'/>"></script>
		<script src="<s:url value='/js/main.js'/>"></script>
