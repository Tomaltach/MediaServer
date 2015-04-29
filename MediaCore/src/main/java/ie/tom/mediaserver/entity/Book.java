package ie.tom.mediaserver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@XmlRootElement
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int book_id;
	@NotEmpty
	@Size(min=4, max=50)
	private String book_name;
	@NotEmpty
	@Size(min=4, max=25)
	private String book_genre;
	@NotNull
	private int book_year;
	@NotEmpty
	@Size(min=4, max=50)
	private String book_author;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_name;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_type;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_path;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getBook_year() {
		return book_year;
	}
	public void setBook_year(int book_year) {
		this.book_year = book_year;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_type() {
		return file_type;
	}
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
}