package Mediator;

public class MediatorEx {
	public static void main(String[] args) { Mediator mediator = new Mediator(); ISource tcp = new TcpComm(); tcp.setMediator(mediator); ISource system = new SystemSignal(); system.setMediator(mediator); mediator.addDestination(new Display()); mediator.addDestination(new Log()); tcp.eventOccured("connected"); tcp.eventOccured("disconnected"); system.eventOccured("key input"); system.eventOccured("mouse input"); }
}
