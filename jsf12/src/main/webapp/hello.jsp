<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
	<h:form>
		<h:inputText value="#{helloBean.name}" />
		<h:commandButton action="#{helloBean.sayHello}" value="Say Hello" />
	</h:form>
</f:view>