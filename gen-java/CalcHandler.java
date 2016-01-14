import org.apache.thrift.TException;

public class CalcHandler implements Calc.Iface {

	@Override
	public int add(int num1, int num2) throws TException {
		return num1 + num2;
	}

	@Override
	public Message hello(Message name) throws TException {
		return new Message("hello " + name.mes);
	}
}

