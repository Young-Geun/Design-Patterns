package org.example.designpatterns._01_creational._03_abstract_factory._02_after;

import org.example.designpatterns._01_creational._02_factory_method._02_after.DefaultShipFactory;
import org.example.designpatterns._01_creational._02_factory_method._02_after.Ship;
import org.example.designpatterns._01_creational._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }

}
