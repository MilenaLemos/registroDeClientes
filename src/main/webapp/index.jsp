<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nuevo cliente</title>
    <style>

    </style>
</head>
<body style="background: #398ba3;">
<h1>Registrar nuevo cliente</h1>
<form action="hello-servlet" method="post">
    <input type="text" mandatoty placeholder="Nombre" name="nombre">
    <label> Nombre </label>
    <br></br>
    <input type="text" placeholder="Cargo" name="cargo">
    <br></br>
    <input type="text" placeholder="Empresa" name="empresa">
    <br></br>
    <input type="text" placeholder="Telefono" name="telefono">
    <br></br>
    <input type="text" placeholder="Email" name="email">
    <br></br>
    <button type = "submit"> Enviar </button>
</form>

</body>
</html>