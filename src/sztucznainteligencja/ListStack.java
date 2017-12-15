package sztucznainteligencja;

import java.util.ArrayList;
import java.util.List;

public class ListStack implements Stack {
    List<StackElemnt>  stackElements = new ArrayList<>();
    // chiałem zrobić jako Stackelement stackElement =null linked list

    @Override
    public void push(int value) {//dodaje
        StackElemnt variable= new StackElemnt();
        variable.setValue(value);
        variable.setNext(null);// nie wiem jaki bedzie kkolejny

        stackElements.add(variable);
    }

    @Override
    public int pop() {
        StackElemnt lastElement=stackElements.get(stackElements.size()-1);// referenncja na ostatni obiekt
        stackElements.remove(lastElement);
        return lastElement.getValue();
    }

    @Override
    public int size() {
        return stackElements.size();
    }

    @Override
    public boolean isEmpty() {
       return stackElements.isEmpty();
    }

    @Override
    public void print() {
        for(StackElemnt stackElemntItr: stackElements)
        {
            System.out.println(stackElemntItr.getValue());
        }

    }
}
