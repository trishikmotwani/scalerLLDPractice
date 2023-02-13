package scaler.casestudies.design.parkinglot.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import scaler.casestudies.design.parkinglot.models.ParkingLot;

public class ParkingLotRepository {
	public static long parkingLotId = 1L;
	public Map<Long, ParkingLot> parkingLots = new HashMap<Long, ParkingLot>();
	
	public ParkingLot createParkingLot(ParkingLot parkingLot) {
		parkingLots.put(parkingLotId, parkingLot);
		return parkingLot;
	}
	public ParkingLot getParkingLotById(long parkingLotId) {
		return parkingLots.get(parkingLotId);
	}
}
