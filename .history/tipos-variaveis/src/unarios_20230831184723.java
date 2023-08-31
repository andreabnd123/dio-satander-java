public class unarios {
    public static void main(String[] args) {
        // são aplicados juntamente com outro operador, aritmetico. Eles realizam alguns trabalhos basicos
        //como incrementar , decrementar, inverter valores numericos e booleanos. 
        // operador unario de valor positivo (+) nmeros sao positivos
        // valor negativo (-) nega um numero ou expressao aritimetica
        // valor incremento de valor (++) incrementa o valor em 1 unidade
        // valor de decremento de valor (--) decrementa o valor em uma unidade. 
        // operador unario logico de negacao - nega o valor de uma expressao (!)
         
              // incremento
       //quando quero incrementar eu tenho um fluxo de repetiçao 
             // numero = numero + 1 

             //operador ternario - definir uma condição e escolher por um dentre dois valor.
             //é representado pelo ponto de interrogação e :
             // representado por <Expressao condicional>  ? <caso condição seja true> : 
             // < caso condição seja false> 

            //int a, b;
            //a = 6;
            //b = 6;
            //String resultado = a == b ?"verdadeiro" : "falso";
            
            //System.out.println(resultado);
            //relacionais avaliam a relação entre duas variaveis
            // == verifica se ha igualdade entre dois valores 
            // != verificar se uma variavel é diferente da outra
            // > maior que; >= maior igual; < menor; <= menor igual. 
            
            int numero1 = 1;
            int numero2 = 2;

           boolean simNao = numero1 == numero2;

           if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
           }

            System.out.println("numeroUm é igual a numeroDois" + simNao);

            simNao = numero1 != numero2;

            System.out.println("numeroUm é diferente a numeroDois" + simNao);
//auxiliam na tomada de decisao 
    }
}
