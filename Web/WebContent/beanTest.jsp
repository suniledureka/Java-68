<h1 align=center>Using Java Bean in JSP</h1>
<hr>
<jsp:useBean class="co.edureka.Account" id="acc"></jsp:useBean>	
<h2>
A/C No: <jsp:getProperty name="acc" property="acno"/><br>
Name: <jsp:getProperty name="acc" property="name"/> <br>
Balance: <jsp:getProperty name="acc" property="bal"/>

<hr>
<jsp:setProperty name="acc" property="name" value="Sunil Joseph"/>
Name: <jsp:getProperty name="acc" property="name"/> <br>
</h2>
