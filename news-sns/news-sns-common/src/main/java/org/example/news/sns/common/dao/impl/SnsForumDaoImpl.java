package org.example.news.sns.common.dao.impl;

import org.example.news.sns.common.dao.SnsForumDao;
import org.example.news.sns.common.dao.impl.jpa.SnsForumJPA;
import org.example.news.sns.common.entity.SnsForum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SnsForumDaoImpl implements SnsForumDao {

    @Autowired
    private SnsForumJPA forumJPA;

    @Override
    public SnsForum getForumById(Long id) {
        return forumJPA.getSnsForumByForumId(id);
    }

    @Override
    public SnsForum saveForum(SnsForum forum) {
        return forumJPA.save(forum);
    }
}
