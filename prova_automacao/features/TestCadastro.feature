#language: pt
Funcionalidade: Cadastro

  Contexto: 
    Dado que o usuario esteja na pagina de cadastro gitmaratonadev

  @ValidarCadastroSucesso
  Esquema do Cenario: Realizar Cadastro com sucesso
    Quando informar  os campos  "<nome>" , "<idade>" , "<periodo_de_inicio>" , "<periodo_de_Finalizacao>" , "<Telefone>" , "<email>" , "<usuario>" , "<senha>", "<sexo>"
    E selecionar o checkbox voce atua ou ja atuou com TI
    E clicar no botao registrar
    Entao realizar login com "<usuario>" e "<senha>" para validar cadastro com sucesso

    Exemplos: 
      | nome     | idade | periodo_de_inicio | periodo_de_Finalizacao | Telefone | email            | usuario | senha  | sexo      |
      | usertest |    20 | 19/03/2021        | 19/03/2021             |   000000 | ustest@gmail.com | qwerty  | 123456 | Masculino |

  @ValidarCampoObrigatorio
  Esquema do Cenario: Realizar Login com sucesso
    Quando informar  os campos  "<nome>" , "<idade>" , "<periodo_de_inicio>" , "<periodo_de_Finalizacao>" , "<Telefone>" , "<email>" , "<usuario>" , "<senha>", "<sexo>"
    E selecionar o checkbox voce atua ou ja atuou com TI
    E clicar no botao registrar
    Entao validar campo obrigatorio

    Exemplos: 
      | nome     | idade | periodo_de_inicio | periodo_de_Finalizacao | Telefone | email            | usuario | senha  | sexo      |
      | usertest |    20 | 19/03/2021        | 19/03/2021             |   000000 | ustest@gmail.com |         | 123456 | Masculino |
