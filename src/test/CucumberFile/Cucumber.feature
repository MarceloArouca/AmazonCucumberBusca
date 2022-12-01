#language:pt
Funcionalidade: Teste Cucumber
Cenario: Teste Cucumber Amazon
  Dado que esteja na pagina: "https://www.amazon.com.br"
  Quando fazer busca pelo produto: "Iphone 12"
  Entao verificar se o valor esta acima de: "10.000"