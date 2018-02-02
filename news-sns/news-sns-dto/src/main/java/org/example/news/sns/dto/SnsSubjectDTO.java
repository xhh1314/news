package org.example.news.sns.dto;


public class SnsSubjectDTO {
    private Long subjectId;
    private Long forumId;
    private String content;
    private Long userId;
    private Integer numberOfComment;
    private Integer numOfLike;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getNumberOfComment() {
        return numberOfComment;
    }

    public void setNumberOfComment(Integer numberOfComment) {
        this.numberOfComment = numberOfComment;
    }

    public Integer getNumOfLike() {
        return numOfLike;
    }

    public void setNumOfLikes(Integer numOfLike) {
        this.numOfLike = numOfLike;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SnsSubjectDTO{");
        sb.append("subjectId=").append(subjectId);
        sb.append(", forumId=").append(forumId);
        sb.append(", content='").append(content).append('\'');
        sb.append(", userId=").append(userId);
        sb.append(", numberOfComment=").append(numberOfComment);
        sb.append(", numOfLikes=").append(numOfLike);
        sb.append('}');
        return sb.toString();
    }
}
