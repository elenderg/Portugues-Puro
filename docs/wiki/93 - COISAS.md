﻿COISAS

Uma das palavras mais imporantes do compilador é a palavra "coisa". Sempre que o compilador lê a palavra coisa, ele cria um registro especial de tamanho dinâmico, além de criar um registro especial de lista encadeada, assim você pode criar uma lista de coisas. No nosso programa de exemplo, usamos o seguinte comando:

`Uma obra de arte é uma coisa que tem uma URL e uma pintura.`

Mas a definição pode ser expandida para ficar assim:

`Uma obra de arte é um ponteiro para um registro de obra de arte.`
`Uma registro de obra de arte é um registro que tem uma próxima obra de arte, uma URL e uma pintura.`
`Algumas obras de arte são algumas coisas que têm uma primeira obra de arte e uma última obra de arte.`

Obviamente você não sabia disso. De qualquer forma, isso permite que você utilize os comandos:

`ADICIONE uma coisa NO FINAL de algumas coisas.`
`ADICIONE algumas coisas NO FINAL de outras coisas.`
`INSIRA uma coisa DEPOIS de outra coisa DENTRO DE algumas coisas.`
`INSIRA uma coisa ANTES de outra coisa DENTRO DE algumas coisas.`
`INSIRA algumas coisas DEPOIS de outras coisas DENTRO DE uma coisa.`
`INSIRA algumas coisas ANTES de outras coisas DENTRO DE uma coisa.`
`MOVA uma coisa DE algumas coisas PARA outras coisas.`
`MOVA algumas coisas PARA outras coisas.`
`ADICIONE uma coisa NO INÍCIO de algumas coisas.`
`ADICIONE algumas coisas NO INÍCIO de outras coisas.`
`REMOVA uma coisa DE outras coisas.`
`INVERTA algumas coisas.`

Existe também uma função que permite que você "coloque a quantidade de algumas coisas" em uma contagem. Tudo o que você precisa lembrar é de CRIAR e DESTRUIR cada uma de suas coisas. Consulte "Gerenciamento de memória" para mais informações.

