package ie.tom.mediaserver.dao;

import ie.tom.mediaserver.entity.Book;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
	void addBook(Book book);
	void updateBook(Book book);
	void saveBook(Book book);
	void deleteBook(Book book);
	Book findById(int book_id);
	List<Book> findByName(String book_name);
	List<Book> findByGenre(String book_genre);
	List<Book> findByYear(int book_year);
	List<Book> findByAuthor(String book_author);
	List<Book> findAll();
}
