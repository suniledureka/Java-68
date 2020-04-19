<%@page isErrorPage="true"%>
<body style="background-color:red;color:cyan">
<h2>
<%
if(exception instanceof ArithmeticException){
	out.println("Error: Cannot Divide a Number by 0<br>");
	out.println(exception.toString());
}
else if(exception instanceof ArrayIndexOutOfBoundsException){
	out.println("Invalid Array Index: "+ exception.getMessage());
}
else{
	out.println("Internal Server Error! Try Again...");
}
%>
</h2>
</body>