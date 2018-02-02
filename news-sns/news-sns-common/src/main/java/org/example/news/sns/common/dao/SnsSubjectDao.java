package org.example.news.sns.common.dao;


import org.example.news.sns.common.entity.SnsSubject;

import java.util.List;

/**
 * @Author
 * @Date
 */
public interface SnsSubjectDao {

    Integer saveSubject(SnsSubject subject);

    List<SnsSubject> listSubjet();

    List<SnsSubject> listSubjectByForumId(Long forumId);

    Integer updateSubject(SnsSubject subject);

    void deleteSubjectById(Long subjectId);
}
