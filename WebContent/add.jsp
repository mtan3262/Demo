<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html>
	<head>
		<title> Login Page </title>
	</head>
    <body>
        <html:form action="add.do">
            No1:<html:text  property="number1"></html:text><br>
                No2:<html:text property="number2"></html:text><br>
                <html:submit>Add</html:submit>
        </html:form>
    </body>
</html>