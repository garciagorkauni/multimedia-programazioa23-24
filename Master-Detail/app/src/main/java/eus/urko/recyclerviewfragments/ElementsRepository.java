package eus.urko.recyclerviewfragments;

import java.util.ArrayList;
import java.util.List;

public class ElementsRepository {

    List<Element> elements = new ArrayList<>();

    public interface Callback {
        void whenFinish(List<Element> elements);
    }
    ElementsRepository(){
        elements.add(new Element(R.drawable.principito, "El principito","Un pequeño príncipe viaja de planeta en planeta y descubre lecciones sobre la vida y el amor en su búsqueda de amigos."));
        elements.add(new Element(R.drawable.unrealengine_original, "Cien años de soledad","Una saga familiar que abarca siete generaciones en el pueblo ficticio de Macondo, explorando temas de amor, soledad, magia y decadencia."));
        elements.add(new Element(R.drawable.unrealengine_original, "1984","En un mundo totalitario, Winston Smith lucha por la verdad y la libertad mientras es perseguido por el Partido y su líder, el omnipresente Gran Hermano."));
        elements.add(new Element(R.drawable.unrealengine_original, "El nombre del viento","Kvothe, un talentoso músico y mago, narra su vida desde la infancia hasta su ascenso como leyenda, desvelando secretos y magia en un mundo de fantasía."));
        elements.add(new Element(R.drawable.unrealengine_original, "Matar a un ruiseñor","La historia de Atticus Finch, un abogado que defiende a un hombre negro acusado de violar a una mujer blanca en la segregada Alabama de los años 30."));
        elements.add(new Element(R.drawable.unrealengine_original, "Los juegos del hambre","Katniss Everdeen se convierte en símbolo de resistencia cuando participa en los Juegos del Hambre, una competición mortal impuesta por un gobierno opresivo."));
        elements.add(new Element(R.drawable.unrealengine_original, "El código Da Vinci","Un profesor de simbología y una criptóloga investigan un misterioso asesinato que los lleva a descubrir un secreto antiguo que podría cambiar la historia del cristianismo."));
        elements.add(new Element(R.drawable.unrealengine_original, "El gran Gatsby","La historia del enigmático Jay Gatsby y su obsesión por recuperar un amor del pasado en la decadente Nueva York de los años 20."));
        elements.add(new Element(R.drawable.unrealengine_original, "Orgullo y prejuicio","La novela sigue la vida de Elizabeth Bennet mientras navega por las expectativas sociales y el romance en la Inglaterra del siglo XIX."));
        elements.add(new Element(R.drawable.unrealengine_original, "Crónica de una muerte anunciada","La narrativa de la investigación periodística sobre el asesinato de Santiago Nasar en un pueblo caribeño, donde todos saben lo que va a ocurrir."));
        elements.add(new Element(R.drawable.unrealengine_original, "La sombra del viento","En la Barcelona de posguerra, un joven encuentra un libro misterioso y comienza una búsqueda para descubrir la vida del autor y los secretos que rodean la obra."));
        elements.add(new Element(R.drawable.unrealengine_original, "Los hombres me explican cosas","En este libro de ensayos, Rebecca Solnit aborda el sexismo y la condescendencia hacia las mujeres en la sociedad contemporánea, a través de anécdotas personales y análisis cultural."));
    }
    public List<Element> get() {
        return elements;
    }

    public void insert(Element element, Callback callback) {
        elements.add(element);
        callback.whenFinish(elements);
    }

    public void delete(Element element, Callback callback) {
        elements.remove(element);
        callback.whenFinish(elements);
    }

    public void update(Element element, float rating, Callback callback) {
        element.rating = rating;
        callback.whenFinish(elements);
    }

}
