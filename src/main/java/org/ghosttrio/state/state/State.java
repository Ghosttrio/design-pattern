package org.ghosttrio.state.state;

import org.ghosttrio.state.context.Context;

public interface State {
    void handle(Context context);
}
