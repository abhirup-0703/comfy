package com.app.Comfy;

import com.app.Comfy.logging.Log;

public class Application {

    public void run() {
        Log.init();
    }
    
    public Application createApplication() {
        throw new UnsupportedOperationException("The createApplication method must be implemented by the user");
    }
}
