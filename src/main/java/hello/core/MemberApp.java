package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

	// psvm이라고 치면 자동완성나옴
	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		// new Member(1L, "memberA", Grade.VIP); => 여기서 ctrl+alt+v를 해주면 아래 코드가 알아서 완성된다!
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);

		// memberService.findMember(1L); => 여기서 ctrl+alt+v를 해주면 아래 코드가 알아서 완성된다!
		Member findMember = memberService.findMember(1L);
		System.out.println("new Member " + member.getName());
//		System.out.println("find Member " + findMember.getName());
	}
}
