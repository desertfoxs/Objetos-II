package noAnemico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tiempo {

    private LocalDateTime time;

    public Tiempo(LocalDateTime time) {
        this.time = time;
    }

    public Tiempo() {
        this.time = LocalDateTime.now();
    }

    public void imprimirFechaLarge() {
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(time));


    }

    public void imprimirFechaShort() {
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(time));

    }
}
