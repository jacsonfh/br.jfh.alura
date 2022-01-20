package br.jfh.alura;

public class TestaCaracteres {

    public static void main(String[] args) {
        char letra2 = 'a';
        char letra = 66;
        System.out.println(letra);
        
        letra = (char) (letra + 1); //Casting
        System.out.println(letra);
        
        String palavra = "Alura cursos de tecnologia.";
        
        palavra = palavra + 2020;
        
        System.out.println(palavra);
        System.out.println(letra2);
        
    }
}

