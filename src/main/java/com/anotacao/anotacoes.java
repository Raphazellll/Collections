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



=======================================================================================================================

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

=======================================================================================================================

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


=======================================================================================================================
         Coleções de Pares: Map

            A interface Map em Java faz parte do pacote java.util e é usada para representar uma estrutura de dados que armazena pares chave-valor, onde cada chave é única.
            Ela é amplamente utilizada para buscar, atualizar ou gerenciar dados de forma eficiente.


            Características Principais:
                Chaves Únicas: Não permite chaves duplicadas.

                Valores Repetidos: Os valores podem ser duplicados.

                Não é uma Coleção: Map não estende a interface Collection, mas faz parte do framework de coleções do Java.

            Implementações Comuns:
                HashMap: Armazena pares chave-valor em uma tabela hash (não ordenada).

                TreeMap: Armazena pares chave-valor em uma estrutura de árvore (ordenada por chaves).

                LinkedHashMap: Mantém a ordem de inserção das chaves.

                Quando Usar:
                    Quando você precisa de acesso rápido a valores através de uma chave única.

                    Para implementar estruturas como dicionários ou catálogos.

                Observações:
                    Use HashMap para performance geral.
                    Use TreeMap se precisar de ordenação pelas chaves.
                    Use LinkedHashMap para manter a ordem de inserção.
                    Se precisar de thread-safety, considere ConcurrentHashMap ou Collections.synchronizedMap().

=======================================================================================================================

    Java Stream

        Classe Anônima
            A classe anônima em JAVA é uma classe que não recebeu um nome e é tanto declarado e instanciado em uma única instrução.
                Devemos considerar o uso de uma classe anônima sempre que você precisa para criar uma classe
                que será instanciado apenas uma vez.

            A classe anônima em Java é uma classe sem nome declarada e instanciada diretamente no ponto de uso,
                geralmente para sobrescrever métodos de uma interface ou classe abstrata de forma rápida e concisa.
                É útil quando você precisa de uma implementação única e não deseja criar uma classe separada.

        Características:
            Sem Nome: Não possui declaração formal (definida "on-the-fly").
            Uso Imediato: É declarada e instanciada no mesmo local.
            Acesso a Variáveis Locais: Pode acessar variáveis do escopo externo,
                desde que sejam final ou effectively final.

        Implementação de Interfaces/Classes Abstratas: Usada para implementar métodos de interfaces ou classes abstratas diretamente.


     Limitações:
        Sem Construtor: Não é possível definir um construtor explícito.
        Código Menos Legível: Pode tornar o código confuso se muito complexa.
        Não Reutilizável: Projetada para uso único.


     Quando Usar:
        Para implementações simples e únicas (ex: eventos, threads).
        Quando não é necessário reutilizar a lógica em outro contexto.
        Em substituição a interfaces funcionais (antes do Java 8, onde hoje usamos lambdas).


    EXEMPLO:
           Sem Classe Anônima

       List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Vicente", 8, "Preto"));
            add(new Gato("Oliver", 5, "Siamês" ));
            add(new Gato("Morgana", 3, "Frajola"));
            add(new Gato("Tom", 6, "Frajola Cinza"));
            add(new Gato("Lucca", 3, "Branco"));
            add(new Gato("Laranjinha", 3, "Laranja com Branco"));
        }};
        meusGatos.sort(new ComparatorIdade());

      class ComparatorIdade( implements Comparator<Gato> {
      public int compare (Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());

       }
     }

     Com Classe Anônima

    List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Vicente", 8, "Preto"));
            add(new Gato("Oliver", 5, "Siamês" ));
            add(new Gato("Morgana", 3, "Frajola"));
            add(new Gato("Tom", 6, "Frajola Cinza"));
            add(new Gato("Lucca", 3, "Branco"));
            add(new Gato("Laranjinha", 3, "Laranja com Branco"));
        }};
        meusGatos.sort(new Comparator<Gato>() {
            public int compare (Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
        }
      }


        Funcional Interrface

            Qualquer interface com um SAM(Single Abstract Method) é uma interface funcional e sua implementação
                pode ser tratada como expressões lAMBDA

            Uma interface funcional é uma interface que possui exatamente um método abstrato.
                Elas são a base para expressões lambda e métodos de referência em Java, introduzidos a partir do Java 8.

        Características Principais:
            Apenas um método abstrato: Pode ter vários métodos default ou static, mas apenas um método abstrato.

            Anotação @FunctionalInterface: Opcional, mas recomenda-se usá-la para garantir que a interface atenda aos requisitos
                    de uma interface funcional (gera erro de compilação se houver mais de um método abstrato).

        Exemplos de Interfaces Funcionais no Java:
    Runnable: método run().
    Comparator<T>: método compare(T o1, T o2).
    Interfaces no pacote java.util.function:
    Predicate<T>: testa uma condição (método test(T t)).
    Function<T, R>: transforma um valor T em R (método apply(T t)).
    Consumer<T>: consome um valor T (método accept(T t)).
    Supplier<T>: fornece um valor T (método get()).

    Por que usar interfaces funcionais?
        Permitem escrever código mais conciso com expressões lambda.
        Facilitam a programação funcional em Java.
        São compatíveis com APIs modernas, como Streams.


       Lambda
          Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno
            e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.
            As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

            (parâmetros) -> { corpo da expressão }

          Parâmetros: Lista de parâmetros (pode ser vazia).
            Operador ->: Separa parâmetros do corpo.
            Corpo: Código que implementa o método da interface funcional.

            EXEMPLOS PRÁTICOS:

        Sem parâmetros:
                Runnable r = () -> System.out.println("Hello Lambda!");
                r.run(); // Saída: Hello Lambda!

        Com um parâmetro:
            Consumer<String> imprimir = (s) -> System.out.println(s);
            imprimir.accept("Java é legal!"); // Saída: Java é legal!

        Com múltiplos parâmetros:
        // Usando a interface funcional "Calculadora" do exemplo anterior
            Calculadora soma = (a, b) -> a + b;
            System.out.println(soma.calcular(2, 3)); //

        Corpo com múltiplas linhas:

            Calculadora potencia = (a, b) -> {
                int resultado = 1;
                for (int i = 0; i < b; i++) {
                resultado *= a;
            }
                return resultado;
        };
            System.out.println(potencia.calcular(2, 3)); // Saída: 8

            Principais Benefícios
                Código mais curto: Elimina boilerplate de classes anônimas.
                Melhora a legibilidade: Foco na lógica, não na estrutura.
                Compatível com Streams e programação funcional: Permite operações como filter, map, reduce, etc.

            Casos de Uso Comuns
                1. Com interfaces do pacote java.util.function:
                // Predicate: retorna true/false
                    Predicate<Integer> isPar = n -> n % 2 == 0;
                    System.out.println(isPar.test(4)); // Saída: true

               // Function: transforma um valor
                    Function<String, Integer> tamanhoTexto = s -> s.length();
                    System.out.println(tamanhoTexto.apply("Lambda")); // Saída: 6

               2. Com Streams:
                    List<String> palavras = Arrays.asList("Java", "Lambda", "Stream");
                        // Filtrar palavras com mais de 4 caracteres
                        List<String> filtradas = palavras.stream()
                        .filter(p -> p.length() > 4)
                        .collect(Collectors.toList());
                    System.out.println(filtradas); // Saída: [Lambda, Stream]


             Regras Importantes
                Variáveis locais em lambdas: Devem ser final ou efetivamente finais (não modificadas após a declaração).

                        int x = 10;
                            Runnable r = () -> System.out.println(x); // OK (x é efetivamente final)

                Inferência de tipos: O compilador infere tipos dos parâmetros.

                        // Não é necessário declarar o tipo de "a" e "b"
                            Calculadora divisao = (a, b) -> a / b;

                 Métodos de referência: Podem substituir lambdas em certos casos.

                        Consumer<String> imprimir = System.out::println;

                Resumo:

                    Lambdas simplificam a implementação de interfaces funcionais.
                    São ideais para operações curtas e de uso único.
                    Combinam perfeitamente com Streams e programação funcional.


     Reference Method

            Method Reference é um novo recurso do JAVA 8 que permite fazer referências a um método ou construtor
                de uma classe (de forma funcional) e assim, indicar que ele deve ser utilizado num ponto
                específico do código, deixando-o mais imples e legível. Para utilizálo, basta informar uma classe
                ou referência seguida do símbolo (::) e o nome do método sem os parênteses no final.

             Sintaxe Básica:
                Classe::metodo

             Tipos de Métodos de Referência
             Há 4 tipos principais:

                1. Método Estático
                       Referencia um método estático de uma classe.
                    // Lambda:
                        Function<Integer, String> converter = num -> String.valueOf(num);

                   // Método de referência:
                        Function<Integer, String> converter = String::valueOf;

                 2. Método de Instância de um Objeto Específico
                        Referencia um método de um objeto já criado.
                        // Lambda:
                            Consumer<String> imprimir = s -> System.out.println(s);

                       // Método de referência:
                            Consumer<String> imprimir = System.out::println;

                 3. Método de Instância de um Objeto Arbitrário
                        Referencia um método de um objeto que será passado como parâmetro.
                       // Lambda:
                            Function<String, Integer> tamanho = s -> s.length();

                      // Método de referência:
                            Function<String, Integer> tamanho = String::length;

                  4. Construtor
                        Referencia o construtor de uma classe.
                        // Lambda:
                            Supplier<List<String>> criarLista = () -> new ArrayList<>();

                       // Método de referência:
                            Supplier<List<String>> criarLista = ArrayList::new;

           Quando Usar?
                Reutilização de código: Se um método já existe e faz exatamente o que você precisa.

                Legibilidade: Quando a expressão lambda é redundante (ex: s -> System.out.println(s)).

                Concisão: Reduz código repetitivo.

            Vantagens:
                Código mais limpo: Evita repetição de lógica.
                Facilita a manutenção: Alterações no método referenciado refletem automaticamente.
                Integração com Streams: Usado frequentemente em operações como map, filter, etc.


                Comparação: Lambda vs. Método de Referência
                Lambda	                        Método de Referência
                s -> s.toUpperCase()	        String::toUpperCase
                () -> new ArrayList<>()	        ArrayList::new
                x -> Math.pow(x, 2)	            Math::pow


       Regras Importantes:
            O método referenciado deve ser compatível com a interface funcional (mesmo número e tipo de parâmetros).

            Não é possível usar métodos de referência para métodos genéricos sem especificar tipos.

       Resumo:
            Métodos de referência são atalhos para expressões lambda que reutilizam métodos existentes. São úteis para:

            Simplificar código repetitivo.

            Tornar operações funcionais mais claras.


         STREAMS API

            O que é a Stream API?
                Introduzida no Java 8, a Stream API é uma forma de processar coleções (listas, conjuntos, etc.) de maneira declarativa e funcional,
                    permitindo operações como filtragem, mapeamento, ordenação e redução com código conciso e legível.

            Principais Características:

                Não altera a coleção original: Trabalha em uma cópia dos dados.
                Operações encadeadas: Permite combinar múltiplas operações (ex: filter + map + collect).
                Laziness: Apenas operações terminais (como collect) executam o processamento.
                Paralelismo: Facilita processamento paralelo com .parallel().


            Fluxo de Trabalho com Streams
                Criar uma stream: A partir de uma coleção (lista, conjunto, etc.).
                Operações intermediárias: Transformam a stream (filter, map, sorted).
                Operação terminal: Produz um resultado ou efeito (collect, forEach, reduce).



        Principais Operações
            1. Criar uma Stream




 */


}
