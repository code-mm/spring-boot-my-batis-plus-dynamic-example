package com.my.app.mysql.ms_b.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ms
 * @since 2023-11-23
 */
@TableName("m_test_b")
public class MTestB implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    private String username;

    public Long getUserId() {
        return userId;
    }

    public MTestB setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MTestB setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        return "MTestB{" +
            "userId = " + userId +
            ", username = " + username +
        "}";
    }
}
