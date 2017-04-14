<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <%=(request.getAttribute("error")!=null)? request.getAttribute("error"): ""%>
    <p>signin</p>
    <form method="POST" action="signin">
      email <input type="text" name="email">
      pass <input type="text" name="pass">
      <input type="submit" value="submit">
    </form>
    <a href="signup">click here to signup</a>
  </body>
</html>
