package org.example.news.sns.common.dao.impl.mapper;

import org.example.news.sns.common.entity.SnsSubject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SnsSubjectMapper {

    Integer saveSubject(SnsSubject subject);

    SnsSubject getSubjectById(Long subjectId);

    List<SnsSubject> listSubjet();

    List<SnsSubject> listSubjectByForumId(Long forumId);

    Integer updateSubject(SnsSubject subject);

    void deleteSubjectById(Long subjectId);
}
