# Processo seletivo Laboratório Bridge

## Desenvolvedor Fullstack

Para criar o build do código em bakcend você precisar rodar esses dois códigos no cli do seu computador:

    ./mvnw spring-boot:run
    ./mvnw clean package

Para rodar executar o projeto em sua máquina, você deve ir na pasta **backend** e rodar o código abaixo:

    java -jar target/backend-0.0.1-SNAPSHOT.jar

Depois dentro da pasta **frontend** é só rodar o comando 

    yarn start

Com isso o projeto vai ser aberto no seu navegador padrão no caminho 

    localhost:3000

Na página que foi aberta vc vai poder pesquisar um usuário do github e ao clicar no botão pesquisar e ele vai mostrar uma lista de alguns repositório daquele usuário.

------------

## Algumas considerações sobre o projeto

Essa foi minha primeira tentativa em utilizar o framework spring boot no backend, principalmente para consumir a api do Github.

Foi um desafio e está funcionando mas não da maneira que eu gostaria porque tive que fazer um pouco as pressas.

Para o frontend eu utilizei o framework React para criar as páginas, nesse caso somente a página inicial. Talvez eu não tenha estruturado as pastas do frontend de forma organizada, mas eu queria entregar o projeto para o processo seletivo.

No futuro eu continuarei esse projeto para tornar ele mais eficiente e para melhorar minha experiência com framework de frontend e backend.



