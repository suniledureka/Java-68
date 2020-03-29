<%!
 String name="Sunil";

 int addNum(int x, int y){
	 int sum = x+y;
	 return sum; 
 }
%>
<h2>
My Name is <%=name %>
<br><br>
<%="Sum = "+ addNum(11,25) %>
</h2>