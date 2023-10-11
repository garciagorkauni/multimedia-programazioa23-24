package eus.urko.recyclerviewfragments;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.Update;

import java.util.List;

@Database(entities = { Book.class }, version = 1, exportSchema = false)
public abstract class BooksDB extends RoomDatabase {

    private static volatile BooksDB INSTANCE;
    public abstract BooksDAO getBooksDAO();

    static BooksDB obtainInstance(final Context context) {
        if (INSTANCE == null) {
            synchronized (BooksDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context,
                                    BooksDB.class, "books.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    @Dao
    interface BooksDAO {
        @Query("SELECT * FROM Book")
        LiveData<List<Book>> getBooks();

        @Insert
        void insert(Book book);

        @Update
        void update(Book book);

        @Delete
        void delete(Book book);
    }
}
