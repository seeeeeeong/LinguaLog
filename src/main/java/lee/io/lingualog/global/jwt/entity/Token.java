package lee.io.lingualog.global.jwt.entity;

import jakarta.persistence.*;
import lee.io.lingualog.global.entity.BaseTimeEntity;
import lombok.*;

@Getter
@Entity
@Builder
@AllArgsConstructor
public class Token extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    @Column(nullable = false)
    private String refreshToken;

    public static Token of(
            final Long memberId,
            final String refreshToken
    ) {
        return Token.builder()
                .memberId(memberId)
                .refreshToken(refreshToken)
                .build();
    }
}
