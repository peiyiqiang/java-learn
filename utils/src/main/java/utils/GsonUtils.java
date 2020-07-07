package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.lang.reflect.Type;

/**
 * Created by peiyiqiang on 2020/6/29.
 * Description: 基于Gson的序列化工具
 */
public class GsonUtils {

    private static final Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    public static JsonObject parseJson(String jsonStr) {
        return JsonParser.parseString(jsonStr).getAsJsonObject();
    }

    public static <T> T parseJson(String jsonStr, Class<T> clazz) {
        return GSON.fromJson(jsonStr, clazz);
    }

    /**
     * Map<String, JsonObject> jsonMap = GsonUtils.parseJson(jsonStr, new TypeToken<Map<String, JsonObject>>() {
     * }.getType());
     */
    public static <T> T parseJson(String jsonStr, Type type) {
        return GSON.fromJson(jsonStr, type);
    }

    public static String toJson(Object jsonObject) {
        return GSON.toJson(jsonObject);
    }

}
