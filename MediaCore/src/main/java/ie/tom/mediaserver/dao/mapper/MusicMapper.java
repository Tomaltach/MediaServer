package ie.tom.mediaserver.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ie.tom.mediaserver.entity.Music;

import org.springframework.jdbc.core.RowMapper;

public class MusicMapper implements RowMapper<Music> {

	@Override
	public Music mapRow(ResultSet rs, int i) throws SQLException {
		Music m = new Music();
		m.setSong_id(rs.getInt("song_id"));
		m.setSong_name(rs.getString("song_name"));
		m.setSong_genre(rs.getString("song_genre"));
		m.setSong_year(rs.getInt("song_year"));
		m.setSong_artist(rs.getString("song_artist"));
		m.setSong_album(rs.getString("song_album"));
		m.setSong_track_no(rs.getInt("song_track_no"));
		m.setSong_track_no_of(rs.getInt("song_track_no_of"));
		m.setFile_name(rs.getString("file_name"));
		m.setFile_type(rs.getString("file_type"));
		m.setFile_path(rs.getString("file_path"));
		
		return m;
	}
}
