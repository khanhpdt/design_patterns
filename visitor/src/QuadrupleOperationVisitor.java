import java.math.BigDecimal;

public class QuadrupleOperationVisitor implements OperationVisitor {
    @Override
    public void visit(BigDecimalOperand c) {
        System.out.println("Quadruple BigDecimal Operand: " + c.bigDecimalValue().multiply(new BigDecimal("4")));
    }

    @Override
    public void visit(IntegerOperand c) {
        System.out.println("Quadruple Integer Operand: " + c.intValue());
    }
}
