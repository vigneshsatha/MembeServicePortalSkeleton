<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Member Portal Services - Registration</title>
</head>
<body>
	<c:url value="/resources/js/validation.js"
		var="applicationJs" />
	
	<font size="5px" face="verdana"> We are just a click away.
		Please subscribe for the services you may wish to avail. We are glad
		to be of your service. </font>
	<br />
	<br />
	<hr size="1" />
	<br />
	<br />
	<form:form onsubmit="return validateEmail(this)">
		<table>
			<tr>
				<td>
					Member ID:
				</td>
				<td>
					<input name="memberId" id="memberId" type="text"/>
				</td>
			</tr>
			<tr>
				<td>
					Member Name:
				</td>
				<td>
					<input name="memberName" id="memberName" type="text"/>
				</td>
			</tr>
			<tr>
				<td>
					Email:
				</td>
				<td>
					<input name="email" id="email" type="text"/>
				</td>
				<td>
					<label id="emailError" style="color: red;"></label>
				</td>
			</tr>
			<tr>
				<td>
					Services:
				</td>
				<td>
					<form:select path="services" items="${countryList}" />
				</td>
			</tr>
			<tr>
				<td>
					Subscription:
				</td>
				<td>
					<input type="radio" name="subscription" value="premium"/> Premium 
  					<input type="radio" name="subscription" value="basic"/> Basic
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit" name="submit">Subscribe</button>
				</td>
			</tr>
		</table>
	</form:form>
	<script type="text/javascript" src="${applicationJs}"></script>
</body>
</html>