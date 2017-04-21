<%@ page import="com.sample.controller.Calculator"%>


<html>

<body>




	<br />





	<FORM NAME="form1" METHOD="POST">
		Address: <input type="text" name="address" />
		<INPUT TYPE="SUBMIT" NAME="submit" VALUE="Button 1">
	</FORM>
	<%
		if (request.getParameter("submit") != null) {
	%>
	Final Price:
	<%
	String address = request.getParameter("address");
	Calculator.setTownPrice(address);
	%>
	
	
	<%=Calculator.getFinalPrice()%>

	<%
		}
	%>


</body>

</html>