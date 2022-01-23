package com.gamedoora.model.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "studio_assets")
public class GdStudioAsset implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "studio_assets", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "studio_id", table = "studio_assets", nullable = false)
    private int studioId;
    @Basic
    @Column(name = "uid", table = "studio_assets")
    private String uid;
    @Basic
    @Column(name = "name", table = "studio_assets")
    private String name;
    @Lob
    @Basic
    @Column(name = "content", table = "studio_assets", length = 65535)
    private String content;
    @Basic
    @Column(name = "version", table = "studio_assets")
    private Integer version;
    @Basic(optional = false)
    @Column(name = "asset_type", table = "studio_assets", nullable = false)
    private short assetType;
    @Basic
    @Column(name = "parent_id", table = "studio_assets")
    private Integer parentId;
    @Basic(optional = false)
    @Column(name = "user_id", table = "studio_assets", nullable = false)
    private int userId;
    @Basic
    @Column(name = "bucket_name", table = "studio_assets", length = 512)
    private String bucketName;
    @Basic
    @Column(name = "is_published", table = "studio_assets")
    private Short isPublished;
    @Basic
    @Column(name = "is_uploaded", table = "studio_assets")
    private Short isUploaded;
    @Basic
    @Column(name = "is_uploading", table = "studio_assets")
    private Short isUploading;
    @Basic
    @Column(name = "is_deleted", table = "studio_assets")
    private Short isDeleted;
    @Basic
    @Column(name = "asset_file_size", table = "studio_assets")
    private Integer assetFileSize;
    @Basic
    @Column(name = "asset_file_content_type", table = "studio_assets", length = 128)
    private String assetFileContentType;
    @Basic
    @Column(name = "asset_file_name", table = "studio_assets", length = 64)
    private String assetFileName;
    @Basic
    @Column(name = "asset_file_url", table = "studio_assets", length = 1024)
    private String assetFileUrl;
    @Basic
    @Column(name = "asset_file_updated_at", table = "studio_assets")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assetFileUpdatedAt;
    @Basic
    @Column(name = "script_locked_by", table = "studio_assets")
    private Integer scriptLockedBy;
    @Basic
    @Column(name = "script_locked_at", table = "studio_assets")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scriptLockedAt;
    @Basic(optional = false)
    @Column(name = "created_at", table = "studio_assets", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "studio_assets", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany
    private List<GdStudioStoryAsset> studioStoryAssets;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStudioId() {
        return studioId;
    }

    public void setStudioId(int studioId) {
        this.studioId = studioId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public short getAssetType() {
        return assetType;
    }

    public void setAssetType(short assetType) {
        this.assetType = assetType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Short getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Short isPublished) {
        this.isPublished = isPublished;
    }

    public Short getIsUploaded() {
        return isUploaded;
    }

    public void setIsUploaded(Short isUploaded) {
        this.isUploaded = isUploaded;
    }

    public Short getIsUploading() {
        return isUploading;
    }

    public void setIsUploading(Short isUploading) {
        this.isUploading = isUploading;
    }

    public Short getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getAssetFileSize() {
        return assetFileSize;
    }

    public void setAssetFileSize(Integer assetFileSize) {
        this.assetFileSize = assetFileSize;
    }

    public String getAssetFileContentType() {
        return assetFileContentType;
    }

    public void setAssetFileContentType(String assetFileContentType) {
        this.assetFileContentType = assetFileContentType;
    }

    public String getAssetFileName() {
        return assetFileName;
    }

    public void setAssetFileName(String assetFileName) {
        this.assetFileName = assetFileName;
    }

    public String getAssetFileUrl() {
        return assetFileUrl;
    }

    public void setAssetFileUrl(String assetFileUrl) {
        this.assetFileUrl = assetFileUrl;
    }

    public Date getAssetFileUpdatedAt() {
        return assetFileUpdatedAt;
    }

    public void setAssetFileUpdatedAt(Date assetFileUpdatedAt) {
        this.assetFileUpdatedAt = assetFileUpdatedAt;
    }

    public Integer getScriptLockedBy() {
        return scriptLockedBy;
    }

    public void setScriptLockedBy(Integer scriptLockedBy) {
        this.scriptLockedBy = scriptLockedBy;
    }

    public Date getScriptLockedAt() {
        return scriptLockedAt;
    }

    public void setScriptLockedAt(Date scriptLockedAt) {
        this.scriptLockedAt = scriptLockedAt;
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

    public List<GdStudioStoryAsset> getStudioStoryAssets() {
        if (studioStoryAssets == null) {
            studioStoryAssets = new ArrayList<>();
        }
        return studioStoryAssets;
    }

    public void setStudioStoryAssets(List<GdStudioStoryAsset> studioStoryAssets) {
        this.studioStoryAssets = studioStoryAssets;
    }

    public void addStudioStoryAsset(GdStudioStoryAsset studioStoryAsset) {
        getStudioStoryAssets().add(studioStoryAsset);
    }

    public void removeStudioStoryAsset(GdStudioStoryAsset studioStoryAsset) {
        getStudioStoryAssets().remove(studioStoryAsset);
    }

}