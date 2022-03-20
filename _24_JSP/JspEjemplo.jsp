
<html>
<head>
<title>Página simple JSP</title>
</head>
<body>

<%!	String srtCadena = "Hola";
	int intContador = 0;
	private boolean isPar (int num){
		return (num % 2 == 0) ? true : false;
	}
%>
<b> <%= isPar(25)%></b>
</body>
</html>