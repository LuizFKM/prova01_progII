## Estrutura ##

### Lembrando que estas anotações e observações são feitas com base na IDE NET BEANS ###

Ao acessar a pasta 2025-prog2-avaliacao1-master, acesse a pastsa src/main/java/br/edu/avaliacao.
Dentro dela possuimos a pasta Model - Onde fica o modelo de usuário, que foi criada durante a resolução da prova em sala.
Para criar uma pasta como a model, que chamamos de pacote, é necessario clicar com o botão direito em br.edu.avaliação.model e ir em new -> java package
Irá aparecer o seguinte nome no campo Package Name: br.edu.avaliacao.model.newpackage. o "newpackage" vc troca pelo nome do pacote, por exemplo, "model". É dessa forma que se cria um pacote novo. Ele será criado e sua pasta ficará com uma cor cinza. Isso indica que está vazio. Você deve clicar nele com o botão direito, new -> java class. 
Cria a nome da classe com a primeira letra maísculo, por exemplo "Usuario". É dessa forma que se cria uma classe.

Nessa classe de usuário, temos um modelo de usuário, por isso se chama pacote de MODELS, pois dentro dele possui MODELOS.

Pacote util possui arquivos de configurações e validações. Esses arquivos são parametrizados aqui pois usamos eles em todos as telas. Então, pra não ficar repetindo código
colocamos tudo em uma pasta só e parametrizamos.

Na pasta view são criadas as telas, como tela de login e cadastro. A lógica delas está implementada na aba "source" quando clicamos no arquivo. As unicas coisas implementadas nessas telas por enquanto são a instanciação de um objeto do tipo usuário em um ArrayList. PRA QUE ISSO? Para podermos cadastrar não só um, mas diversos usuários na tela cadastro. Dessa forma, é criado um Array, Vetor, Lista, do tipo USUÁRIO, com diversos USUÁRIOS. Desta forma é possivel ter acesso ao MODELO DE USUÁRIO NA TELA DE LOGIN E FAZER AS VERIFICAÇÕES DE EMAIL E SENHA.



## 📘 Passos Seguidos pelo Professor para Resolver o Exercício
### *Anotações feitas por Henrique Pivetti* ###

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
