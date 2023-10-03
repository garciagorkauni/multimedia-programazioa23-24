package eus.urko.recyclerviewfragments;

import java.util.ArrayList;
import java.util.List;

public class ElementsRepository {

    List<Element> elements = new ArrayList<>();

    public interface Callback {
        void whenFinish(List<Element> elements);
    }
    ElementsRepository(){
        elements.add(new Element(R.drawable.principito, "El principito","Unreal Engine es un motor de juegos creado por la compañía Epic Games, dado a conocer inicialmente en el shooter en primera persona Unreal en 1998."));
        elements.add(new Element(R.drawable.unrealengine_original, "Unreal Engine","Unreal Engine es un motor de juegos creado por la compañía Epic Games, dado a conocer inicialmente en el shooter en primera persona Unreal en 1998."));
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
