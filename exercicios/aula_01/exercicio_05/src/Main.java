import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        int horaAtual = agora.get(Calendar.HOUR_OF_DAY);
        int minutoAtual = agora.get(Calendar.MINUTE);
        int segundoAtual = agora.get(Calendar.SECOND);

        int segundosDesdeMeiaNoite = (horaAtual * 60 + minutoAtual) * 60 + segundoAtual;
        int segundosAteProximaMeiaNoite = ((24 - horaAtual) * 60 - minutoAtual) * 60 - segundoAtual;


        String IMPRIME = String.format(
                """
                Segundos desde a ultima meia-noite: %d
                Segundos até a próxima meia-noite: %d"""
                , segundosDesdeMeiaNoite, segundosAteProximaMeiaNoite
        );

        System.out.print(IMPRIME);
    }
}