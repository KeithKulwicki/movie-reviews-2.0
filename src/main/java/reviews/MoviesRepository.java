package reviews;

import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movie, Long> {

}