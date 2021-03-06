package org.example.news.base.common.constant;

/**
 * 用户行为常量
 * 0 点赞
 * 1 喜欢
 * 2 不感兴趣
 * 3 看过
 *
 * @author lh
 * @date 2018/2/2
 * @since
 */
public enum BehaviorEnum {

    likes(0),
    interest(1),
    uninterest(2),
    seen(3);


    private Integer value;

    BehaviorEnum(Integer value) {
        this.value = value;
    }

}
