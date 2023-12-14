import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 * @author lex4brao
 */

public class ExpLocalDate {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate agora = LocalDate.now();
        LocalDateTime agoraa= LocalDateTime.now();
        Instant global = Instant.now();
        LocalDate  dww = LocalDate.parse("2023-07-20");
        Instant londres = agoraa.atZone(ZoneId.systemDefault()).toInstant();
        ZonedDateTime zonedDateTime = londres.atZone(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        LocalDate formatar =LocalDate.parse("20/07/2022", df);
        LocalDate d0 = LocalDate.of(2024, 07, 22);




        System.out.println("agora = " + agora);
        System.out.println("agoraa = " + agoraa);
        System.out.println("global = " + global);
        System.out.println("dww = " + dww);
        System.out.println("Londres = " + londres);
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("formatar = " + formatar);
        System.out.println("d0 = " + d0);
        System.out.println(londres.toString());

        LocalDate rightNow = LocalDate.now();
        System.out.println("rightNow = " + rightNow);
       rightNow = rightNow.minusWeeks(4);
        System.out.println("rightNow = " + rightNow);
        rightNow = rightNow.plusYears(3);
        System.out.println("rightNow = " + rightNow);

        Duration t1 = Duration.between(agoraa, dww.atStartOfDay());
        System.out.println("t1 = " + t1.toHours());


    }
}
