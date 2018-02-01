package org.example.news.sns.common.dao.impl;

import org.example.news.sns.common.dao.SnsSubjectDao;
import org.example.news.sns.common.dao.impl.mapper.SnsSubjectMapper;
import org.example.news.sns.common.entity.SnsSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SnsSubjectDaoImpl implements SnsSubjectDao {
    @Autowired
    private SnsSubjectMapper subjectMapper;

    @Override
    public Integer saveSubject(SnsSubject subject) {
        return subjectMapper.saveSubject(subject);
    }

    @Override
    public List<SnsSubject> listSubjet() {
        return null;
    }

    @Override
    public List<SnsSubject> listSubjectByForumId(Long forumId) {
        return subjectMapper.listSubjectByForumId(forumId);
    }

    @Override
    public Integer updateSubject(SnsSubject subject) {
        return null;
    }

    @Override
    public void deleteSubjectById(Long subjectId) {

    }
}
