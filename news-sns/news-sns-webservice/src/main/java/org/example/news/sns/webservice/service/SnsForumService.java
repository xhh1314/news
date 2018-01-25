package org.example.news.sns.webservice.service;

import org.example.news.sns.common.dao.SnsForumDao;
import org.example.news.sns.common.entity.SnsForum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnsForumService {
    @Autowired
    private SnsForumDao snsForumDao;

    public SnsForum saveForum(SnsForum snsForum) {
        if (snsForum == null || snsForum.getForumId() == null)
            return null;
        return snsForumDao.saveForum(snsForum);
    }

    public SnsForum getForumById(Long id) {
        if (id == null)
            return null;
        return snsForumDao.getForumById(id);
    }


}
