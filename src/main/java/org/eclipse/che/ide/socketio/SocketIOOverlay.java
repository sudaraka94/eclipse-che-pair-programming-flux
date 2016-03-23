
package org.eclipse.che.ide.socketio;

import com.google.gwt.core.client.JavaScriptObject;

public class SocketIOOverlay extends JavaScriptObject {

    protected SocketIOOverlay() {}
    public final native SocketOverlay connect(String url) /*-{
        return this.connect(url, {
                   'reconnect': true,
                   'reconnection delay': 500,
                   'max reconnection attempts': 10
        });
    }-*/;

}
