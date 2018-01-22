package org.example.news.sns.common.entity;

import org.example.news.base.common.entity.BaseEntity;

/**
 * 用户关注表，存谁关注了谁
 *
 * @author lh
 * @date 2018/1/22
 * @since
 */
public class SnsFollow extends BaseEntity{

    private Long userId;
    private Long targetUserId;

}
