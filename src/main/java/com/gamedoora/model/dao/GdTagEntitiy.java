package com.gamedoora.model.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tag_entities")
public class GdTagEntitiy implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "tag_entities", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tag_id", table = "tag_entities", nullable = false)
    private int tagId;
    @Basic(optional = false)
    @Column(name = "entity_id", table = "tag_entities", nullable = false)
    private int entityId;
    @Basic(optional = false)
    @Column(name = "entity_type", table = "tag_entities", nullable = false)
    private String entityType;
    @Basic(optional = false)
    @Column(name = "created_at", table = "tag_entities", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "tag_entities", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
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