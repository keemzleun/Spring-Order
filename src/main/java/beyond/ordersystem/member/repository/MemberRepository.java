package beyond.ordersystem.member.repository;

import beyond.ordersystem.member.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Page<Member> findAll (Pageable pageable);
    Optional<Member> findByEmail(String email);
}
