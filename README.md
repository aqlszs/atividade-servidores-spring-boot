# Atividade Prática - Servidores: Java com Spring Boot

Disciplina: Programação Web (UNIVALI)
Professor: Welington Gadelha
Integrantes: Matheus Cadore e Aquiles Souza

## Como rodar

Pré-requisito: JDK 21.

No terminal, na pasta do projeto:

```
.\mvnw.cmd spring-boot:run
```

## Endereço

| http://localhost:8080/index-servidor.html | json com a documentação estruturado em uma página HTML |

## Arquivos Principais

- `src/main/java/com/example/servidores/controller/DocumentacaoController.java`: responde a rota `/`
- `src/main/resources/documentacao.json`: o conteúdo da documentação
- `src/main/resources/static/index-servidor.html`: a página que lê o JSON e mostra na tela
