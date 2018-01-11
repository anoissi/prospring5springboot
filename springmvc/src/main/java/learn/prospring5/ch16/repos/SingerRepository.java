package learn.prospring5.ch16.repos;

import learn.prospring5.ch16.entities.Singer;
import org.springframework.data.repository.CrudRepository;

public interface SingerRepository  extends CrudRepository<Singer,  Long>  {
}