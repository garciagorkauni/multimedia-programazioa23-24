package eus.urko.recyclerviewfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eus.urko.recyclerviewfragments.databinding.FragmentNewElementBinding;

public class NewBookFragment extends Fragment {

    private FragmentNewElementBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentNewElementBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BooksViewModel elementosViewModel = new ViewModelProvider(requireActivity()).get(BooksViewModel.class);
        NavController navController = Navigation.findNavController(view);

        binding.newElementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = binding.title.getText().toString();
                String author = binding.author.getText().toString();
                String description = binding.description.getText().toString();

                elementosViewModel.add(new Book(R.drawable.defaultbook,title, author, description));

                navController.popBackStack();
            }
        });
    }
}