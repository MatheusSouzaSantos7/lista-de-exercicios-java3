import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora{

    // Variáveis e o Scanner
    private int hora, min, seg;
    Scanner ler = new Scanner(System.in);

    // Métodos construtores
    public Hora() {
        // Entrada da hora com tratamento de exceção
        do {
            try {
                System.out.print("Digite a hora: ");
                hora = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                ler.next(); // Limpa o buffer de entrada
                hora = -1;
                continue;
            }
        } while (hora < 0 || hora >= 24);

        // Entrada do minuto com tratamento de exceção
        do {
            try {
                System.out.print("Digite o minuto: ");
                min = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                ler.next(); // Limpa o buffer de entrada
                min = -1;
                continue;
            }
        } while (min < 0 || min > 60);

        // Entrada do segundo com tratamento de exceção
        do {
            try {
                System.out.print("Digite o segundo: ");
                seg = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                ler.next(); // Limpa o buffer de entrada
                seg = -1;
                continue;
            }
        } while (seg < 0 || seg > 60);
    }

    public Hora(int h, int m, int s){
        hora = h;
        min = m;
        seg = s;
    }

    // Getter's e Setter's
    void setHor(int h){
        hora = h;
    }
        
    void setMin(int m){
        min = m;
    }

    void setSeg(int s){
        seg = s;
    }

    void setHor(){
        do {
            try {
                System.out.print("Digite a hora: ");
                hora = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                ler.next(); // Limpa o buffer de entrada
                hora = -1;
                continue;
            }
        } while(hora < 0 || hora >= 24);
    }
        
    void setMin(){
        // Entrada do minuto com tratamento de exceção
        do {
            try {
                System.out.print("Digite o minuto: ");
                min = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                ler.next(); // Limpa o buffer de entrada
                min = -1;
                continue;
            }
        } while (min < 0 || min > 60);
    }

    void setSeg(){
        // Entrada do segundo com tratamento de exceção
        do {
            try {
                System.out.print("Digite o segundo: ");
                seg = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                ler.next(); // Limpa o buffer de entrada
                seg = -1;
                continue;
            }
        } while (seg < 0 || seg > 60);
    }

    int getHor(){
        return hora;
    }

    int getMin(){
        return min;
    }

    int getSeg(){
        return seg;
    }

    // O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;
    String getHora1(){
        return hora + ":" + min + ":" + seg;
    }

    // O método getHora2() deve nos devolver a hora no formato: hh:mm:ss (AM/PM);
    String getHora2(){
        if(hora > 12){
            return (hora-12) + ":" + min + ":" + seg + " PM";
        }else{
            return (hora-12) + ":" + min + ":" + seg + " AM";
        }
    }

    /* O método getSegundos() deve nos devolver a quantidade de segundos expressa na
    hora em questão, (exemplo: 01:00:01 = 3601 segundos). */
    int getSegundos(){
        return (hora*3600) + (min*60) + seg;
    }
}