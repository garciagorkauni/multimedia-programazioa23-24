package eus.urko.recyclerviewfragments;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class BooksViewModel extends AndroidViewModel {

    BooksRepository booksRepository;
    MutableLiveData<Book> elementSelected = new MutableLiveData<>();

    public BooksViewModel(@NonNull Application application) {
        super(application);

        booksRepository = new BooksRepository(application);
    }

    void insert(Book book){
        booksRepository.insert(book);
    }

    void delete(Book book){
        booksRepository.delete(book);
    }

    void update(Book book){
        booksRepository.update(book);
    }

    void select(Book book){
        elementSelected.setValue(book);
    }

    MutableLiveData<Book> selected(){
        return elementSelected;
    }

    LiveData<List<Book>> obtain(){
        return booksRepository.get();
    }
}