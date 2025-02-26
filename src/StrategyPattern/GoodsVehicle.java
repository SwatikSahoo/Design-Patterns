package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){super(new NormalDriveStrategy());}
}
