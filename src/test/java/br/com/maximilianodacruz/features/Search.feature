#language: pt
#encoding: utf-8


  @search
  Funcionalidade: Realizar busca


    Cenário: Realizar uma buscar por "Maximiliano Alves da Cruz"
      Dado que eu adicionar o termo de busca
      Quando eu realizar a busca
      Então devo validar um conteúdo relativo ao termo de busca