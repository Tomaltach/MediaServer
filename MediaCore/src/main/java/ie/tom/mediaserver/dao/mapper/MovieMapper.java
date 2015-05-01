package ie.tom.mediaserver.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ie.tom.mediaserver.entity.Movie;

import org.springframework.jdbc.core.RowMapper;

public class MovieMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet rs, int i) throws SQLException {
		Movie m = new Movie();
		m.setMovie_id(rs.getInt("movie_id"));
		m.setMovie_name(rs.getString("movie_name"));
		m.setMovie_genre(rs.getString("movie_genre"));
		m.setMovie_year(rs.getInt("movie_year"));
		m.setFile_name(rs.getString("file_name"));
		m.setFile_type(rs.getString("file_type"));
		m.setFile_path(rs.getString("file_path"));
		
		return m;
	}
}
