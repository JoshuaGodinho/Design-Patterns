import java.util.ArrayList;
import java.util.List;

public class OrderCaretaker {
    private List<OrderMemento> mementoList = new ArrayList<>();

    public void saveState(OrderContext order) {
        mementoList.add(order.saveStateToMemento());
    }

    public void undo(OrderContext order) {
        if (!mementoList.isEmpty()) {
            OrderMemento memento = mementoList.remove(mementoList.size() - 1);
            order.getStateFromMemento(memento);
        }
    }
}
