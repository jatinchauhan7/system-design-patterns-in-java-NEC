package client;

import message.Message;
import observer.impl.FirstMessageSubscriber;
import observer.impl.SecondMessageSubscriber;
import observer.impl.ThirdMessageSubscriber;
import subject.impl.MessagePublisher;


public class ObserverTest {

	public static void main(String[] args) {
		
		
		FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
		SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
		ThirdMessageSubscriber thirdMessageSubscriber = new ThirdMessageSubscriber();

		
		MessagePublisher messagePublisher = new MessagePublisher();

		
		messagePublisher.register(firstMessageSubscriber);
		messagePublisher.register(secondMessageSubscriber);

		
		messagePublisher.notifyUpdate(new Message("This is First Message"));
		System.out.println("---------------------------------------------------------------");

		
		messagePublisher.unregister(firstMessageSubscriber);
		
		
		messagePublisher.register(thirdMessageSubscriber);

		
		messagePublisher.notifyUpdate(new Message("This is Second Message"));
	}
}