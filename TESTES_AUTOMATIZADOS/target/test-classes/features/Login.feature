#language: pt
#encoding: UTF-8

@Login
Funcionalidade: Login

Cenario: Usuario invalido
	Quando eu informar o usuario "Ad"
	E informar a senha "asd"
	E clicar no botao login
	Entao o sistema exibe a mensagem de usuario invalido
	
@LoginSucesso
Cenario: Realizar login
	Quando eu informar o usuario "Admin"
	E informar a senha "admin123"
	E clicar no botao login
	Entao o sistema exibe a mensagem de usuario logado


