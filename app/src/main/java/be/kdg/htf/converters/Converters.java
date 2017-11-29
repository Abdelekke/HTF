package be.kdg.htf.converters;

import android.arch.persistence.room.TypeConverter;

import be.kdg.htf.models.RoleType;

/**
 * Created by Robin on 29/11/2017.
 */

public class Converters {
    @TypeConverter
    public static RoleType toRoleType(String role) {
        if (role.toLowerCase().equals("client")) {
            return RoleType.CLIENT;
        } else {
            return RoleType.ADMIN;
        }
    }
}
