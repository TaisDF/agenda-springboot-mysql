# 🗓️ Agenda de Compromissos - Spring Boot

Bem-vindo ao projeto **Agenda de Compromissos**! 🚀  
Este é um projeto simples e funcional para gerenciar compromissos diários. Desenvolvido para fins de aprendizado e prática em Java e Spring Boot, com foco em aplicações CRUD e integração com banco de dados MySQL.

---

## ⚙️ Tecnologias Usadas

- **Java** ☕
- **Spring Boot** 🌱
- **Spring Data JPA** 🗄️
- **Thymeleaf** 🌐
- **Banco de Dados MySQL** 💾

---

##  📁 Estrutura do Projeto

- **Controller**: A classe `AgendaController` lida com as requisições HTTP e direciona as ações para a camada de dados.
- **Elements**: A classe `Evento` representa o modelo de dados de um compromisso, incluindo campos como `id`, `título`, `data e hora`.
- **Repository**: `EventoRepository` é a interface que permite acessar e manipular os dados no banco de dados MySQL.

---

## 📋 Funcionalidades

- **Cadastro de Eventos** ➕: Adicione novos eventos e compromissos.
- **Edição e Exclusão** ✏️🗑️: Altere ou remova eventos conforme necessário.
- **Visualização de Eventos** 📅: Veja todos os eventos em um formato organizado.
- **Persistência em Banco de Dados** 💾: Todos os eventos são salvos no banco de dados MySQL.

---

## 📥 Como Rodar o Projeto Localmente
1. **Clone o repositório**

2. **Configure o banco de dados MySQL**

3. **Execute o projeto**
   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a aplicação**
   - Abra o navegador e vá para [http://localhost:8080/](http://localhost:8080/)
