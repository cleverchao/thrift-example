import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class JavaServer {

  public static CalcHandler handler;

  public static Calc.Processor processor;

  public static void main(String [] args) {
    try {
      handler = new CalcHandler();
      processor = new Calc.Processor(handler);

      TServerTransport serverTransport = new TServerSocket(9090);
      TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));
      System.out.println("Starting the simple server...");
      server.serve();
      
    } catch (Exception x) {
      x.printStackTrace();
    }
  }

}
