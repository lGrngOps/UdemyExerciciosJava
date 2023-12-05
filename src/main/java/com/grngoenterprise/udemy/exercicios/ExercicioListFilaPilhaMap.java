package com.grngoenterprise.udemy.exercicios;

import java.util.*;

public class ExercicioListFilaPilhaMap {

    public static void main(String[] args) {

        // Teste Exercicio LIST

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Jose"));
        lista.add(new Usuario("Carla"));

        System.out.println(lista.contains(new Usuario("Jose")));

        // Teste Exercicio FILA

        Queue<String> fila = new LinkedList<>();

        fila.add("Teste");
        fila.add("Jose");

        System.out.println(fila);

        // Teste Exercicio PILHA

        Deque<String> pilhas = new ArrayDeque<>();

        pilhas.add("Ana");
        pilhas.add("Maria");

        System.out.println(pilhas);
        for (String pilha: pilhas){
            System.out.println(pilha);
        }

        // Teste Exercicio MAP

        Map<Integer, String> users = new HashMap<>();

        users.put(1,"Paloma");
        users.put(2,"Kimberly");
        users.put(10,"Gina");

        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.get(10));

        System.out.println(users);

        for (int chave: users.keySet()){
            System.out.println(chave);
        }

        for (String valor: users.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: users.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

        //Exercicio Hashcode -- Da ruim quando removido o Hashcode da classe Usuario apesar de mantido o Equals

        HashSet<Usuario> use = new HashSet<>();

        use.add(new Usuario("Pedin"));
        use.add(new Usuario("Dipirono"));
        use.add(new Usuario("Ratazano"));

        System.out.println(use.contains(new Usuario("Ratazano")));
    }
}
