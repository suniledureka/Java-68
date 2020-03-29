<h2>
<%!
 String uid,pwd;
%>
<%
 uid = request.getParameter("txtUid");
 pwd = request.getParameter("txtPwd");
 
 out.println("User Name = "+ uid+"<br>");
 out.println("Password = "+ pwd);
%>
<hr>
Server Name : <%=request.getServerName() %> <br>
Server Port : <%=request.getServerPort() %> <br>
Protocol : <%=request.getProtocol() %> <br>
Application : <%=request.getContextPath() %> <br>
Content Type : <%=request.getContentType() %> <br>
Content Length : <%=request.getContentLength() %> <br>
Client IP : <%=request.getRemoteAddr() %> <br>
Client Name : <%=request.getRemoteHost() %>
</h2>