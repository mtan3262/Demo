<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<title>Pager Example</title>
<body>
Result
<form action="book.do" method="get">
	<select name="category">
		<option value=""></option>
		<option value="Java">Java</option>
		<option value="Ruby">Ruby</option>
	</select>
	<input type="submit" value="Find">
</form>

<table border="1">
	<tr>
		<th>
			Sach
		</th>
		<th>
			Loai sach
		</th>
	</tr>
<c:forEach var="book" items="${books}" varStatus="status">
	<tr>
		<td>
			<c:out value="${book.title}"/>
		</td>
		<td>
			<c:out value="${book.category}"/>
		</td>
	</tr>
</c:forEach>
</table>



