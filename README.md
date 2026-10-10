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

No Linux ou macOS: `./mvnw spring-boot:run`

O servidor está no ar quando o console mostrar `Started ServidoresApplication`.

## O que abrir

| Endereço | O que mostra |
|---|---|
| http://localhost:8080/ | a documentação em JSON (rota principal) |
| http://localhost:8080/index-servidor.html | a mesma documentação em uma página HTML |

## Onde está cada coisa

- `src/main/java/com/example/servidores/controller/DocumentacaoController.java`: responde a rota `/`
- `src/main/resources/documentacao.json`: o conteúdo da documentação
- `src/main/resources/static/index-servidor.html`: a página que lê o JSON e mostra na tela
