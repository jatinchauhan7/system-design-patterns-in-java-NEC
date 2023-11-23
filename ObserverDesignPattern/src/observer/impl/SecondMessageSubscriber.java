package observer.impl;

import message.Message;
import observer.Observer;

public class SecondMessageSubscriber implements Observer 
{
    @Override
    public void updateObserver(Message message) {
        System.out.println("Message for Second subscriber :: " + message.getMessage());
    }
}