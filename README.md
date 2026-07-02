# 💰 PersonalFinance API

> Sistema de gestão financeira pessoal (PF), desenvolvido como projeto de estudo aplicado de **Java + Spring**, com evolução documentada e foco em boas práticas de engenharia de software.

---

## 📌 Sobre o Projeto

Este projeto nasceu de uma ideia original de SaaS de gestão financeira, e foi reaproveitado como **projeto de estudo prático** para consolidar conceitos de backend com Java e Spring — desde fundamentos até tópicos avançados como segurança, testes automatizados, e deploy em produção.

---

## 🎯 Objetivos do Projeto

- Aplicar na prática conceitos de Java e do ecossistema Spring (Boot, Data JPA, Security)
- Construir uma API REST sólida, testada e documentada
- Evoluir o projeto em fases incrementais, do MVP até funcionalidades avançadas
- Servir como portfólio técnico, demonstrando profundidade de conhecimento backend

---

## 🛠️ Stack Técnica

| Categoria | Tecnologia |
|---|---|
| Linguagem | Java 21 |
| Framework | Spring Boot |
| Persistência | Spring Data JPA |
| Banco de dados | PostgreSQL |


> Stack em evolução conforme o projeto avança.

---

## 🏗️ Arquitetura

Estrutura em camadas (Controller → Service → Repository), com separação clara entre entidades de domínio e contratos de API (DTOs).

```
src/
├── controller/     # Endpoints REST
├── service/        # Regras de negócio
├── repository/     # Acesso a dados (Spring Data JPA)
├── dto/            # Contratos de entrada e saída da API
├── entity/         # Entidades de domínio (JPA)
```

---

## 🗺️ Roadmap do Projeto

O desenvolvimento segue fases incrementais. Status atualizado conforme o progresso real:

| Fase                          | Descrição | Status |
|-------------------------------|---|---|
| 0 — Fundação                  | Setup do projeto, estrutura inicial, Git | 🟡 Em andamento |
| 1 — MVP                       | Cadastro de usuário, receitas, despesas e categorias | 🔲 Não iniciado |
| 2 — Segurança                 | Autenticação JWT, autorização por roles | 🔲 Não iniciado |
| 3 — Qualidade                 | Testes automatizados, Specification Pattern, paginação | 🔲 Não iniciado |
| 4 — Deploy                    | Docker, CI/CD, publicação em ambiente de produção | 🔲 Não iniciado |

> 🔲 Não iniciado · 🟡 Em andamento · ✅ Concluído

---

## 🚀 Como Rodar o Projeto Localmente

### Pré-requisitos
- Java 21
- Maven
- PostgreSQL

### Passos
```bash
# Clonar o repositório
git clone https://github.com/MatheussilvaDev/PersonalFinance.git

# Entrar na pasta do projeto
cd personal-finance-api

# Instala as dependências do projeto
mvn clean package

# Rodar a aplicação
./mvnw spring-boot:run
```

## ✍️ Sobre o Autor

Projeto desenvolvido por **Matheus Silva** como parte de um processo de estudo e aprofundamento em desenvolvimento backend com Java e Spring.

- LinkedIn: [Matheus Henrique](www.linkedin.com/in/matheus-henrique-093207315)
- Acompanhe a evolução do projeto e os aprendizados documentados ao longo do desenvolvimento.

---

## 📃 Licença

Este projeto é de uso pessoal e educacional. Sinta-se livre para utilizá-lo como referência de estudo.
