/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2r.Assistance;

import av2r.commande.*;

/**
 *
 * @author 362294
 */
public interface AssistanceRegister {

    //methods to register and unregister observers
    public void register(AssistanceObserver obj);

    public void unregister(AssistanceObserver obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from Action
    public Object getUpdate(AssistanceObserver obj);

}
