---

# 📝 To-Do List API

Uma simples API REST de gerenciamento de tarefas (To-Do List), desenvolvida com **Spring Boot** e **H2 Database**. Permite criar, listar, atualizar e deletar tarefas. Feito apenas para condensar algumas particularidades do framework.

---

## 🚀 Tecnologias utilizadas

* ☕ Java 17+
* 🛠️ Spring Boot
* 🌱 Spring Data JPA
* 🔐 Spring Web
* 🗄️ H2 Database (banco em memória ou arquivo)
* 🧪 Lombok

---

## 🗂️ Funcionalidades

* ✅ Criar uma tarefa
* 🔍 Listar todas as tarefas
* 📄 Buscar tarefa por ID
* 🔄 Atualizar uma tarefa
* ❌ Deletar uma tarefa
* 🔎 Filtrar tarefas concluídas ou não concluídas (em desenvolvimento)

---

## 🔗 Endpoints da API

| Método | Endpoint      | Descrição                     |
| ------ | ------------- | ----------------------------- |
| GET    | `/tasks`      | Lista todas as tarefas        |
| GET    | `/tasks/{id}` | Busca uma tarefa por ID       |
| POST   | `/tasks`      | Cria uma nova tarefa          |
| PUT    | `/tasks/{id}` | Atualiza uma tarefa existente |
| DELETE | `/tasks/{id}` | Remove uma tarefa             |

### 🔥 Exemplo de JSON de criação/atualização:

```json
{
  "title": "Estudar Spring Boot",
  "done": false,
  "priority": "HIGH"
}
```

---

## 💾 Banco de Dados H2

* A API utiliza o banco **H2** em modo **file** (persistente) ou **memória** (temporário).
* Console Web H2 disponível em:

```
http://localhost:8080/h2-console
```

### 🔧 Dados de acesso padrão:

* **JDBC URL:** `jdbc:h2:file:./data/todolist` (modo arquivo) ou `jdbc:h2:mem:todolist` (modo memória)
* **Usuário:** `sa`
* **Senha:** *(em branco)*

---

## ⚙️ Configuração no `application.properties`

```properties
spring.datasource.url=jdbc:h2:file:./data/todolist
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/todolist-spring.git
```

2. Acesse a pasta do projeto:

```bash
cd todolist-spring
```

3. Compile e execute:

```bash
./mvnw spring-boot:run
```

ou rode diretamente no IntelliJ, Eclipse ou VS Code.

4. A API estará disponível em:

```
http://localhost:8080
```

---

## 🗒️ Observação

* As tarefas possuem os seguintes campos:

| Campo      | Tipo    | Descrição                  |
| ---------- | ------- | -------------------------- |
| `idTask`   | Long    | ID da tarefa (auto)        |
| `title`    | String  | Título da tarefa           |
| `done`     | boolean | Status (feito ou não)      |
| `priority` | Enum    | PRIORITY (LOW/MEDIUM/HIGH) |

---

## 🧑‍💻 Autor

Desenvolvido por **Lucas de Andrade Martins**

* 📧 [lucas.devmartins@gmail.com](mailto:lucas.devmartins@gmail.com)
* 💼 [LinkedIn](https://www.linkedin.com/in/lucasamscc/)
* 💻 [GitHub](https://github.com/lucasamscc/)

---
