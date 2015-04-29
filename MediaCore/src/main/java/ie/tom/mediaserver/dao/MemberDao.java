package ie.tom.mediaserver.dao;

import ie.tom.mediaserver.entity.Member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	void addMember(Member member);
	void updateMember(Member member);
	void saveMember(Member member);
	void deleteMember(Member member);
	Member findById(int member_id);
	Member findByUserName(String userName);
	List<Member> findByFirstName(String firstName);
	List<Member> findByLastName(String lastName);
	List<Member> findByEmail(String email);
	List<Member> findAll();
}
