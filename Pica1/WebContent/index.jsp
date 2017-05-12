<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pica Y Placa Test Website</title>
</head>
<body>
<form action="check">
<h4>Pica Y Placa Website</h4>
<p>Enter the Licence Number:<input type="text" maxlength="10" name="licencePlate" value=${license}><input type="submit" value="GO" title="GO" name="GO"/>
<br>
Your car is allowed on the road at this time.${isvalid}
</form> 
</body>
</html>