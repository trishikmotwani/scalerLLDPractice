package org.parkinglot.parking_lot.models;

import java.util.HashMap;
import java.util.Map;

public class Vehicle {
	private VehicleTypes vehicleType;
	private VehicleCategories vehicleCategory;
	public static Map<VehicleTypes, VehicleCategories> vehicleCategoryMap = createVehicleCategoriesMap();
	
	public Vehicle(VehicleTypes vehicleType) {
		this.vehicleType = vehicleType;
		this.vehicleCategory = vehicleCategoryMap.get(vehicleType);
	}

	private static Map<VehicleTypes, VehicleCategories> createVehicleCategoriesMap() {
		HashMap<VehicleTypes, VehicleCategories> vehicleTypeCategoryMap = new HashMap<VehicleTypes, VehicleCategories>();
		vehicleTypeCategoryMap.put(VehicleTypes.Motorcycle, VehicleCategories.TwoWheeler);
		vehicleTypeCategoryMap.put(VehicleTypes.Scooter, VehicleCategories.TwoWheeler);
		vehicleTypeCategoryMap.put(VehicleTypes.Car, VehicleCategories.FourWheeler);
		vehicleTypeCategoryMap.put(VehicleTypes.Suv, VehicleCategories.FourWheeler);
		vehicleTypeCategoryMap.put(VehicleTypes.Bus, VehicleCategories.HeavyVehicle);
		vehicleTypeCategoryMap.put(VehicleTypes.Truck, VehicleCategories.HeavyVehicle);
		return vehicleTypeCategoryMap;
	}
	public VehicleTypes getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleTypes vehicleType) {
		this.vehicleType = vehicleType;
	}

	public VehicleCategories getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(VehicleCategories vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
}
