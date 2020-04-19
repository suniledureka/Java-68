<%
 //String uid = request.getParameter("txtUid");
 String uid = pageContext.getAttribute("name",PageContext.SESSION_SCOPE).toString();
%>
<h2>
Hello, <%=uid %>
</h2>