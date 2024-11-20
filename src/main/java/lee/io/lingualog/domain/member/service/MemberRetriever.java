package lee.io.lingualog.domain.member.service;

import lee.io.lingualog.domain.member.entity.Member;
import lee.io.lingualog.domain.member.enums.Provider;
import lee.io.lingualog.domain.member.repository.MemberRepository;
import lee.io.lingualog.global.exception.ErrorCode;
import lee.io.lingualog.global.exception.notfound.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberRetriever {

    private final MemberRepository memberRepository;

    public Member getByProviderUid(String providerUid, Provider provider) {
        return memberRepository.findByProviderUidAndProvider(providerUid, provider).orElse(null);
    }

    public Member getByRefreshToken(String refreshToken) {
        return memberRepository.findByRefreshToken(refreshToken).orElseThrow(() -> new EntityNotFoundException(ErrorCode.MEMBER_NOT_FOUND));
    }
}
