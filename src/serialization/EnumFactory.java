package serialization;

import attributes.*;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.apache.commons.lang3.ClassUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class EnumFactory implements TypeAdapterFactory {


    private static final Map<String,SerializedEnum> idToConstants;

    static {
        SerializedEnum[][] enums = new SerializedEnum[][]{
                Tool.values(), Ability.values(), Armor.values(), Language.values(), MiscAttributes.values(), SavingThrow.values(), Skill.values(),
                Weapon.values()
        };

        idToConstants = new HashMap<>();
        for(int i = 0; i < enums.length; i++) {
            for(int j = 0; j < enums[i].length; j++) {
                idToConstants.put(enums[i][j].getID(),enums[i][j]);
            }
        }
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Class<T> rawType = (Class<T>) type.getRawType();
        if(!ClassUtils.getAllInterfaces(rawType).contains(SerializedEnum.class)) {
            return null;
        }

        return new TypeAdapter<T>() {
            public void write(JsonWriter out, T value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(((SerializedEnum) value).getID());
                }
            }

            public T read(JsonReader reader) throws IOException {
                if (reader.peek() == JsonToken.NULL) {
                    reader.nextNull();
                    return null;
                } else {
                    return (T) idToConstants.get(reader.nextString());
                }
            }
        };
    }

    private String toLowercase(Object o) {
        return o.toString().toLowerCase(Locale.US);
    }
}
