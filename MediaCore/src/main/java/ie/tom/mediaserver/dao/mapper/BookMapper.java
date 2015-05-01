package ie.tom.mediaserver.dao.mapper;

import ie.tom.mediaserver.entity.Book;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int i) throws SQLException {
		Book b = new Book();
		b.setBook_id(rs.getInt("book_id"));
		b.setBook_name(rs.getString("book_name"));
		b.setBook_genre(rs.getString("book_genre"));
		b.setBook_year(rs.getInt("book_year"));
		b.setBook_author(rs.getString("book_author"));
		b.setFile_name(rs.getString("file_name"));
		b.setFile_type(rs.getString("file_type"));
		b.setFile_path(rs.getString("file_path"));
		
		return b;
	}
}
