package ie.tom.mediaserver.service;

import java.util.List;

import ie.tom.mediaserver.entity.Member;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public interface MemberService {
	void add(Member member);
	void update(Member member);
	void save(Member member);
	void delete(Member member);
	Member findMemberById(int member_id);
	List<Member> findAllMembers();
	List<Member> findAllOverdueMembers();
}
