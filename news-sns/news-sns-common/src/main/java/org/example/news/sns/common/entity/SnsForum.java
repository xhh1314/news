package org.example.news.sns.common.entity;

import org.example.news.base.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 版块，各个主题帖属于哪个版块
 *
 * @author lh
 * @date 2018/1/22
 * @since
 */
@Entity(name = "sns_forum")
public class SnsForum extends BaseEntity {

    private Long forumId;
    private String name;
    private String describle;

    @Id
    @Column(name = "forum_id")
    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }
}
