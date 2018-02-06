<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<html>
<head>
<title>Navigation Demo - Source</title>
</head>
<f:view>
	<body>
		<h:form>
			<div> 
				Email Address: <h:inputText /> 
			</div>
			<div>
				Password: <h:inputSecret />
			</div>
			<div>
				<h:commandButton value="Login" action="navigation"/>
			</div>
		</h:form>
	</body>
</f:view>
</html>