import noAnemico.Tiempo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        Tiempo tiempoNoAnemico = new Tiempo();
        tiempoNoAnemico.imprimirFechaLarge();
        tiempoNoAnemico.imprimirFechaShort();

        /*----------------------------------------*/

        anemico.Tiempo tiempoAnemico = new anemico.Tiempo();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(tiempoAnemico.getfecha()));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(tiempoAnemico.getfecha()));

        /*----------------------------------------*/
        TiempoRecord tiempoRecord = new TiempoRecord(LocalDateTime.now());
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(tiempoRecord.time()));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(tiempoRecord.time()));

    }
}