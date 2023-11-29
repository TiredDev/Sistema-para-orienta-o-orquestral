# SystemforOrchestralGuidance

Projeto de Programação Orientada a Objetos.


SAOO - Sistema de Auxílio em Orientação Orquestral

Alunos:

Jean Gabriel da Fonseca
RA: 202109408

Descrição do projeto:

O SAOO (Sistema de Auxílio em Orientação Orquestral) é a idealização de um software capaz de informatizar a prática de orientação orquestral, reunindo conceitos de Programação Orientada a Objetos, Banco de Dados e REST API. Atualmente, determinada instituição religiosa tem como característica o fato de estar relacionada a maior orquestra do mundo, com cerca de 600 mil músicos no Brasil. Até alguns anos atrás, a instituição se relacionava a música unicamente com propósito sacro, tendo a prática musical como uma das suas principais características. Porém, no ano de 2017 determinada instituição adotou a prática de orientação orquestral, através da publicação de um documento oficial que esquematizou e sistematizou o modo como a orquestra é agrupada e dividida entre diferentes localizações. Atualmente, a prática da orientação orquestral (nesse projeto, o termo se refere a prática de organização sistematizada de um modelo pré definido de orquestra) é, de forma simplificada, explicada no modelo a seguir:

Existe, em média, uma igreja por bairro. Cada igreja possuirá sua própria orquestra e maestro oficial (apesar de músicos de outra localização também poderem participar ativamente do ato musical), a quantidade de músicos máxima de uma igreja local é definida por seu tamanho (número de pessoas que possam estar simultaneamente no ambiente), e a orquestra possuirá uma organização de instrumentos baseada em percentual (por exemplo, 40% dos instrumentos da orquestra deverão pertencer ao grupo de cordas). O percentual é definido tanto para os grupos musicais (cordas, madeiras, metais etc.) quanto para instrumentos específicos (violino, viola, flauta, oboé etc.). O propósito desse modelo é sanar as necessidades legislativas referentes a emissão sonora, e também melhorar características relacionadas à teoria musical, como harmonia, timbre, ritmo, afinação etc.

Desse modo, o sistema se propõe a ser possibilidade de informatizar e automatizar o máximo possível desta boa prática, de modo a economizar tempo dos encarregados orquestrais e também atingir resultados mais concisos e otimizados.

O sistema deve, para atingir tal propósito, possuir uma base de dados que permita cadastrar músicos e suas informações, assim como as localizações das igrejas e o número de músicos máximo em cada igreja. O sistema deve então realizar atividades de automação para relacionar e otimizar a orientação orquestral, alocando os músicos da melhor forma possível, mantendo a proporção de instrumentos e, preferivelmente, mantendo os músicos em suas localizações originais. O sistema deve dar sugestões dos instrumentos mais apropriados para a entrada na orquestra. Esses resultados serão atingidos através da manipulação de classes, objetos, e métodos matemáticos.


TECNOLOGIA EMPREGADA:

Para fins demonstrativos, as possibilidade de desenvolvimento será descrita a seguir com o auxílio de inteligência artificial (CHAT GPT - 5 )


Claro, aqui está um texto descritivo sobre as vantagens de utilizar Java e o framework Spring Boot para desenvolver uma API para Orientação Orquestral, juntamente com o banco de dados MongoDB:

Vantagens de usar Java e Spring Boot para desenvolver uma API para Orientação Orquestral
Java, como uma linguagem de programação amplamente utilizada, oferece uma variedade de benefícios para o desenvolvimento de aplicações externas para a Orientação Orquestral. Sua robustez, portabilidade e ampla comunidade de desenvolvimento tornam-no uma escolha sólida para garantir a confiabilidade e a escalabilidade permitida em um projeto de alta complexidade como este.
Além disso, o Spring Boot, um framework baseado em Java, oferece uma estrutura simplificada e eficiente para criar APIs RESTful. Sua configuração mínima e o foco em convenções sobre configurações permitem um desenvolvimento mais ágil, suavizando a complexidade do código e acelerando o processo de implementação.
No contexto da Orientação Orquestral, onde a representação e gerenciamento de informações musicais são fundamentais, a utilização do banco de dados MongoDB pode ser vantajosa. Este banco de dados NoSQL, baseado em documentos, se alinha bem com os princípios da Programação Orientada a Objetos (POO). Sua flexibilidade de esquema e capacidade de armazenar dados complexos de forma natural e escalável se adequam às necessidades de representação de informações musicais, como instrumentos, músicos, partituras e estruturas da orquestra.
O uso conjunto de Java, Spring Boot e MongoDB oferece um ambiente de desenvolvimento poderoso para a construção de uma API específica para a Orientação Orquestral. Isso fornece não apenas uma base sólida para a manipulação e gerenciamento de dados musicais, mas também uma arquitetura flexível e eficiente para atender às demandas de um projeto baseado em Programação Orientada a Objetos.



**Descrição dos Casos de Uso:**

1. **Gerenciar Músicos:**
   - **Descrição:** Permite ao maestro visualizar, adicionar, editar ou remover músicos do sistema.
   - **Atores Envolvidos:** Maestro
   - **Fluxo Principal:**
     - O maestro acessa a funcionalidade de gerenciamento de músicos.
     - Ele pode visualizar a lista de músicos, adicionar novos, editar informações existentes ou remover músicos do sistema.

2. **Alocar Músicos na Orquestra:**
   - **Descrição:** Permite ao maestro alocar músicos na orquestra de acordo com as necessidades da apresentação musical.
   - **Atores Envolvidos:** Maestro
   - **Fluxo Principal:**
     - O maestro acessa a funcionalidade de alocação de músicos na orquestra.
     - Ele pode selecionar músicos disponíveis e alocá-los em seções específicas da orquestra para a apresentação.

3. **Calcular Proporção de Instrumentos:**
   - **Descrição:** Permite ao maestro calcular a proporção de instrumentos na orquestra para garantir a harmonia e a composição corretas.
   - **Atores Envolvidos:** Maestro
   - **Fluxo Principal:**
     - O maestro acessa a funcionalidade de cálculo de proporção de instrumentos.
     - Ele realiza cálculos para garantir que a distribuição de instrumentos na orquestra esteja de acordo com as diretrizes estabelecidas.

4. **Sugerir Instrumentos para Novos Músicos:**
   - **Descrição:** Permite ao maestro sugerir instrumentos a músicos novos ou existentes com base nas necessidades da orquestra.
   - **Atores Envolvidos:** Maestro
   - **Fluxo Principal:**
     - O maestro acessa a funcionalidade de sugestão de instrumentos.
     - Ele fornece sugestões aos músicos sobre os instrumentos mais apropriados para se juntarem à orquestra.


