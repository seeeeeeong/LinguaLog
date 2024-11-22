package lee.io.lingualog.domain.member.service;

import lee.io.lingualog.domain.member.entity.Member;
import lee.io.lingualog.domain.member.enums.Provider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberCreator memberCreator;
    private final MemberRetriever memberRetriever;

    public Member createMember(String email, String providerUid, Provider provider) {
        return memberCreator.createMember(email, providerUid, provider);
    }

    public Member getByProviderUid(String providerUid, Provider provider) {
        return memberRetriever.getByProviderUid(providerUid, provider);
    }

    public Member getByRefreshToken(String refreshToken) {
        return memberRetriever.getByRefreshToken(refreshToken);
    }

}
