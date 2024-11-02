import java.util.ArrayList;
import java.util.List;

public class OrderExpression implements Expression{

    private List<Expression> expressions=new ArrayList<>();

    public OrderExpression(String order) {
        String[] parts = order.split(",");
        for (String part : parts) {
            expressions.add(new FoodItemExpression(part.trim()));
        }
    }

    @Override
    public void interpret(OrderContext context) {
        for (Expression expression : expressions) {
            expression.interpret(context);
        }
    }
}
