package xyz.acproject.danmuji.entity.user_data;

import lombok.Data;

import java.io.Serializable;

/**
 *
 */
@Data
public class UserInfoOfficialVerify implements Serializable {

    private Integer type;
    private String desc;
}
