package org.example.designpatterns._01_creational._03_abstract_factory._03_java;

import org.example.designpatterns._01_creational._02_factory_method._02_after.Ship;
import org.example.designpatterns._01_creational._02_factory_method._02_after.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }

}
