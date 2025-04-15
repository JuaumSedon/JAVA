# Gestão de Vagas – Versão 1

Esta é a **primeira versão** do projeto _Gestão de Vagas_, desenvolvido com Spring Boot durante o curso de Desenvolvimento Web com Java.  
O foco principal nesta etapa é a criação do módulo de **cadastro de candidatos**, com validações e tratamento de erros.

## 🚀 Funcionalidades

- Cadastro de candidatos via API REST
- Validação de dados com Jakarta Validation:
  - E-mail válido
  - Nome sem espaços
  - Senha entre 10 e 20 caracteres
- Tratamento de erros personalizados com `@ControllerAdvice`
- Mensagens de erro amigáveis em português

## 🧰 Tecnologias utilizadas

- Java 17
- Spring Boot
- Jakarta Validation
- Maven
- Apidog (para testes da API)

## 📦 Estrutura

Principais arquivos e pacotes:

- `modules/candidates/`
  - `CandidateEntity.java` – Representa o candidato com validações
  - `CandidateController.java` – Endpoint REST para cadastro
- `execeptions/`
  - `ExceptionHandlerController.java` – Lida com erros de validação
  - `ErroMessageDTO.java` – Modelo de mensagem de erro personalizada

## 🔗 Endpoint disponível

### `POST /candidate/`

Cria um novo candidato. Exemplo de requisição POST usando JSON na ferramenta Apidog:

```json

{
    "nome":"joao",
    "sobrenome":"gimenez",
    "email":"joao@email.com",
    "senha":"12345678910",
    "descricao":"em busca da primeira oportunidade de estagio"
}

