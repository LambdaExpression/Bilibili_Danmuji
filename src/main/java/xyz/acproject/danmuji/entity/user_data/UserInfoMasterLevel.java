package xyz.acproject.danmuji.entity.user_data;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserInfoMasterLevel implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer level;
    private Long color;
    private List<Long> current;
    private List<Long> next;
}
