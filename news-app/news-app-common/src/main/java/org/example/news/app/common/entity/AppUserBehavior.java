package org.example.news.app.common.entity;

import org.example.news.base.common.entity.BaseEntity;

public class AppUserBehavior extends BaseEntity {

    private Long userId;
    private Long contentId;
    /**
     * 用户行为类型：
     * 0 点赞
     * 1 喜欢
     * 2 不感兴趣
     * 3 看过
     */
    private String type;


}
