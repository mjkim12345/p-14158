package org.example.p141581.domain.member.member.repository;

import org.example.p141581.domain.member.member.entity.Member;
import org.example.p141581.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
