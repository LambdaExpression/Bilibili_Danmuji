package xyz.acproject.danmuji.entity.online_rank_count;

import lombok.Data;
import xyz.acproject.danmuji.entity.base.BaseEntity;

import java.util.Date;

@Data
public class OnlineRankCount extends BaseEntity {

    private static final long serialVersionUID = -699907643016533390L;

    /**
     * 在线排名人数
     */
    private Integer count;

    /**
     * 统计排名时间
     */
    private Long timestamp;

}
