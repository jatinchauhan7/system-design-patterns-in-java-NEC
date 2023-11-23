package subject;
import message.Message;
import observer.Observer;

public interface Subject {
	
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyUpdate(Message message);
}