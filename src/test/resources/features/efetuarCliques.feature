# language: pt
#Author: Adara Drisana Teixeira dos Santos


@test
Funcionalidade: Efetuar cliques

  Contexto: Efetuar cliques em todos os botões da tela
    Dado que acesso o site "https://the-internet.herokuapp.com/challenging_dom"

  @severity=critical
  Cenario: Validação dos botões da tela Challenging
    Quando clicar nos botoes que apresentam na tela
    Entao clique em todos os botões da tabela de editar e deletar
  
    