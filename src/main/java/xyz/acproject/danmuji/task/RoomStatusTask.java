package xyz.acproject.danmuji.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import xyz.acproject.danmuji.conf.PublicDataConf;
import xyz.acproject.danmuji.controller.DanmuWebsocket;
import xyz.acproject.danmuji.entity.base.WsPackage;
import xyz.acproject.danmuji.entity.room_data.RoomInfo2;
import xyz.acproject.danmuji.entity.status.Status;
import xyz.acproject.danmuji.entity.user_data.UserInfo;
import xyz.acproject.danmuji.entity.user_data.UserInfoInfo;
import xyz.acproject.danmuji.http.HttpRoomData2;
import xyz.acproject.danmuji.http.HttpUserData2;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Objects;

@Component
public class RoomStatusTask {

    @Resource
    private DanmuWebsocket danmuWebsocket;


    @Scheduled(cron = "0 * * * * ?")
    public void syncRoomStatus() throws IOException {
        if (Objects.isNull(PublicDataConf.ROOMID) || PublicDataConf.ROOMID < 0) {
            return;
        }
        if (PublicDataConf.lIVE_STATUS == 0) {
            PublicDataConf.ROOM_LIKE = 0L;
            PublicDataConf.ROOM_WATCHER = 0L;
        }
        RoomInfo2 roomInfo = HttpRoomData2.getRoomInfo();

        Status status = Status.builder()
                .roomId(PublicDataConf.ROOMID)
                .fansNum(PublicDataConf.FANSNUM)
                .anchorName(PublicDataConf.ANCHOR_NAME)
                .roomPopularity(PublicDataConf.ROOM_POPULARITY)
                .roomWatcher(PublicDataConf.ROOM_WATCHER)
                .roomLike(PublicDataConf.ROOM_LIKE)
                .onlineNum(roomInfo.getOnline())
                .liveStatus(PublicDataConf.lIVE_STATUS)
                .timestamp(System.currentTimeMillis() / 1000)
                .build();
        danmuWebsocket.sendMessage(WsPackage.toJson("status", (short) 0, status));
    }

    @Scheduled(cron = "0 0 * * * ?")
    public void syncAUserInfo() throws IOException {
        if (Objects.isNull(PublicDataConf.AUID) || PublicDataConf.AUID < 0) {
            return;
        }
        UserInfo aUserInfo = HttpUserData2.getAUserInfo();
        if (Objects.isNull(aUserInfo)) {
            return;
        }
        UserInfoInfo info = aUserInfo.getInfo();
        if (Objects.isNull(info) || Objects.isNull(info.getUname())) {
            return;
        }
        PublicDataConf.ANCHOR_NAME = info.getUname();
    }

}
