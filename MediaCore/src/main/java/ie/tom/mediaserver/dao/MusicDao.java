package ie.tom.mediaserver.dao;

import ie.tom.mediaserver.entity.Music;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MusicDao {
	void addMusic(Music music);
	void updateMusic(Music music);
	void saveMusic(Music music);
	void deleteMusic(Music music);
	Music findById(int music_id);
	List<Music> findByName(String music_name);
	List<Music> findByGenre(String music_genre);
	List<Music> findByYear(int music_year);
	List<Music> findByArtist(String music_artist);
	List<Music> findByAlbum(String music_album);
	List<Music> findAll();
}
