<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>login form</title>
    </head>
    <body>
    	<c:forEach items="${errors}" var="element"> 
		    <p style="display: block; color: red"><c:out value="${element}" /></p>
		</c:forEach>
        <form method="post" action="addpost">
	        title<input type="text" name="title" /><br/>
	        content<input type="text" name="content" /><br/>
	        <input type="submit" value="submit" />
        </form>
    </body>
</html>