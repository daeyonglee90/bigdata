package com.pjt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pjt.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

	@Query("   select *"
			+ "  from Member"
			+ " where id=:id and pw=:pw")
	public void findByIdAndPw(@Param("id")String id, @Param("pw")String pw);
	
}
