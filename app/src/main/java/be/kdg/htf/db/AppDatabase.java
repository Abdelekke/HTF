package be.kdg.htf.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import be.kdg.htf.converters.Converters;
import be.kdg.htf.models.Client;

/**
 * Created by Robin on 29/11/2017.
 */

@Database(entities = Client.class, version = 1)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract ClientDao clientDao();
}
