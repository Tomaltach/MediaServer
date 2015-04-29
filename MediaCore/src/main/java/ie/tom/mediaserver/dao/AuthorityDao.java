package ie.tom.mediaserver.dao;

import ie.tom.mediaserver.entity.Authority;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityDao {
	void addAuthority(Authority authority);
	void updateAuthority(Authority authority);
	void saveAuthority(Authority authority);
	void deleteAuthority(Authority authority);
	List<Authority> findAll();
	Authority getByName(String username);
}
