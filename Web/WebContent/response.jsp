<%
 String uid = request.getParameter("txtUid");
 String pwd = request.getParameter("txtPwd");
 
 if(uid.contentEquals("admin") && pwd.contentEquals("123")){
	 response.sendRedirect("https://www.edureka.co");
 }
 else{
	 response.sendError(response.SC_UNAUTHORIZED, "Invalid User Name/ Password");
 }
%>