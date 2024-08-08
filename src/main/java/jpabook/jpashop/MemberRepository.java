package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member memeber) {
        em.persist(memeber);
        return memeber.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
