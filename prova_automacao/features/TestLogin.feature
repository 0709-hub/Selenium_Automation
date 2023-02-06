#language: pt
@Login 
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na pagina de inicial gitmaratonadev

  @ValidarLoginSucesso
  Esquema do Cenario: Realizar login com sucesso
    Quando informar  os campos  "<usuario>" , "<senha>" e clicar no botao login
    Entao validar login com sucesso

    Exemplos: 
      | usuario    | senha   |
      |  ewq1111   |  123456 |
      
