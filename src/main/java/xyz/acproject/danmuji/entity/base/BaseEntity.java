package xyz.acproject.danmuji.entity.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {

    //房间id
    private Long roomId;
    //主播名称
    public String anchorName;

}
