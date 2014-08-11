<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html>
    <body>
        <html:form action="login.do">
            Username:<html:text  property="username"></html:text><br>
                Password:<html:password property="password"></html:password><br>
                <html:submit></html:submit>
        </html:form>
    </body>
</html>