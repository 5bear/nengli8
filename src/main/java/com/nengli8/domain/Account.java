package com.nengli8.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nengli8.constant.ColumnStatus;
import com.nengli8.helper.SecretConverter;
import com.nengli8.util.DateUtil;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by 11369 on 2018/5/19.
 */
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String uuid = UUID.randomUUID().toString().replace("-", "");

    @Column
    private String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Convert(converter = SecretConverter.class)
    private String password;

    @Column
    @Enumerated(value = EnumType.STRING)
    private ColumnStatus status = ColumnStatus.STABLE;

    @CreationTimestamp
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Timestamp createTime = DateUtil.getCurrentTimestamp();

    @UpdateTimestamp
    private Timestamp updateTime = DateUtil.getCurrentTimestamp();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ColumnStatus getStatus() {
        return status;
    }

    public void setStatus(ColumnStatus status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
