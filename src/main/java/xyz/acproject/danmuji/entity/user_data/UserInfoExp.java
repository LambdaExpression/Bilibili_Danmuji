package xyz.acproject.danmuji.entity.user_data;

import lombok.Data;

import java.io.Serializable;

/**
 * 经验等级
 */
@Data
public class UserInfoExp implements Serializable {

    private static final long serialVersionUID = 1L;

    private UserInfoMasterLevel master_level;
}
