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
@Table(name="music")
public class Music {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int song_id;
	@NotEmpty
	@Size(min=4, max=50)
	private String song_name;
	@NotEmpty
	@Size(min=4, max=25)
	private String song_genre;
	@NotNull
	private int song_year;
	@NotEmpty
	@Size(min=4, max=50)
	private String song_artist;
	@NotEmpty
	@Size(min=4, max=50)
	private String song_album;
	@NotNull
	private int song_track_no;
	@NotNull
	private int song_track_no_of;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_name;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_type;
	@NotEmpty
	@Size(min=4, max=50)
	private String file_path;
	
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	
	public String getSong_name() {
		return song_name;
	}
	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}
	public String getSong_genre() {
		return song_genre;
	}
	public void setSong_genre(String song_genre) {
		this.song_genre = song_genre;
	}
	public int getSong_year() {
		return song_year;
	}
	public void setSong_year(int song_year) {
		this.song_year = song_year;
	}
	public String getSong_artist() {
		return song_artist;
	}
	public void setSong_artist(String song_artist) {
		this.song_artist = song_artist;
	}
	public String getSong_album() {
		return song_album;
	}
	public void setSong_album(String song_album) {
		this.song_album = song_album;
	}
	public int getSong_track_no() {
		return song_track_no;
	}
	public void setSong_track_no(int song_track_no) {
		this.song_track_no = song_track_no;
	}
	public int getSong_track_no_of() {
		return song_track_no_of;
	}
	public void setSong_track_no_of(int song_track_no_of) {
		this.song_track_no_of = song_track_no_of;
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