package day15.interfaceEx.sec08;

public class ExtendsExample {

  public static void main(String[] args) {

    InterfaceA ia = new InterfaceCImpl();
    ia.methodA();

    InterfaceB ib = new InterfaceCImpl();
    ib.methodB();

    InterfaceC ic = new InterfaceCImpl();
    ic.methodA();
    ic.methodB();
    ic.methodC();
  }
}