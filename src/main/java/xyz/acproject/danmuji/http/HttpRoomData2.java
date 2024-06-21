package xyz.acproject.danmuji.http;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.acproject.danmuji.conf.PublicDataConf;
import xyz.acproject.danmuji.entity.room_data.RoomInfo2;
import xyz.acproject.danmuji.tools.CurrencyTools;
import xyz.acproject.danmuji.utils.OkHttp3Utils;

import java.util.HashMap;
import java.util.Map;

public class HttpRoomData2 {

    private static Logger LOGGER = LogManager.getLogger(HttpRoomData2.class);

    public static RoomInfo2 getRoomInfo() {
        String data = null;
        JSONObject jsonObject = null;
        JSONArray jsonArray = null;
        RoomInfo2 roomInfo2 = new RoomInfo2();
        Map<String, String> headers = null;
        headers = new HashMap<>(4);
        headers.put("user-agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36");
        headers.put("referer", "https://live.bilibili.com/" + CurrencyTools.parseRoomId());
        if (StringUtils.isNotBlank(PublicDataConf.USERCOOKIE)) {
            headers.put("cookie", PublicDataConf.USERCOOKIE);
        }
        try {
            data = OkHttp3Utils.getHttp3Utils()
                    .httpGet("https://api.live.bilibili.com/room/v1/Room/get_info?room_id=" + PublicDataConf.ROOMID, headers, null)
                    .body().string();
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            LOGGER.error(e);
            data = null;
        }
        if (data == null) {
            return roomInfo2;
        }
        jsonObject = JSONObject.parseObject(data);
        short code = jsonObject.getShort("code");
        if (code == 0) {
            JSONObject jo = jsonObject.getJSONObject("data");
            return jo.toJavaObject(RoomInfo2.class);
        }
        return roomInfo2;
    }

}
