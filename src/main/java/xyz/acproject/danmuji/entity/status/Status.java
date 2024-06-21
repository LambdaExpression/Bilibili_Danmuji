package xyz.acproject.danmuji.entity.status;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
@Builder
public class Status implements Serializable {

    private static final long serialVersionUID = -699907643016533390L;

    //房间号
    public Long roomId;
    //主播粉丝数
    public Long fansNum;
    //主播名称
    public String anchorName;
    //房间人气
    public Long roomPopularity;
    //房间观看人数（历史）
    public Long roomWatcher;
    //点赞数量
    public Long roomLike;
    //观看人数（接口）
    public Long onlineNum;
    //直播状态 0不直播 1直播 2轮播
    public Short liveStatus;
    //时间戳
    private Long timestamp;

}
