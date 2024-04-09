package hongnt.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //Task: talk to database and getting data
    Optional<Movie> findMovieByImdbId(String imdbId);
}
