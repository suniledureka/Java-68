<%!
 String name="Sunil";

 int addNum(int x, int y){
	 int sum = x+y;
	 return sum; 
 }
%>
<h2>
<%
 out.println("My Name is "+name+"<br><br>");
 out.println("Sum = "+ addNum(11,23));
%>
</h2>