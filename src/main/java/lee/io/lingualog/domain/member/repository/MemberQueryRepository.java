package lee.io.lingualog.domain.member.repository;

import lee.io.lingualog.domain.member.entity.Member;
import lee.io.lingualog.domain.member.enums.Provider;

import java.util.Optional;

public interface MemberQueryRepository {

    Optional<Member> findByProviderUidAndProvider(String providerUid, Provider provider);

    Optional<Member> findByRefreshToken(String refreshToken);

}
