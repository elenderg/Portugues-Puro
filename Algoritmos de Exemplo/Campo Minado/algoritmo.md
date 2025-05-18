# Algoritmo de Campo Minado (Pseudo-código em Português)

## ?? Variáveis Globais

* `campo[LARGURA][ALTURA]`: matriz que representa o campo de jogo.
* `minas[LARGURA][ALTURA]`: indica se há bomba em cada célula.
* `marcacoes[LARGURA][ALTURA]`: indica se o jogador marcou a célula com bandeira.
* `revelado[LARGURA][ALTURA]`: indica se a célula já foi revelada.
* `quantidadeDeMinas`: total de minas no campo.
* `jogoTerminado`: booleano que indica se o jogo acabou.

---

## ?? Início do Jogo

### Procedimento `inicializarJogo()`

1. Defina todas as posições de `campo` como vazias.
2. Defina todas as posições de `revelado` como falso.
3. Defina todas as posições de `marcacoes` como falso.
4. Chame o procedimento `espalharMinasAleatoriamente()`.
5. Chame o procedimento `calcularNumerosAdjacentes()`.

### Procedimento `espalharMinasAleatoriamente()`

1. Enquanto o número de minas espalhadas for menor que `quantidadeDeMinas`, faça o seguinte:

   * Escolha uma posição aleatória.
   * Se não houver mina nessa posição, coloque uma.
   * Some 1 ao contador de minas espalhadas.

### Procedimento `calcularNumerosAdjacentes()`

1. Para cada célula do campo:

   * Se a célula **não contém mina**, chame `contarMinasAoRedor(x, y)` e guarde o número na matriz `campo`.

### Função `contarMinasAoRedor(x, y)` ? inteiro

1. Crie uma variável `contador` e defina como 0.
2. Para cada uma das 8 posições ao redor de `(x, y)`:

   * Se a posição for válida e houver mina, aumente o `contador` em 1.
3. Retorne o `contador`.

---

## ?? Clique Esquerdo do Mouse

### Procedimento `processarCliqueEsquerdo(x, y)`

1. Se `jogoTerminado` for verdadeiro, encerre este procedimento.
2. Se a célula `(x, y)` já foi revelada, não faça nada.
3. Se a célula estiver marcada com bandeira, não faça nada.
4. Se houver mina em `(x, y)`:

   * Chame `explodirJogo()`.
   * Encerre este procedimento.
5. Caso contrário, chame `revelarCelula(x, y)`.

### Procedimento `explodirJogo()`

1. Marque `jogoTerminado` como verdadeiro.
2. Mostre todas as minas na interface.
3. Mostre mensagem de "Você perdeu".

### Procedimento `revelarCelula(x, y)`

1. Marque `revelado[x][y]` como verdadeiro.
2. Se o valor em `campo[x][y]` for zero:

   * Chame `revelarCelulasVizinhas(x, y)`.

### Procedimento `revelarCelulasVizinhas(x, y)`

1. Para cada uma das 8 posições ao redor de `(x, y)`:

   * Se a posição for válida e não estiver revelada:

     * Chame `revelarCelula(nx, ny)` recursivamente.

---

## ?? Clique Direito do Mouse

### Procedimento `processarCliqueDireito(x, y)`

1. Se `jogoTerminado` for verdadeiro, encerre este procedimento.
2. Se a célula `(x, y)` já foi revelada, não faça nada.
3. Inverta o estado de `marcacoes[x][y]`.
4. Atualize a exibição da bandeira na interface.

---

## ? Verificação de Vitória

### Procedimento `verificarVitoria()`

1. Conte quantas células não reveladas ainda restam.
2. Se o número de células não reveladas for igual ao número de minas:

   * Marque `jogoTerminado` como verdadeiro.
   * Mostre mensagem de "Você venceu".

---

## ?? Loop Principal

### Procedimento `loopPrincipal()`

1. Enquanto `jogoTerminado` for falso:

   * Aguarde um clique do jogador.
   * Se for clique esquerdo, chame `processarCliqueEsquerdo(x, y)`.
   * Se for clique direito, chame `processarCliqueDireito(x, y)`.
   * Após cada ação, chame `verificarVitoria()`.
