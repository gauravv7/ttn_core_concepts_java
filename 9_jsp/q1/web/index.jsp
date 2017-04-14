<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <% out.println("Hello!  The time is now …"+ LocalTime.now()); %>
  </body>
</html>
