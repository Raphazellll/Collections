package com.anotacao;

public class anotacoes {

    /*
           Collection
            * Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos)
                numa única unidade.


            * Serve para armazenar e processar conjuntos ded dados de forma eficiente


            * Antes do Java 2 (JDK 1.2), a implementação de coleções na linguagem Java incluída poucas classes
                e não tinha a organização de um framework.


           Composição Collections

            * Interfaces: É um contrato que quando assumido por uma classe deve ser implementado.

            * Implementações ou Classes: São as materializações, a codificação das interfaces.

            * Algoritmos: É uma sequência lógica, finita e definida de instruções que devem ser seguidas para
                resolver um problema.




           Interface List

                import java.util.List; -> o nome do pacote de listas

             Característica do pacote de lista

                * Elementos duplicados e garante ordem de inserção.


                  ** VECTOR **
                  Um vetor é uma estrutura de dados que armazena elementos do mesmo tipo.
                    Ele é modelado como uma sequência de variáveis, onde cada variável está associada a um índice.
                  Para implementar um vetor, é necessário definir uma classe com membros privados que controlem o tamanho, a capacidade e o ponteiro para o array.
                    A implementação de um vetor pode incluir: Construtor padrão, Construtor com tamanho inicial,
                    Construtor de cópia, Modelos para armazenar elementos de qualquer tipo.

                  ** ArrayList **

                  Para criar um ArrayList, basta chamar o construtor: ArrayList lista = new ArrayList().
                        Para adicionar elementos a um ArrayList, pode-se usar o método add().
                        Para limitar o ArrayList, pode-se usar o Generics, inserindo o tipo de objeto que a lista irá armazenar.
                        Para evitar desperdício de memória, pode-se passar a capacidade inicial por parâmetro no construtor.
                        Para manipular ArrayLists, existem diversos métodos.

                  Alguns exemplos de uso do ArrayList: Criar uma lista de contatos, Criar uma lista de nomes de clientes.

                  ** LinkedList **

                  Para implementar uma LinkedList, é preciso criar uma estrutura de
                    dados que permita a inserção, remoção e pesquisa de elementos.

                    Operações básicas
                        Pesquisar: Encontrar um elemento na lista com base no seu valor ou localização
                        Inserir: Adicionar um novo elemento na lista
                        Excluir: Remover um elemento da lista com base no seu valor ou localização

                    Implementação em Java
                        A LinkedList do Java é uma lista circular duplamente encadeada
                        Cada elemento guarda a posição do elemento anterior e do próximo
                        A classe LinkedList deve salvar a posição do primeiro e do último elemento

                   ** PriorityQueue **

                        A fila de prioridade é uma estrutura de dados que armazena elementos com uma prioridade associada.
                            Os elementos com maior prioridade são retirados da fila antes dos elementos com menor prioridade.

                        Para implementar uma fila de prioridade, é possível usar estruturas de dados como matrizes, listas encadeadas ou heaps binários.
                            Uma das formas mais eficientes é usar um heap binário.
                        Veja alguns exemplos de implementação de fila de prioridade em diferentes linguagens:

                        Java
                            A PriorityQueue é uma implementação da interface Queue,
                                que armazena elementos em uma coleção priorizada.


                     === DIFERENÇAS ENTRE ARRAYLIST E LINKEDLIST ===

       A principal diferença entre ArrayList e LinkedList é a performance nas operações de inserção, remoção e busca de itens.
                ArrayList
                    Armazena os elementos em um array dinâmico
                    É mais rápido para acessar e recuperar dados
                    É adequado para trabalhar com coleções somente leitura
                    É parecido com um vetor

                LinkedList
                    Armazena os elementos em uma lista duplamente vinculada
                    É mais rápido para inserir e remover elementos
                    É adequado para trabalhar com coleções que permitem modificações de dados
                    É uma lista ligada, onde um elemento guarda a referência do próximo elemento
                    A escolha entre ArrayList e LinkedList depende do tipo de operações que serão realizadas na lista.


       Interface Set

         import java.util.Set; -> o nome do pacote Set

         A interface Set em Java faz parte do pacote java.util e é utilizada para representar coleções de elementos únicos (sem duplicatas).
         Ela é uma das estruturas fundamentais do Java Collections Framework e é implementada por
         classes como HashSet, LinkedHashSet e TreeSet. Abaixo estão os principais pontos sobre essa interface,
         com exemplos e contextos práticos:

1. Características Principais

      Elementos únicos: Não permite duplicatas. Tentativas de adicionar elementos repetidos são ignoradas.
        Ordem dos elementos:

            HashSet: Não mantém ordem de inserção.

            LinkedHashSet: Mantém a ordem de inserção.

            TreeSet: Ordena elementos naturalmente (ou por um Comparator).

        Desempenho:

            HashSet é mais rápido para operações básicas (inserção, busca).

            TreeSet é mais lento, mas mantém ordenação automática.

            LinkedHashSet equilibra velocidade e ordem de inserção.

2. Diferenças Entre Set e List

        Característica	Set	List
        Duplicatas	Não permite	Permite
        Ordem de inserção	Depende da implementação	Sempre mantida
        Acesso por índice	Não suportado	Suportado (ex.: get(0))
        Desempenho	Geralmente mais rápido	Pode ser mais lento

3. Boas Práticas

            Implemente equals() e hashCode() para objetos personalizados (ex.: classe Cliente no exemplo de webpage 1).
            Evite modificar elementos após inserção, pois isso pode afetar a unicidade.

            Escolha a implementação correta:
                Use HashSet para velocidade.
                Use LinkedHashSet para ordem de inserção.
                Use TreeSet para ordenação automática.


           
    */

}
