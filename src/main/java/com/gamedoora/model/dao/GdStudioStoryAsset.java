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
@Table(name = "studio_story_assets")
public class GdStudioStoryAsset implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "studio_story_assets", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "story_id", table = "studio_story_assets")
    private Integer storyId;
    @Basic
    @Column(name = "studio_asset_id", table = "studio_story_assets")
    private Integer studioAssetId;
    @Basic(optional = false)
    @Column(name = "created_at", table = "studio_story_assets", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "studio_story_assets", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoryId() {
        return storyId;
    }

    public void setStoryId(Integer storyId) {
        this.storyId = storyId;
    }

    public Integer getStudioAssetId() {
        return studioAssetId;
    }

    public void setStudioAssetId(Integer studioAssetId) {
        this.studioAssetId = studioAssetId;
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