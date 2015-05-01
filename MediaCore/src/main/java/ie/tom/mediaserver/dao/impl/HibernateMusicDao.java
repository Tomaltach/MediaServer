package ie.tom.mediaserver.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ie.tom.mediaserver.dao.MusicDao;
import ie.tom.mediaserver.entity.Music;

@Repository
@Transactional
public class HibernateMusicDao implements MusicDao {
	private SessionFactory sessionFactory;
	
	public HibernateMusicDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addMusic(Music music) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(music);
	}
	@Override
	public void updateMusic(Music music) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(music);
	}
	@Override
	public void saveMusic(Music music) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(music);
	}
	@Override
	public void deleteMusic(Music music) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(music);
	}
	@Override
	public Music findById(int music_id) {
		Session session = this.sessionFactory.getCurrentSession();
		return (Music) session.get(Music.class, music_id);
	}
	@Override
	public List<Music> findByName(String music_name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Music> findByGenre(String music_genre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Music> findByYear(int music_year) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Music> findByArtist(String music_artist) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Music> findByAlbum(String music_album) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Music> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Music");
		return q.list();
	}
}
