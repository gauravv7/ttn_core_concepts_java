<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%!
    public String sequence(int limit){;
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= limit; i++) {
            s.append(i);
            s.append("\n");
        }
        return s.toString();
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=sequence(Integer.parseInt(request.getParameter("n"))) %>
</body>
</html>
