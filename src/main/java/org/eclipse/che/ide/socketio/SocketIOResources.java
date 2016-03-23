
package org.eclipse.che.ide.socketio;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface SocketIOResources extends ClientBundle {

    @Source("org/eclipse/che/ide/socketio/socket.io.js")
    TextResource socketIo();
}
