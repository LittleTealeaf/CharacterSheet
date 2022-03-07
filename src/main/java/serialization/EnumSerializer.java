package serialization;

import attributes.*;
import com.google.gson.*;

import java.lang.reflect.Type;

public class EnumSerializer implements JsonSerializer<SerializedEnum>, JsonDeserializer<SerializedEnum> {

    private static SerializedEnum[][] enums;

    static {
        enums = new SerializedEnum[][]{
                Ability.values(), Armor.values(), Language.values(), MiscAttributes.values(), SavingThrow.values(), Skill.values(), Weapon.values()
        };
    }

    @Override
    public SerializedEnum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
    throws JsonParseException {
        String string = jsonElement.getAsString();
        for (SerializedEnum[] enumList : enums) {
            for (SerializedEnum en : enumList) {
                if (en.getID().equals(string)) {
                    return en;
                }
            }
        }
        return null;
    }

    @Override
    public JsonElement serialize(SerializedEnum serializedEnum, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(serializedEnum.getID());
    }
}
