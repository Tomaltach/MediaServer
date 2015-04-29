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
@Table(name="movie")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movie_id;
	@NotEmpty
	@Size(min=4, max=50)
	private String movie_name;
	@NotEmpty
	@Size(min=4, max=25)
	private String movie_genre;
	@NotNull
	private int movie_year;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_name;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_type;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_path;
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public int getMovie_year() {
		return movie_year;
	}
	public void setMovie_year(int movie_year) {
		this.movie_year = movie_year;
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