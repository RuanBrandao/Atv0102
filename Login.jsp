<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  import = "java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Login" method="post">
		<h1>Informações Pessoais</h1><br>
		<label for="nome"><br>Nome<input type="text" name="nome"><br>
		</label><br>
		<label for="idade"><br>Idade<input type="text" name="idade"><br>
		</label><br>
		<label for="cpf"><br>CPF<input type="number" name="cpf"><br>
		</label><br>
		<h1>Informações Acadêmicas</h1><br>
		<label for="escola"><br>Escolaridade<input type="text" name="escola"><br>
		</label><br>
		<h1>Informações Profissionais</h1><br>
		<label for="profissional"><br>Experiências Profissionais<input type="text" name="profissional"><br>
		</label><br>
		<h1>Cor Favorita</h1><br>
		<label for="cor"><br>Cor:<input type="text" name="cor"><br>
		</label><br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>