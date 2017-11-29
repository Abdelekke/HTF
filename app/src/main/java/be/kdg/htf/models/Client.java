package be.kdg.htf.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Robin on 29/11/2017.
 */

@Entity(tableName = "users")
public class Client {
    @PrimaryKey
    private long id;
    @ColumnInfo(name = "userName")
    private String userName;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "role")
    private RoleType role;


}
