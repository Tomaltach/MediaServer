package ie.tom.mediaserver.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ie.tom.mediaserver.dao.MovieDao;
import ie.tom.mediaserver.entity.Movie;

@Repository
@Transactional
public class HibernateMovieDao implements MovieDao {
	private SessionFactory sessionFactory;
	
	public HibernateMovieDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addMovie(Movie movie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(movie);
	}
	@Override
	public void updateMovie(Movie movie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(movie);
	}
	@Override
	public void saveMovie(Movie movie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(movie);
	}
	@Override
	public void deleteMovie(Movie movie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(movie);
	}
	@Override
	public Movie findById(int movie_id) {
		Session session = this.sessionFactory.getCurrentSession();
		return (Movie) session.get(Movie.class, movie_id);
	}
	@Override
	public List<Movie> findByName(String movie_name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Movie> findByGenre(String movie_genre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Movie> findByYear(int movie_year) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Movie");
		return q.list();
	}
}
