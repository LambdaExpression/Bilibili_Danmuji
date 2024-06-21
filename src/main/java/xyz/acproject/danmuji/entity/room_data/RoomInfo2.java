package xyz.acproject.danmuji.entity.room_data;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RoomInfo2 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主播 ID
     */
    private Integer uid;
    /**
     * 直播间 ID
     */
    private Integer room_id;
    /**
     * 短 ID
     */
    private Integer short_id;
    /**
     * 关注数
     */
    private Integer attention;
    /**
     * 在线人数
     */
    private Long online;
    /**
     * 是否竖屏
     */
    private Boolean is_portrait;
    /**
     * 描述
     */
    private String description;
    /**
     * 直播状态
     */
    private Integer live_status;
    /**
     * 区域 ID
     */
    private Integer area_id;
    /**
     * 父区域 ID
     */
    private Integer parent_area_id;
    /**
     * 父区域名称
     */
    private String parent_area_name;
    /**
     * 旧区域 ID
     */
    private Integer old_area_id;
    /**
     * 背景
     */
    private String background;
    /**
     * 标题
     */
    private String title;
    /**
     * 用户封面
     */
    private String user_cover;
    /**
     * 关键帧
     */
    private String keyframe;
    /**
     * 是否严格房间
     */
    private Boolean is_strict_room;
    /**
     * 直播时间
     */
    private String live_time;
    /**
     * 标签
     */
    private List<String> tags;
    /**
     * 是否为主播
     */
    private Boolean is_anchor;

    /**
     * DTO类：NewPendantsDTO
     */
    @Data
    public class NewPendantsDTO implements Serializable {

        private static final long serialVersionUID = 1L;
        /**
         * 框架
         */
        private FrameDTO frame;
        private FrameDTO mobile_frame;
        /**
         * 徽章
         */
        private BadgeDTO badge;
        private BadgeDTO mobile_badge;
    }

    /**
     * DTO类：FrameDTO
     */
    @Data
    public class FrameDTO implements Serializable {

        private static final long serialVersionUID = 1L;
        /**
         * 框架名称
         */
        private String name;
        private String value;
        private Integer position;
        private String desc;
        private Integer area;
        private Integer area_old;
        private String bg_color;
        private String bg_pic;
        private Boolean use_old_area;
    }

    /**
     * DTO类：BadgeDTO
     */
    @Data
    public class BadgeDTO implements Serializable {

        private static final long serialVersionUID = 1L;
        /**
         * 徽章名称
         */
        private String name;
        private Integer position;
        private String value;
        private String desc;
    }

    /**
     * DTO类：StudioInfoDTO
     */
    @Data
    public class StudioInfoDTO implements Serializable {

        private static final long serialVersionUID = 1L;
        /**
         * 状态
         */
        private Integer status;
        /**
         * 主持人列表
         */
        private List<String> master_list;
    }

}
