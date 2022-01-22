package de.richarz.app.eventlottery;

import static javax.persistence.GenerationType.*;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Data
public class Event {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  private String name;

  private boolean available;

  @CreationTimestamp
  private Timestamp created;

  @UpdateTimestamp
  private Timestamp updated;

}
