#language: pt
#encoding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar Usuario

@Cadastro
Cenario: Cadastrar usuario 
	Quando eu acionar a aba admin
	E acionar o botao add
	E informar no campo employer name "Fiona Grace"
	E informar no campo username "Ana Livia Junior Silva"
	E informar no campo password "12345678"
	E informar no campo confirmar password "12345678"
	E acionar o botao salvar
	Entao o sistema cadastra o usuario "Ana Livia Junior Silva"
	



