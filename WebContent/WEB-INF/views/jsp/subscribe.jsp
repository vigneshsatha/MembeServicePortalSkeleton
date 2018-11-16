<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
.error {
	color: #ff0000;
}
</style>
<title>Member Portal Services - Registration</title>
</head>
<body>
	<c:url value="/resources/js/validation.js" var="applicationJs" />

	<font size="5px" face="verdana"> We are just a click away.
		Please subscribe for the services you may wish to avail. We are glad
		to be of your service. </font>
	<br />
	<br />
	<hr size="1" />
	<br />
	<br />
	<form:form onsubmit="return validateEmail(this)" commandName="member">
		<table>
			<tr>
				<td><spring:message code="member.id" />:</td>
				<td><form:input path="memberId" name="memberId" id="memberId"
						type="text" /></td>
				<td><form:errors path="memberId" cssClass="error"/></td>
			</tr>
			<tr>
				<td><spring:message code="member.name" />:</td>
				<td><form:input path="memberName" name="memberName"
						id="memberName" type="text" /></td>
				<td><form:errors path="memberName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="member.email" />:</td>
				<td><form:input path="email" name="email" id="email"
						type="text" /></td>
				<td><label id="emailError" class="error"></label></td>
			</tr>
			<tr>
				<td><spring:message code="member.services" />:</td>
				<td><form:select path="services" items="${services}"
						multiple="true" /></td>
				<td><form:errors path="services" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="member.subscription" />:</td>
				<td><form:radiobuttons  path="subscription" type="radio"
						name="subscription" items="${subscriptionList}" /></td>
				<td><form:errors path="subscription" cssClass="error" /></td>
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