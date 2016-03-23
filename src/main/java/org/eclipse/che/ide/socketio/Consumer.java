
package org.eclipse.che.ide.socketio;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
