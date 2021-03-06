import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class Main {
  public static void main(String[] args) {

    Calendar c = Calendar.getInstance();
    Calendar saoPauloDate = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));

    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    LocalDateTime splocalTime = zonedDateTime.toLocalDateTime();
  
    System.out.println("#############################################");
    System.out.println("\nInforme do horário do dia\n");
    System.out.println("#############################################");
    System.out.println("\nData e Hora atual: " + c.getTime());

    TimeZone tz = c.getTimeZone();

    System.out.println("\nTimezone: " + tz.getDisplayName());

    ZoneId saoPauloZoneId = ZoneId.of("America/Sao_Paulo");
    System.out.println("TimeZone : " + saoPauloZoneId);

    System.out.println("\nData e Hora atual: " + splocalTime);

    int hours = c.get(Calendar.HOUR_OF_DAY);
    int minutes = c.get(Calendar.MINUTE);
    int seconds = c.get(Calendar.SECOND);

    System.out.println("\n\n#############################################\n\n");


    // data/hora atual
    LocalDateTime agora = LocalDateTime.now();

    // formatar a data
    DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    String dataFormatada = formatterData.format(agora);

    // formatar a hora
    DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    String horaFormatada = formatterHora.format(agora);// 

    System.out.println(dataFormatada);
    System.out.println(horaFormatada);



    System.out.println("\n\n#############################################\n\n");


    if (hours > 5 & hours < 12){
      System.out.println("Bom Dia!!!!");
    }
    else{
      if (hours > 13 & hours < 19){
        System.out.println("Boa Tarde!!!!");
      }
      else{
        System.out.println("Boa Noite!!!!");
      }
    }
    
    
    
  }
}
