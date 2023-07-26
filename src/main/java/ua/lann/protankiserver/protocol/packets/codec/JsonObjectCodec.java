package ua.lann.protankiserver.protocol.packets.codec;

import com.google.gson.JsonObject;
import io.netty.buffer.ByteBuf;
import ua.lann.protankiserver.protocol.packets.CodecRegistry;
import ua.lann.protankiserver.util.JsonUtils;

public class JsonObjectCodec implements ICodec<JsonObject>  {
    @Override
    public void encode(ByteBuf buf, JsonObject data) {
        String raw = JsonUtils.toString(data);
        CodecRegistry.getCodec(String.class).encode(buf, raw);
    }

    @Override
    public JsonObject decode(ByteBuf data) {
        return null;
    }
}
