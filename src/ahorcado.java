import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        char letra;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos < intentosMaximos){

            boolean letraCorrecta = false;

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + ". Letras totales: " + letrasAdivinadas.length);
            System.out.print("Introduce una letra por favor: ");
            letra = Character.toLowerCase(scanner.next().charAt(0));

            for(int i = 0; i < palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta. Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, adivinaste la palabra: " + palabraSecreta);
            }

        }

        if(!palabraAdivinada){
            System.out.println("Lo siento, te quedaste sin intentos. Perdiste.");
        }
        scanner.close();
    }
}