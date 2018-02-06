<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
	<body>
		<h1>Hello</h1>
		<h:form>
			<div>
				First Name: <h:inputText value="#{beanBasedNavigation.name}" />
			</div>
			<div>
				<h:commandButton action="#{beanBasedNavigation.sayHello}" value="Say Hello" />
			</div>
			<h2>Test in h form </h2>
		</h:form>
	</body>
</f:view>