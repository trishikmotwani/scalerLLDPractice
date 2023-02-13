package java8localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class JavaLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime from = LocalDateTime.of(2020, 10, 4,
                10, 00, 55);
        LocalDateTime to = LocalDateTime.of(2020, 10, 4,
                10, 21, 1);

        Duration duration = Duration.between(from, to);

        // days between from and to
        System.out.println(duration.toDays() + " days");

        // hours between from and to
        System.out.println(duration.toHours() + " hours");

        // minutes between from and to
        System.out.println(duration.toMinutes() +  " minutes");
        
        double roundOffHours = (double)duration.toMinutes() / 60;
        System.out.println("roundOffHours in int::" +  (int)Math.ceil(roundOffHours));

        // seconds between from and to
        System.out.println(duration.getSeconds() + " seconds");
        System.out.println(duration.getSeconds() + " seconds");

    }

}