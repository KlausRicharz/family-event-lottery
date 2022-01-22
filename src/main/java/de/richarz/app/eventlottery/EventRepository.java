package de.richarz.app.eventlottery;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

  @RestResource(rel = "available-equals", path="available-equals")
  List<Event> findAllByAvailable(@Param("query") boolean available);

  @RestResource(rel = "name-contains", path="name-contains")
  List<Event> findAllByNameContains(@Param("query") String name);

}
