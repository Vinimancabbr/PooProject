O PooProject nada mais é que um projeto de faculdade realizado por 2 pessoas: eu (responsável pelo código) e um colega de classe (responsável pelas pesquisas). 
O projeto foi realizado utilizando a linguagem java junto com o java-fx para fazer toda a GUI. Utilizando o Apache Netbeans para o desenvolvimento.

Ao se tratar do meu primeiro projeto orientado a objetos, foi extremamente fascinante assimilar as ferramentas e explorar as possibilidades à medida que o projeto avançava. 
A meta inicial consistia em criar um software que permitisse ao usuário comparar as especificações de diferentes tipos de eletrodomésticos de diversas marcas. Normalmente, essa funcionalidade não é encontrada, 
uma vez que as marcas costumam disponibilizar seus próprios softwares individuais para esse fim. Então, entre as funções que procuravamos para o software, estavam:

- Comparação entre eletrodomésticos do tipo X (onde X pode ser: microondas, liquidificador, maquina de lavar, air fryer, geladeira). (Concluído).
- GUI que mudasse de acordo com os resultados. (Concluído).
- Criar um pequeno "banco de dados" onde as informações sobre esses eletrodomésticos estão contídas em arquivos json. (Concluído).
- Poder adicionar seus próprios eletrodomésticos com uma página dedicada a configuração das especificações (Não iniciado).
- Aperfeiçoar a GUI utilizando CSS (Não finalizado).
- Responsividade (Não iniciado).
- Adicionar mais tipos de eletrodomésticos (improvável que acontecerá, considerando que a pesquisa custa muito tempo).

  Nota: Vale perceber que a utilização de um banco de dados seria ideal para esse projeto, mas como é impossível ter acesso a várias delas, não será realizado.

  O UML do projeto é bem simples contendo apenas uma classe Mãe (Eletrodomesticos) e diversas classes filhas (uma pra cada tipo de eletrodoméstico, por exemplo liquidificador). A ideia é que especificações que todos eletrodomésticos
  tem estejam como atributos e respectivos métodos get da classe mãe, e os atributos especificos e seus respectivos get estejam nas classes específicas. As duas telas do software variam de acordo com a interação do usuário no botão comparar,
  (que além de mudar a tela, chama o método utilizado para a comparação das especificações) e o botão voltar, que torna a tela inicial.

  Como o projeto já foi entregue e avaliado pelo professor, não existe mais nenhuma responsabilidade avaliativa sobre esse projeto. Apesar disso, ainda tenho interesse em terminar algumas das metas que foram estabelecidas
  previamente.
