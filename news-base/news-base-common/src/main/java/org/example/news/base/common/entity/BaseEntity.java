package org.example.news.base.common.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class BaseEntity implements Serializable{

    /**
     * 站点id
     */
    protected Integer siteId;
    /**
     *数据状态，默认1，0表示被删除
     */
    protected Short status;
    /**
     * 创建时间
     */
    protected Timestamp createTime;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
