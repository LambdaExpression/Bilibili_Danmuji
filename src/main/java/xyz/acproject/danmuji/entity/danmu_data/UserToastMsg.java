package xyz.acproject.danmuji.entity.danmu_data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserToastMsg implements Serializable {

    private static final long serialVersionUID = 1162255349476806998L;

    /**
     * 是否显示
     */
    private String	anchor_show;
    /**
     * 颜色
     */
    private String	color;
    private Integer	dmscore;
    private Integer	effect_id;
    private Long	end_time;
    private Integer	face_effect_id;
    /**
     * 礼物id
     */
    private Integer	gift_id;
    private String	group_name;
    private Integer	group_op_type;
    private String	group_role_name;
    /**
     * 大航海等级
     */
    private Integer	guard_level;
    private Integer	is_group;
    private Integer	is_show;
    /**
     * 上舰个数
     */
    private Integer	num;
    private Integer	op_type;
    private String	payflow_id;
    /**
     * 价格
     */
    private Integer	price;
    /**
     * 身份名称
     */
    private String	role_name;
    private Integer	room_effect_id;
    private Integer	room_group_effect_id;
    private Long	start_time;
    private Integer	svga_block;
    /**
     * 庆祝消息正文
     */
    private Integer	target_guard_count;
    private String	toast_msg;
    /**
     * 上舰人UID
     */
    private Long	uid;
    /**
     * 购买身份时间单位
     */
    private String	unit;
    private String	user_show;
    /**
     * 上舰人用户名
     */
    private String	username;

}
