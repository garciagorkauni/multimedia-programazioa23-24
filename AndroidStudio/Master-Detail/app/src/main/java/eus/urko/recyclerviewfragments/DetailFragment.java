package eus.urko.recyclerviewfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import eus.urko.recyclerviewfragments.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {

    private FragmentDetailBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentDetailBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BooksViewModel booksViewModel = new ViewModelProvider(requireActivity()).get(BooksViewModel.class);

        booksViewModel.selected().observe(getViewLifecycleOwner(), new Observer<Book>() {
            @Override
            public void onChanged(Book book) {
                binding.title.setText(book.tittle);
                binding.author.setText(book.author);
                binding.description.setText(book.description);
            }
        });
    }
}