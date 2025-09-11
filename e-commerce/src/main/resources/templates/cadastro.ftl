<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
</head>
<body>
    <h1>CADASTRO DE PRODUTOS</h1>

    <form action="/produtos" method="POST">
        <label for="Nome Produto">Nome do Produto:</label>
        <input type="text" id="nome" name="nome" required><br><br>

        <label for="Preço Produto">Preço Produto:</label>
        <input type="text" id="preco" name="preco" required><br><br>

        <button type="submit">Cadastrar Produto</button>
    </form>
</body>
</html>