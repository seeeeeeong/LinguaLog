package lee.io.lingualog.global.jwt.service;

import lee.io.lingualog.domain.member.entity.Member;
import lee.io.lingualog.global.jwt.JwtTokenProvider;
import lee.io.lingualog.global.jwt.dto.TokenDto;
import lee.io.lingualog.global.jwt.entity.Token;
import lee.io.lingualog.global.jwt.repository.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TokenService {

    private final JwtTokenProvider jwtTokenProvider;

    private final TokenRepository tokenRepository;

    @Transactional
    public void saveRefreshToken(Long memberId, String refreshToken) {
        tokenRepository.save(Token.of(memberId, refreshToken));
    }

    @Transactional
    public TokenDto reIssueToken(Member member) {
        TokenDto tokenDto = jwtTokenProvider.createToken(member);
        tokenRepository.deleteByMemberId(member.getId());

        Token token = Token.of(member.getId(), tokenDto.getRefreshToken());
        tokenRepository.saveAndFlush(token);
        return tokenDto;
    }
}
