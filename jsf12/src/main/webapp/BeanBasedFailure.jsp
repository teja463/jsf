<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
	<body>
		<h1>Sorry </h1>
		<h:form>
			<h:outputText value="Sorry.. #{beanBasedNavigation.name}" />
		</h:form>
	</body>
</f:view>