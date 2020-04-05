<h2>
<%
 String name = request.getParameter("txtUid");
 out.println("Name = "+ name);
%>
<hr>
Name = ${param.txtUid}
<hr>
<%
 String name1 = request.getParameter("txtUidd");
 out.println("Name = "+ name1);
%>
<hr>
Name = ${param.txtUidd}
</h2>