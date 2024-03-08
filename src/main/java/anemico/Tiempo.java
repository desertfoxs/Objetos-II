package anemico;

import java.time.LocalDateTime;

public class Tiempo {

    private LocalDateTime time;

    public Tiempo(LocalDateTime time) {

        this.time = time;

    }

    public Tiempo() {

        this.time = LocalDateTime.now();

    }

    public LocalDateTime getfecha() {

        return time;
        
    }

}
