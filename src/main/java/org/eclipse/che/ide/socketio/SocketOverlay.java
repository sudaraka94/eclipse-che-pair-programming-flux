
package org.eclipse.che.ide.socketio;

import com.google.gwt.core.client.JavaScriptObject;

public class SocketOverlay extends JavaScriptObject {

    protected SocketOverlay() {
    }

    public final native void reconnect() /*-{
        this.socket.reconnect();
    }-*/;

    public final native void emit(String type, JavaScriptObject json) /*-{
      this.emit(type, json, function(answer) {
            });
    }-*/;

    public final native void on(String eventName, Runnable runnable)  /*-{
            this.on(eventName,
                function() {
                    handler.@java.lang.Runnable::run()();
                });
    }-*/;


    public final native <T extends JavaScriptObject> void on(String eventName, Consumer<T> handler) /*-{
         this.on(eventName,
                     function(param) {
                         handler.@org.eclipse.che.ide.socketio.Consumer::accept(*)(param);
                     });
     }-*/;

}
