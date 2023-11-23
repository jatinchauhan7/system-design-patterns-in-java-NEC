package observer.impl;

import message.Message;
import observer.Observer;

public class ThirdMessageSubscriber implements Observer 
{
    @Override
    public void updateObserver(Message message) {
        System.out.println("Message for Third subscriber :: " + message.getMessage());
    }
}