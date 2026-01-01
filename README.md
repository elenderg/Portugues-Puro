# Português Puro
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![Contribuidores](https://img.shields.io/badge/all_contributors-7-orange.svg?style=flat-square)](#contribuidores-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->
Repositório oficial do **Compilador da Linguagem de Programação Português Puro**.

Português Puro é uma linguagem projetada com foco em **clareza, legibilidade e estrutura explícita**, buscando tornar o código compreensível mesmo para quem está dando os primeiros passos em programação — sem abrir mão de conceitos reais de linguagens compiladas.

📘 **Documentação oficial da linguagem:**
[https://portugues-puro.gitbook.io/documentacao/](https://portugues-puro.gitbook.io/documentacao/)

## 🎯 Objetivo do projeto

Este projeto existe para:

* Oferecer uma linguagem **didática**, mas **real**, não um “pseudo-código”
* Incentivar boas práticas como:

  * Código legível
  * Fluxo de controle explícito
  * Estrutura sequencial clara
* Servir como base para estudos de:

  * Compiladores
  * Design de linguagens
  * Ferramentas de desenvolvimento

O compilador é desenvolvido com a preocupação de ser **compreensível e aperfeiçoável**, inclusive por novos contribuidores.

## 📦 Instalação
Não é necessário qualquer processo de instalação.

O compilador é distribuído como um executável e pode ser invocado diretamente pela linha de comando.

## ▶️ Uso
Para compilar um projeto, abra o terminal e execute o compilador informando o diretório do projeto:

```
C:\path_do_compilador.exe C:\path_do_projeto_a_ser_compilado\
```
![Captura de tela expondo o processo de compilação](https://raw.githubusercontent.com/elenderg/Portugues-Puro/refs/heads/main/Algoritmos%20de%20Exemplo/Processo%20de%20Compilacao.png)

Substitua:

* `C:\path_do_compilador.exe` pelo caminho completo do executável do compilador
* `C:\path_do_projeto_a_ser_compilado\` pelo diretório do projeto a ser compilado
 
### Observações sobre o ambiente

* **Windows 8 ou anterior**:
  Execute o prompt de comando como Administrador. Caso contrário, o *codepage* não poderá ser definido corretamente, resultando em caracteres incorretos nas mensagens de erro.

* **PowerShell**:
  Certifique-se de ajustar corretamente o `PATH` ao invocar o compilador.

Essas limitações são conhecidas e documentadas para evitar confusão durante o uso inicial.


## 📌 Outras Observações importantes

Assim como em outras linguagens de programação, o projeto a ser compilado deve incluir a **biblioteca padrão**.

Certifique-se de que o arquivo que contém a biblioteca padrão esteja no **mesmo diretório** do projeto.
Sem isso, algumas funcionalidades da linguagem não estarão disponíveis.

Essa decisão foi tomada para manter o modelo de compilação simples e explícito, especialmente para fins educacionais.

## 🧱 Organização e filosofia do código

O código do compilador segue alguns princípios básicos:

* Estrutura clara e previsível
* Evitar “mágica” implícita
* Preferir código legível a soluções excessivamente compactas
* Separação explícita de responsabilidades

O objetivo não é apenas **funcionar**, mas também **ser compreendido**.

Novos contribuidores são incentivados a ler o código com calma e questionar decisões — muitas delas são resultado de trade-offs conscientes.

## 🤝 Contribuição

Contribuições são muito bem-vindas.

Você pode contribuir de várias formas:

* Reportando problemas (issues)
* Sugerindo melhorias
* Enviando *pull requests*
* Melhorando a documentação
* Criando exemplos

Antes de contribuir, consulte o guia:
📄 [https://github.com/elenderg/Portugues-Puro/blob/main/CONTRIBUTING.md](https://github.com/elenderg/Portugues-Puro/blob/main/CONTRIBUTING.md)

O projeto busca ser **acolhedor para novos contribuidores**, inclusive aqueles que estão aprendendo sobre compiladores ou linguagens.

## 🆘 Suporte

Dúvidas, sugestões ou problemas podem ser enviados através das *issues*:
👉 [https://github.com/elenderg/Portugues-Puro/issues/new/choose](https://github.com/elenderg/Portugues-Puro/issues/new/choose)

## 📜 Código de Conduta

Este projeto segue um código de conduta para garantir um ambiente respeitoso e colaborativo.
📄 [https://github.com/elenderg/Portugues-Puro/blob/main/CODE_OF_CONDUCT.md](https://github.com/elenderg/Portugues-Puro/blob/main/CODE_OF_CONDUCT.md)

## 👤 Autor
[Elender Góis Gallas](https://www.linkedin.com/in/elender/)

## 📄 Licença

Este projeto está licenciado sob a [Unlicense](https://github.com/elenderg/Portugues-Puro/blob/main/LICENSE) - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## ✨ Contribuidores

Agradecemos às seguintes pessoas pela colaboração direta e indireta neste projeto:  

[Gerry Rzeppa](https://www.linkedin.com/in/gerry-rzeppa-17b8051b/)  
Dan Rzeppa  
[Pablo Cayuella](https://www.linkedin.com/in/pablo-cayuela-a42b019/)  
[Jasper Paulsen](https://github.com/Folds)  
[Walter Moura Júnior](https://github.com/waltermourajr)  
[Élisson Góis Gallas](https://github.com/elisson-zlq3x)  
[Mike Gonta](https://github.com/mikegonta)  


<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/elenderg"><img src="https://avatars.githubusercontent.com/u/1089556?v=4?s=100" width="100px;" alt="Elender"/><br /><sub><b>Elender</b></sub></a><br /><a href="#ideas-elenderg" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=elenderg" title="Code">💻</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=elenderg" title="Documentation">📖</a> <a href="#example-elenderg" title="Examples">💡</a> <a href="#mentoring-elenderg" title="Mentoring">🧑‍🏫</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/elisson-zlq3x"><img src="https://avatars.githubusercontent.com/u/132157891?v=4?s=100" width="100px;" alt="Élisson Góis Gallas"/><br /><sub><b>Élisson Góis Gallas</b></sub></a><br /><a href="#ideas-elisson-zlq3x" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=elisson-zlq3x" title="Code">💻</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=elisson-zlq3x" title="Documentation">📖</a> <a href="#example-elisson-zlq3x" title="Examples">💡</a> <a href="#mentoring-elisson-zlq3x" title="Mentoring">🧑‍🏫</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/waltermourajr"><img src="https://avatars.githubusercontent.com/u/53488670?v=4?s=100" width="100px;" alt="Walter Jr"/><br /><sub><b>Walter Jr</b></sub></a><br /><a href="#ideas-waltermourajr" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=waltermourajr" title="Code">💻</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=waltermourajr" title="Documentation">📖</a> <a href="#example-waltermourajr" title="Examples">💡</a> <a href="#mentoring-waltermourajr" title="Mentoring">🧑‍🏫</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/Folds"><img src="https://avatars.githubusercontent.com/u/6874247?v=4?s=100" width="100px;" alt="Folds"/><br /><sub><b>Folds</b></sub></a><br /><a href="#ideas-Folds" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=Folds" title="Code">💻</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=Folds" title="Documentation">📖</a> <a href="#example-Folds" title="Examples">💡</a> <a href="#mentoring-Folds" title="Mentoring">🧑‍🏫</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/mikegonta"><img src="https://avatars.githubusercontent.com/u/11521753?v=4?s=100" width="100px;" alt="Mike Gonta"/><br /><sub><b>Mike Gonta</b></sub></a><br /><a href="#ideas-mikegonta" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=mikegonta" title="Code">💻</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=mikegonta" title="Documentation">📖</a> <a href="#example-mikegonta" title="Examples">💡</a> <a href="#mentoring-mikegonta" title="Mentoring">🧑‍🏫</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/pcayuela"><img src="https://avatars.githubusercontent.com/u/17735677?v=4?s=100" width="100px;" alt="pcayuela"/><br /><sub><b>pcayuela</b></sub></a><br /><a href="#ideas-pcayuela" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=pcayuela" title="Code">💻</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=pcayuela" title="Documentation">📖</a> <a href="#example-pcayuela" title="Examples">💡</a> <a href="#mentoring-pcayuela" title="Mentoring">🧑‍🏫</a></td>
      <td align="center" valign="top" width="14.28%"><a href="http://www.osmosian.com"><img src="https://avatars.githubusercontent.com/u/7067092?v=4?s=100" width="100px;" alt="Gerry Rzeppa"/><br /><sub><b>Gerry Rzeppa</b></sub></a><br /><a href="#ideas-GerryRzeppa" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=GerryRzeppa" title="Code">💻</a> <a href="https://github.com/elenderg/Portugues-Puro/commits?author=GerryRzeppa" title="Documentation">📖</a> <a href="#example-GerryRzeppa" title="Examples">💡</a> <a href="#mentoring-GerryRzeppa" title="Mentoring">🧑‍🏫</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

Este projeto segue a especificação [all-contributors](https://github.com/all-contributors/all-contributors). Contribuições de todo tipo são bem-vindas.
