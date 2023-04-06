package hello.core.member;

public class MemberServiceImpl implements MemberService{

	private final MemberRepository memberRepository = new MemoryMemberRepository(); //ctrl+shift+enter = 세미콜론까지 자동완성으로 나옴

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}
}
