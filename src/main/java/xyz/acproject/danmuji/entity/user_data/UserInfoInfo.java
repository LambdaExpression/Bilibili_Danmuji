package xyz.acproject.danmuji.entity.user_data;

import lombok.Data;

import java.io.Serializable;

/**
 * 主播信息
 */
@Data
public class UserInfoInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主播mid
     */
    private Long uid;
    /**
     * 主播用户名
     */
    private String uname;
    /**
     * 主播头像url
     */
    private String face;
    /**
     * 认证信息
     */
    private UserInfoOfficialVerify official_verify;
    /**
     * 主播性别 -1：保密 0：女 1：男
     */
    private Integer gender;
}
