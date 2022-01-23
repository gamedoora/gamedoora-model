package com.gamedoora.model.dao;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comments")
public class GdComment {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "comments", nullable = false)
    private Integer id;
    @Lob
    @Basic(optional = false)
    @Column(name = "context", table = "comments", nullable = false, length = 65535)
    private String context;
    @Basic(optional = false)
    @Column(name = "commentable_id", table = "comments", nullable = false)
    private int commentableId;
    @Basic(optional = false)
    @Column(name = "commentable_type", table = "comments", nullable = false)
    private String commentableType;
    @Basic(optional = false)
    @Column(name = "user_id", table = "comments", nullable = false)
    private int userId;
    @Basic
    @Column(name = "parent_id", table = "comments")
    private Integer parentId;
    @Basic(optional = false)
    @Column(name = "created_at", table = "comments", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "comments", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getCommentableId() {
        return commentableId;
    }

    public void setCommentableId(int commentableId) {
        this.commentableId = commentableId;
    }

    public String getCommentableType() {
        return commentableType;
    }

    public void setCommentableType(String commentableType) {
        this.commentableType = commentableType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}