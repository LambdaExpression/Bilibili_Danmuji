package xyz.acproject.danmuji.entity.user_data;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoRoomNews implements Serializable {

    private static final long serialVersionUID = 1L;

    private String content;
    private String ctime;
    private String ctime_text;
}
