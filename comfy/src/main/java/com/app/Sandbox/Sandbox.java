package com.app.Sandbox;

import com.app.Comfy.Application;

public class Sandbox extends com.app.Comfy.Application {
    public Sandbox() {
        
    }

    @Override
    public Application createApplication() {
        return new Sandbox();
    }    
}
