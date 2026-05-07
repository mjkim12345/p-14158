package org.example.p141581.domain.member.member.service;

import lombok.RequiredArgsConstructor;
import org.example.p141581.domain.member.member.entity.Member;
import org.example.p141581.domain.member.member.repository.MemberRepository;
import org.example.p141581.domain.post.post.entity.Post;
import org.example.p141581.domain.post.post.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public long count() {
        return memberRepository.count();
    }

    public Member join(String username, String password, String nickname) {
        return memberRepository.save(
                new Member(username, password, nickname)
        );
    }
}
