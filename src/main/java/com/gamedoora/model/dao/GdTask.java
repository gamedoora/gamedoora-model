package com.gamedoora.model.dao;

import java.io.Serializable;
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
@Table(name = "tasks")
public class GdTask implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "tasks", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "story_id", table = "tasks", nullable = false)
    private int storyId;
    @Lob
    @Basic
    @Column(name = "description", table = "tasks", length = 65535)
    private String description;
    @Basic(optional = false)
    @Column(name = "is_done", table = "tasks", nullable = false)
    private short isDone;
    @Basic(optional = false)
    @Column(name = "created_at", table = "tasks", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "tasks", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getIsDone() {
        return isDone;
    }

    public void setIsDone(short isDone) {
        this.isDone = isDone;
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