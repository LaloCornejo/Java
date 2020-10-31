import java.time.*;
public class Reloj {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Instant Date = clock.instant();
        System.out.println( Date.atZone( clock.getZone() ) );
    }
}