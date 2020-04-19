<h1 align=center>Account Creation</h1>
<hr>
<jsp:useBean class="co.edureka.Account" id="acc"></jsp:useBean>	
<jsp:setProperty name="acc" property="*"/>
<h2>
A/C No: <jsp:getProperty name="acc" property="acno"/><br>
Name: <jsp:getProperty name="acc" property="name"/> <br>
Balance: <jsp:getProperty name="acc" property="bal"/>

<hr>

</h2>
