# Automação Multisites com JAVA + Cucumber

Automação criada para ter somente um cenário de teste e uma lógica aplicada para diferentes hosts/sites.

## Ferramentas utilizadas

- Java
- Junit
- Cucumber
- Maven
- Allure Report

## Execução

Para a execução criamos o para **-Dbrand** ele serve para dizerr para qual marca queremos executar a automação.
Ao executar, existe uma lógica que busca os elementos da determinada marca e suas configurações.

Para executar para o buscador Google: `mvn test -Dbrand=GOOGLE`  
Para visualizar o relatório basta acessar o caminho: `target/cucumber-reports.html`


##CI
O projeto está configurado para a execução no git workflow.

Brand GOOGLE:  
![Selenium Java CI - Test brand GOOGLE](https://github.com/maximilianoalves/multisites-cucumber-automation/workflows/Selenium%20Java%20CI%20-%20Test%20brand%20GOOGLE/badge.svg)  

Brand DUCKDUCKGO:  
![Selenium Java CI - Test brand DUCKDUCKGO](https://github.com/maximilianoalves/multisites-cucumber-automation/workflows/Selenium%20Java%20CI%20-%20Test%20brand%20DUCKDUCKGO/badge.svg)

Brand Bing:  
![Selenium Java CI - Test brand BING](https://github.com/maximilianoalves/multisites-cucumber-automation/workflows/Selenium%20Java%20CI%20-%20Test%20brand%20BING/badge.svg)
