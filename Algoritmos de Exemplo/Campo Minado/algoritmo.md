# Algoritmo de Campo Minado (Pseudo-c�digo em Portugu�s)

## ?? Vari�veis Globais

* `campo[LARGURA][ALTURA]`: matriz que representa o campo de jogo.
* `minas[LARGURA][ALTURA]`: indica se h� bomba em cada c�lula.
* `marcacoes[LARGURA][ALTURA]`: indica se o jogador marcou a c�lula com bandeira.
* `revelado[LARGURA][ALTURA]`: indica se a c�lula j� foi revelada.
* `quantidadeDeMinas`: total de minas no campo.
* `jogoTerminado`: booleano que indica se o jogo acabou.

---

## ?? In�cio do Jogo

### Procedimento `inicializarJogo()`

1. Defina todas as posi��es de `campo` como vazias.
2. Defina todas as posi��es de `revelado` como falso.
3. Defina todas as posi��es de `marcacoes` como falso.
4. Chame o procedimento `espalharMinasAleatoriamente()`.
5. Chame o procedimento `calcularNumerosAdjacentes()`.

### Procedimento `espalharMinasAleatoriamente()`

1. Enquanto o n�mero de minas espalhadas for menor que `quantidadeDeMinas`, fa�a o seguinte:

   * Escolha uma posi��o aleat�ria.
   * Se n�o houver mina nessa posi��o, coloque uma.
   * Some 1 ao contador de minas espalhadas.

### Procedimento `calcularNumerosAdjacentes()`

1. Para cada c�lula do campo:

   * Se a c�lula **n�o cont�m mina**, chame `contarMinasAoRedor(x, y)` e guarde o n�mero na matriz `campo`.

### Fun��o `contarMinasAoRedor(x, y)` ? inteiro

1. Crie uma vari�vel `contador` e defina como 0.
2. Para cada uma das 8 posi��es ao redor de `(x, y)`:

   * Se a posi��o for v�lida e houver mina, aumente o `contador` em 1.
3. Retorne o `contador`.

---

## ?? Clique Esquerdo do Mouse

### Procedimento `processarCliqueEsquerdo(x, y)`

1. Se `jogoTerminado` for verdadeiro, encerre este procedimento.
2. Se a c�lula `(x, y)` j� foi revelada, n�o fa�a nada.
3. Se a c�lula estiver marcada com bandeira, n�o fa�a nada.
4. Se houver mina em `(x, y)`:

   * Chame `explodirJogo()`.
   * Encerre este procedimento.
5. Caso contr�rio, chame `revelarCelula(x, y)`.

### Procedimento `explodirJogo()`

1. Marque `jogoTerminado` como verdadeiro.
2. Mostre todas as minas na interface.
3. Mostre mensagem de "Voc� perdeu".

### Procedimento `revelarCelula(x, y)`

1. Marque `revelado[x][y]` como verdadeiro.
2. Se o valor em `campo[x][y]` for zero:

   * Chame `revelarCelulasVizinhas(x, y)`.

### Procedimento `revelarCelulasVizinhas(x, y)`

1. Para cada uma das 8 posi��es ao redor de `(x, y)`:

   * Se a posi��o for v�lida e n�o estiver revelada:

     * Chame `revelarCelula(nx, ny)` recursivamente.

---

## ?? Clique Direito do Mouse

### Procedimento `processarCliqueDireito(x, y)`

1. Se `jogoTerminado` for verdadeiro, encerre este procedimento.
2. Se a c�lula `(x, y)` j� foi revelada, n�o fa�a nada.
3. Inverta o estado de `marcacoes[x][y]`.
4. Atualize a exibi��o da bandeira na interface.

---

## ? Verifica��o de Vit�ria

### Procedimento `verificarVitoria()`

1. Conte quantas c�lulas n�o reveladas ainda restam.
2. Se o n�mero de c�lulas n�o reveladas for igual ao n�mero de minas:

   * Marque `jogoTerminado` como verdadeiro.
   * Mostre mensagem de "Voc� venceu".

---

## ?? Loop Principal

### Procedimento `loopPrincipal()`

1. Enquanto `jogoTerminado` for falso:

   * Aguarde um clique do jogador.
   * Se for clique esquerdo, chame `processarCliqueEsquerdo(x, y)`.
   * Se for clique direito, chame `processarCliqueDireito(x, y)`.
   * Ap�s cada a��o, chame `verificarVitoria()`.
