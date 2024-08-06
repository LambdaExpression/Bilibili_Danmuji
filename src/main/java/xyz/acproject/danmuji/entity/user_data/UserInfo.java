package xyz.acproject.danmuji.entity.user_data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主播信息
     */
    private UserInfoInfo info;
    /**
     * 经验等级
     */
    private UserInfoExp exp;
    /**
     * 主播粉丝数
     */
    private Integer follower_num;
    /**
     * 直播间id（短号）
     */
    private Long room_id;
    /**
     * 粉丝勋章名
     */
    private String medal_name;
    /**
     * 主播荣誉数
     */
    private Integer glory_count;
    /**
     * 直播间头像框url
     */
    private String pendant;
    private Integer link_group_num;
    /**
     * 主播公告
     */
    private UserInfoRoomNews room_news;


}


