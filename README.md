# 📦 Sistema de Controle de Estoque

## 📝 Descrição

**O que o projeto faz:**  
Este sistema permite cadastrar, visualizar, atualizar e gerenciar produtos em um estoque simples. Inclui funcionalidades como aplicar desconto, adicionar/remover quantidade, buscar por nome ou tipo e listar todos os produtos cadastrados.

**Tecnologias utilizadas:**  
- Linguagem: `Java`  
- Paradigma: Programação Orientada a Objetos (POO)  
- IDE utilizada: `IntelliJ IDEA`

**Por que foi construído:**  
Este projeto foi criado como parte do meu processo de aprendizado em Java e orientação a objetos. Serve como base para projetos maiores que poderão futuramente ter integração com banco de dados.

**Instrução de uso:**  
O usuário pode interagir via terminal para adicionar produtos, listar itens, aplicar descontos e muito mais, tudo de forma organizada e prática.

---

## ⚙️ Documentação Técnica

**Funcionalidades principais:**
- ✅ Cadastro de produtos com nome, tipo, marca, preço e quantidade
- ✅ Aplicar desconto ao preço de um produto
- ✅ Adicionar ou remover unidades de um produto no estoque
- ✅ Buscar produtos por nome ou tipo
- ✅ Listar todos os produtos com seus detalhes

**Principais classes:**
- `Produto.java`: representa os dados de um produto, com encapsulamento (getters/setters)
- `ControleDeEstoque.java`: lida com a lógica de manipulação da lista de produtos
- `Main.java`: interface principal com o usuário, onde o menu é exibido

**Organização do código:**
- Separação clara de responsabilidades por classe
- Uso de `ArrayList` para armazenar os produtos
- Menu interativo via `Scanner`
- Mensagens amigáveis e validações básicas

---

## ▶️ Como Executar

**Pré-requisitos:**
- Java JDK 8+ instalado
- IntelliJ IDEA ou outro editor compatível

**Passos para executar:**

```bash
# Clone o repositório
git clone https://github.com/DevLuiz-eng/controle-de-estoque-java.git

# Acesse a pasta do projeto
cd controle-de-estoque-java

# Abra o projeto na sua IDE ou compile pelo terminal:
javac Main.java
java Main
