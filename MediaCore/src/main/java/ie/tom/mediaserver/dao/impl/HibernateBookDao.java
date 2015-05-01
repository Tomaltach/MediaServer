package ie.tom.mediaserver.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ie.tom.mediaserver.dao.BookDao;
import ie.tom.mediaserver.entity.Book;

@Repository
@Transactional
public class HibernateBookDao implements BookDao {
	private SessionFactory sessionFactory;

	public HibernateBookDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(book);
	}
	@Override
	public void updateBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(book);
	}
	@Override
	public void saveBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(book);
	}
	@Override
	public void deleteBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(book);
	}
	@Override
	public Book findById(int book_id) {
		Session session = this.sessionFactory.getCurrentSession();
		return (Book) session.get(Book.class, book_id);
	}
	@Override
	public List<Book> findByName(String book_name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> findByGenre(String book_genre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> findByYear(int book_year) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> findByAuthor(String book_author) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Book");
		return q.list();
	}
}
