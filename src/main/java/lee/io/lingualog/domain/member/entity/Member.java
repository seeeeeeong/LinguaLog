package lee.io.lingualog.domain.member.entity;

import jakarta.persistence.*;
import lee.io.lingualog.domain.member.enums.SocialType;
import lee.io.lingualog.global.entity.BaseTimeEntity;
import lombok.*;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String socialId;
    private String email;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    public static Member of(
            final String socialId,
            final String email,
            final SocialType socialType
    ) {
        return Member.builder()
                .socialId(socialId)
                .email(email)
                .socialType(socialType)
                .build();
    }

}
