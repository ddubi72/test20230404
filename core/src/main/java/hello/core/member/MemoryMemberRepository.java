package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    //conco 해쉬맵??? 동시성 이슈 때문에 현업에서는 그걸 써야 한다!
    @Override
    public void save(Member member){
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId){
        return store.get(memberId);
    }
}
