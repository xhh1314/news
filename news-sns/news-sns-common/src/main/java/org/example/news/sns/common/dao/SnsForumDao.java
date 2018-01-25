package org.example.news.sns.common.dao;

import org.example.news.sns.common.entity.SnsForum;

public interface SnsForumDao {

    SnsForum getForumById(Long id);

    SnsForum saveForum(SnsForum forum);
}
