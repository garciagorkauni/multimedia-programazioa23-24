package eus.urko.recyclerviewfragments;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BooksRepository {

    BooksDB.BooksDAO booksDAO;
    Executor executor = Executors.newSingleThreadExecutor();

    BooksRepository(Application application){
        booksDAO = BooksDB.obtainInstance(application).getBooksDAO();
    }
    LiveData<List<Book>> get(){
        return booksDAO.getBooks();
    }

    void insert(Book book){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                booksDAO.insert(book);
            }
        });
    }

    void delete(Book book) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                booksDAO.delete(book);
            }
        });
    }

    public void update(Book book) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                booksDAO.update(book);
            }
        });
    }

}