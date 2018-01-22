package org.example.news.sns.common.entity;

import org.example.news.base.common.entity.BaseEntity;

/**
 * 所有主题帖的评论，回复
 *@author lh
 *@date 2018/1/22
 *@since
 */
public class SnsComment extends BaseEntity {

    private Long commentId;
    private Long parentId;
    private String content;
    private Integer numberOfComent;
    private Integer numberOfLikes;

}
