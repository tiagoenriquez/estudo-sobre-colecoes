##Estudo sobre coleções

<p>
  Trata-se de uma aplicação desenvolvida para ser a disciplina Estrutura de Dados do curso de Ciência da Computação, que mostra o comportamento de coleções 
  quando removemos seus elementos e inserimos em coleções de outros tipos.
</p>

<p>
  Esta aplicação especificamente trata das coleções Lista, Fila e Pilha, que são estruturas de dados que comportam vários dados do mesmo tipo ou da mesma 
  classe, cada qual com sua regra para inserção e remoção de seus elementos.
</p>

<p>
  Nesta aplicação, a principal diferença entre as três coleções mencionadas se dá na remoção dos elementos, uma vez que, ao inserir, o elemento sempre vai 
  para a primeira posição da lista, ou seja, a posição de índice 0.
</p>

<p>
  Na remoção se dá a principal diferença. Na Lista, para a remoção ocorrer, precisamos informar qual é o elemento a ser removido, uma vez que não existe 
  ordem pre-definda para remoção. Por exemplo, numa lista de supermercado, podemos remover os itens da lista de pendentes conforme achamos nas prateleiras.
  Já na pilha, a remoção é sempre do último elemento. Ao contrário da fila, cujo elemento removido é sempre o primeiro.
</p>

<p>
  Esse estudo contem seis etapas. Na primeira uma lista foi criada com cinco elementos. Na segunda, os elementos da lista foram para uma pilha e a lista foi 
  esvaziada. Na terceira, os elementos da pilha foram para uma fila de 10 posições e a pilha foi esvaziada. Na quarta, foi criada uma nova lista com cinco 
  elementos diferentes dos primeiros. Repetiram-se as etapas 2 e 3 na etapa 5. E na sexta e última etapa, o programa mostra os elementos na fila na ordem 
  em que foram inseridas.
</p>

<p>
  Observou-se que as ordens das inserções foram mantidas. Os cinco primeiros elementos ficaram antes dos cinco últimos. Mas dentro de cada inserção, as 
  ordens foram invertidas. Pois, a fila recebeu os elementos a partir das remoções das pilhas, que sempre ocorrem do último, invertendo a ordem da coleção 
  que venha a receber seus elementos removidos.
</p>
