# Frente 4 — requisitos oficiais

**Fonte primária para todos os requisitos abaixo:** [brief oficial do projeto](https://cdn.aulas.umlequedetecnologia.com.br/public/introducao-spring-boot/projeto/brief.html).

## Fase atual: aula 02

- A Frente 4 é responsável por busca e números do catálogo.
- `GET /estatisticas` é a rota obrigatória da Frente 4 a partir da aula 02.
- Na aula 02, existem somente as quatro primeiras rotas do mapa completo; portanto, essa é a entrega atual da Frente 4.
- A API responde com dados fixos em memória nesta etapa, mas já deve estar separada em `controller`, `service` e `repository`.

Fonte: [brief oficial — “Aula 02 · O esqueleto em camadas” e “As rotas que a API vai ter”](https://cdn.aulas.umlequedetecnologia.com.br/public/introducao-spring-boot/projeto/brief.html).

## Camadas e injeção de dependência

- As camadas `controller`, `service` e `repository` devem permanecer separadas desde a aula 02.
- Controllers não podem conter regras de negócio; a proibição vale da aula 02 até a apresentação.
- Dependências entre as classes da equipe devem usar injeção por construtor e campo `final`.
- Não pode haver `new` entre as classes da equipe.

Fonte: [brief oficial — “Requisitos técnicos obrigatórios” e “O que NÃO pode”](https://cdn.aulas.umlequedetecnologia.com.br/public/introducao-spring-boot/projeto/brief.html).

## Dependências de domínio

- A Frente 4 não possui entidade própria: consulta as entidades das outras frentes.
- As Frentes 3 e 4 dependem dos dados de `Vaga` armazenados pela Frente 1.
- O modelo mínimo de `Vaga` é `id`, `titulo`, `descricao`, `area`, `senioridade`, `local`, `aceitaIniciante`, `empresa` e `publicadaEm`.
- Antes da implementação, a equipe deve acordar os campos de `Vaga` e as assinaturas dos métodos que as outras frentes chamarão, para que cada integrante programe contra esse contrato.
- `area` e `senioridade` são valores fechados; começam como texto e passam a `enum` na aula 04.

Fonte: [brief oficial — “Como quatro pessoas trabalham sem se atropelar” e “O modelo — o mínimo que a API precisa”](https://cdn.aulas.umlequedetecnologia.com.br/public/introducao-spring-boot/projeto/brief.html).

## Evolução prevista

- Na aula 03, implementar `GET /vagas/busca?area=&senioridade=` para filtros por área e senioridade.
- Na aula 07, implementar `GET /vagas?pagina=&tamanho=` para paginação.
- A Frente 4 abrange filtros, ordenação e estatísticas do catálogo; na aula 07, evolui para `@Query` e projeção.

Fonte: [brief oficial — “Frente 4”, “As rotas que a API vai ter” e “O modelo — o mínimo que a API precisa”](https://cdn.aulas.umlequedetecnologia.com.br/public/introducao-spring-boot/projeto/brief.html).
