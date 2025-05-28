## 📘 Passos Seguidos pelo Professor para Resolver o Exercício

1. Criar o pacote Model
2. Criar a classe Usuario
3. Codificar a classe `Usuario`
4. Implementar a tela de login
5. Instanciar a classe `Login` na `main`
6. Abrir a tela de cadastro
7. Criar a máscara de CEP:
   - Acessar aba de propriedades ao lado inferior direito no componente de CADASTRO
   - depois `formatterFactory`
   - depois `mask`
8. Criar o método `retornaUsuario` na tela de cadastro
9. Criar outro construtor na classe de login
10. Criar um `ArrayList` na classe de login
11. Criar um construtor com o `ArrayList` na classe de login
12. Repetir as três etapas anteriores na classe de cadastro
13. No login, no evento do `lblCliqueAqui`, adicionar:
    ```java
    new Cadastro(listaUsuarios).setVisible(true);
    ```
14. No cadastro, configurar o método `btnSalvarActionPerformed`
15. Adicionar `this.dispose();` no `btnSalvarActionPerformed`
16. Implementar o método `btnEntrarActionPerformed`
