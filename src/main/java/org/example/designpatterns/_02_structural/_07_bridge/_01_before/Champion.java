package org.example.designpatterns._02_structural._07_bridge._01_before;

import org.example.designpatterns._02_structural._07_bridge._02_after.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
