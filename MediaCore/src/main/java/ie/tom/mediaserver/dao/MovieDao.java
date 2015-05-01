package ie.tom.mediaserver.dao;

import ie.tom.mediaserver.entity.Movie;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao {
	void addMovie(Movie movie);
	void updateMovie(Movie movie);
	void saveMovie(Movie movie);
	void deleteMovie(Movie movie);
	Movie findById(int movie_id);
	List<Movie> findByName(String movie_name);
	List<Movie> findByGenre(String movie_genre);
	List<Movie> findByYear(int movie_year);
	List<Movie> findAll();
}
