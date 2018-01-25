package org.example.news.sns.common.dao.impl.jpa;

import org.example.news.sns.common.entity.SnsForum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnsForumJPA extends JpaRepository<SnsForum,Long> {

    SnsForum getSnsForumByForumId(Long id);
}
