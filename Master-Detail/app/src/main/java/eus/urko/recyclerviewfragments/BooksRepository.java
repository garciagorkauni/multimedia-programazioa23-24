package eus.urko.recyclerviewfragments;

import java.util.ArrayList;
import java.util.List;

public class BooksRepository {

    List<Book> elements = new ArrayList<>();

    public interface Callback {
        void whenFinish(List<Book> books);
    }
    BooksRepository(){
        elements.add(new Book(R.drawable.defaultbook, "El principito", "Juan Perez", "Un pequeño príncipe viaja de planeta en planeta y descubre lecciones sobre la vida y el amor en su búsqueda de amigos."));
        elements.add(new Book(R.drawable.defaultbook, "Cien años de soledad", "Juan Perez","Una saga familiar que abarca siete generaciones en el pueblo ficticio de Macondo, explorando temas de amor, soledad, magia y decadencia."));
        elements.add(new Book(R.drawable.defaultbook, "1984", "Juan Perez","En un mundo totalitario, Winston Smith lucha por la verdad y la libertad mientras es perseguido por el Partido y su líder, el omnipresente Gran Hermano."));
        elements.add(new Book(R.drawable.defaultbook, "El nombre del viento", "Juan Perez","Kvothe, un talentoso músico y mago, narra su vida desde la infancia hasta su ascenso como leyenda, desvelando secretos y magia en un mundo de fantasía."));
        elements.add(new Book(R.drawable.defaultbook, "Matar a un ruiseñor", "Juan Perez","La historia de Atticus Finch, un abogado que defiende a un hombre negro acusado de violar a una mujer blanca en la segregada Alabama de los años 30."));
        elements.add(new Book(R.drawable.defaultbook, "Los juegos del hambre", "Juan Perez","Katniss Everdeen se convierte en símbolo de resistencia cuando participa en los Juegos del Hambre, una competición mortal impuesta por un gobierno opresivo."));
        elements.add(new Book(R.drawable.defaultbook, "El código Da Vinci", "Juan Perez","Un profesor de simbología y una criptóloga investigan un misterioso asesinato que los lleva a descubrir un secreto antiguo que podría cambiar la historia del cristianismo."));
        elements.add(new Book(R.drawable.defaultbook, "El gran Gatsby", "Juan Perez","La historia del enigmático Jay Gatsby y su obsesión por recuperar un amor del pasado en la decadente Nueva York de los años 20."));
        elements.add(new Book(R.drawable.defaultbook, "Orgullo y prejuicio", "Juan Perez","La novela sigue la vida de Elizabeth Bennet mientras navega por las expectativas sociales y el romance en la Inglaterra del siglo XIX."));
        elements.add(new Book(R.drawable.defaultbook, "Crónica de una muerte anunciada", "Juan Perez","La narrativa de la investigación periodística sobre el asesinato de Santiago Nasar en un pueblo caribeño, donde todos saben lo que va a ocurrir."));
        elements.add(new Book(R.drawable.defaultbook, "La sombra del viento", "Juan Perez","En la Barcelona de posguerra, un joven encuentra un libro misterioso y comienza una búsqueda para descubrir la vida del autor y los secretos que rodean la obra."));
        elements.add(new Book(R.drawable.defaultbook, "Los hombres me explican cosas", "Juan Perez","En este libro de ensayos, Rebecca Solnit aborda el sexismo y la condescendencia hacia las mujeres en la sociedad contemporánea, a través de anécdotas personales y análisis cultural."));
    }
    public List<Book> get() {
        return elements;
    }

    public void insert(Book book, Callback callback) {
        elements.add(book);
        callback.whenFinish(elements);
    }

    public void delete(Book book, Callback callback) {
        elements.remove(book);
        callback.whenFinish(elements);
    }

    public void update(Book book, Callback callback) {
        callback.whenFinish(elements);
    }

}
