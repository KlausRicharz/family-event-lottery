package de.richarz.app.eventlottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EventLotteryApplication {

  public static void main(String[] args) {
    SpringApplication.run(EventLotteryApplication.class, args);
  }

}
