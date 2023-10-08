package eus.urko.recyclerviewfragments;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class BooksViewModel extends AndroidViewModel {

    BooksRepository booksRepository;

    MutableLiveData<List<Book>> listElementsMutableLiveData = new MutableLiveData<>();
    MutableLiveData<Book> elementSelected = new MutableLiveData<>();

    public BooksViewModel(@NonNull Application application) {
        super(application);

        booksRepository = new BooksRepository();

        listElementsMutableLiveData.setValue(booksRepository.get());
    }


    MutableLiveData<List<Book>> get(){
        return listElementsMutableLiveData;
    }

    void add(Book book){
        booksRepository.insert(book, new BooksRepository.Callback() {
            public void whenFinish(List<Book> books) {
                listElementsMutableLiveData.setValue(books);
            }
        });
    }

    void delete(Book book){
        booksRepository.delete(book, new BooksRepository.Callback() {
            @Override
            public void whenFinish(List<Book> books) {
                listElementsMutableLiveData.setValue(books);
            }
        });
    }

    void update(Book book, float rating){
        booksRepository.update(book, new BooksRepository.Callback() {
            @Override
            public void whenFinish(List<Book> books) {
                listElementsMutableLiveData.setValue(books);
            }
        });
    }

    void select(Book book){
        elementSelected.setValue(book);
    }

    MutableLiveData<Book> selected(){
        return elementSelected;
    }
}
