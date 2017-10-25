package com.pjt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pjt.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
