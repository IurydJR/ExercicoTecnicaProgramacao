import java.util.Random;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        int ano = gerarAnoAleatorio();
        imprimeSeEAnoBissexto(ano);
    }
    }

    public static boolean isBissexto(int ano) {
        LocalDate ultimoDia = LocalDate.of(ano, 12, 31);
        int ultimoDiaDoAno = ultimoDia.getDayOfYear();
        return ultimoDiaDoAno == 366;
    }

    public static void imprimeSeEAnoBissexto(int ano){
        boolean bool = isBissexto(ano);
        if (bool) {
            System.out.println("O ano " + ano + " é Bissexto");
        } else {
            System.out.println("O ano " + ano + " não é Bissexto");
        }
    }

    public static int gerarAnoAleatorio() {
        int minimo = 1900;
        int maximo = 2100;
        Random AnoAleatorio = new Random();
        return AnoAleatorio.nextInt((maximo - minimo) + 1) + minimo;
    }
}