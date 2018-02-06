<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<head>
	<style type="text/css">
	.sample{
	color: blue;
	font-size: 20px;
	}
	</style>
</head>
<f:view>
	<h:outputText value="hello '#{beanBasedNavigation.name }'" styleClass="sample"></h:outputText>
	<h2>Hello</h2>
</f:view>