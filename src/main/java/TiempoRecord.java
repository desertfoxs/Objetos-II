import java.time.LocalDateTime;
import java.util.Objects;

public final class TiempoRecord {
    private final LocalDateTime time;

    public TiempoRecord(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime time() {
        return time;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TiempoRecord) obj;
        return Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }

    @Override
    public String toString() {
        return "TiempoRecord[" +
                "time=" + time + ']';
    }


}
