package eus.urko.recyclerviewfragments;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Book {
        @PrimaryKey(autoGenerate = true)
        int id;
        String tittle;
        String author;
        String description;
        int image;

        public Book(int image, String tittle, String author, String description) {
            this.tittle = tittle;
            this.author = author;
            this.description = description;
            this.image=image;
    }
}
