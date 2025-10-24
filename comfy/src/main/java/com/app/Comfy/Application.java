package com.app.Comfy;

public class Application {

    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Iteration " + i);
        }
    }
    
    public Application createApplication() {
        throw new UnsupportedOperationException("The createApplication method must be implemented by the user");
    }
}
