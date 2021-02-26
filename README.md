![issues](https://github.com/GCPBigData/sisvida-reativo-back/workflows/CI/badge.svg?branch=master&event=issues)
![deployment_status](https://github.com/GCPBigData/sisvida-reativo-back/workflows/CI/badge.svg?branch=master&event=deployment_status)
![master](https://github.com/GCPBigData/sisvida-reativo-back/workflows/CI/badge.svg?branch=master)
![fork](https://github.com/GCPBigData/sisvida-reativo-back/workflows/CI/badge.svg?branch=master&event=fork)
![CI](https://github.com/GCPBigData/sisvida-reativo-back/workflows/CI/badge.svg)

# Sistema Vida - Precisão em Compreensão de imagem.

![](/sisvida-reative/img/vida.jpeg)

![](/sisvida-reative/img/000.png)

?  O que é o Spring WebFlux  ?

![](/sisvida-reative/img/00.png)

![](/sisvida-reative/img/0.png)

![](/sisvida-reative/img/03.png)

![](/sisvida-reative/img/01.png)

![](/sisvida-reative/img/04.png)

A estrutura Spring WebFlux é uma pilha da Web reativa totalmente assíncrona e sem bloqueio que permite o gerenciamento de um grande número de conexões simultâneas. O WebFlux suporta a pressão de retorno do Reactive Streams e é executado em servidores como o Netty. Ele nos permite dimensionar verticalmente os serviços para lidar com a maior carga no mesmo hardware.

O que é Kafka Reativo?

O Kafka reativo é uma API reativa para o Kafka, baseada no projeto Reactor e na API do produtor / consumidor do Kafka. Ele permite que os dados sejam publicados e consumidos do Kafka usando API funcional com contrapressão sem bloqueio e baixos custos indiretos, o que permite que o Kafka reativo seja integrado a outros sistemas de reatores e forneça um pipeline reativo de ponta a ponta.

Sistema Vida
Eventos enviados pelo servidor
Servidor WebFlux usando a estrutura Spring WebFlux e Kafka reativo, que expõe uma API REST para que os clientes façam solicitações HTTP seguras. Depois que uma conexão segura é estabelecida entre o cliente e o servidor de fluxo da web, ela consome mensagens dos tópicos do Kafka e envia os dados de forma assíncrona sem fechar a conexão com o cliente, a menos que seja necessário.

![](/sisvida-reative/img/00001.png)

![](/sisvida-reative/img/00002.png)

![](/sisvida-reative/img/00003.png)

![](/sisvida-reative/img/1.png)

O que são eventos enviados pelo servidor?
Eventos enviados pelo servidor (SSE) é uma tecnologia Server Push que permite que um cliente receba atualizações automáticas do servidor por meio da conexão HTTP.
O SSE pode ser usado para:
Substitua a pesquisa longa (que cria uma nova conexão para cada pull), mantendo uma conexão única e mantendo um fluxo contínuo de eventos passando por ela.
Ative aplicativos que usam comunicação de dados unidirecional
(por exemplo: sites de comércio eletrônico, atualizações de preços de ações ao vivo).
![](/sisvida-reative/img/2.png)

![](/sisvida-reative/3.jpg)

Resumo:
Spring Boot / Webflux para implementar serviços da web RESTful reativos
Kafka como o intermediário de mensagens
Front-end angular para recebimento e manipulação de eventos do lado do servidor.

Participantes: 
https://github.com/dfredmota
https://github.com/Esmayk
https://github.com/GCPBigData

......................
# falador-java
