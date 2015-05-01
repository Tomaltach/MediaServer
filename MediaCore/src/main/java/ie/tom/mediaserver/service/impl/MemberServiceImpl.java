package ie.tom.mediaserver.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import ie.tom.mediaserver.dao.LoanDao;
import ie.tom.mediaserver.dao.MemberDao;
import ie.tom.mediaserver.entity.Loan;
import ie.tom.mediaserver.entity.Member;
import ie.tom.mediaserver.service.MemberService;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MemberServiceImpl implements MemberService {
	private MemberDao memberDao;
	private LoanDao loanDao;
	
	public MemberServiceImpl(MemberDao memberDao, LoanDao loanDao) {
		this.memberDao = memberDao;
		this.loanDao = loanDao;
	}
	@Override
	public void add(Member member) {
		memberDao.addMember(member);
	}
	@Override
	public void update(Member member) {
		memberDao.updateMember(member);
	}
	@Override
	public void save(Member member) {
		memberDao.saveMember(member);
	}
	@Override
	public void delete(Member member) {
		memberDao.deleteMember(member);
	}
	@Override
	public Member findMemberById(int member_id) {
		return memberDao.findById(member_id);
	}
	@Override
	public List<Member> findAllMembers() {
		return memberDao.findAll();
	}
	@Override
	public List<Member> findAllOverdueMembers() {
		// get all members
		List<Member> members = memberDao.findAll();
		List<Member> overdueMembers = new ArrayList<Member>();
		ListIterator<Member> memberList = members.listIterator();
		
		// get all loans
		List<Loan> loans = loanDao.findAll();
		
		// cycle through all members
		while(memberList.hasNext()) {
			Member m = memberList.next();			
			ListIterator<Loan> loanList = loans.listIterator();
			// cycle through all loans
			while(loanList.hasNext()) {
				Loan l = loanList.next();
				// check is loan belongs to member
				if(l.getMember_id() == m.getMember_id()) {
					/*
					 * get current date and time
					 * compare to loan date and time
					 * 1 day / 24hours / 3 hours etc.
					 */
					
					// check if loan is overdue
					if(1 > 0) {
						overdueMembers.add(memberDao.findById(m.getMember_id()));
					}
				}
			}
		}
		return overdueMembers;
	}
}
