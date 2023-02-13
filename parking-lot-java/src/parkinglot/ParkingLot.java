package parkinglot;

import java.util.ArrayList;
import java.util.List;

import parkinglot.models.ParkingLotLocations;
import parkinglot.models.ParkingReceipt;
import parkinglot.models.ParkingSpot;
import parkinglot.models.ParkingTicket;
import parkinglot.models.Vehicle;
import parkinglot.models.VehicleCategories;
import parkinglot.models.VehicleTypes;
import parkinglot.repositories.ParkingTicketRepository;
import parkinglot.services.ParkingService;
import parkinglot.services.ParkingServiceFactory;
import parkinglot.services.PricingModel;
import parkinglot.services.PricingModelFactory;

public class ParkingLot {

	private ParkingService parkingService;
	private ParkingLotLocations parkingLotLocation;
	private List<ParkingSpot> parkingSpots;
	private int twoWheelerTotalSpots;
	private int fourWheelerTotalSpots;
	private int heavyVehicleTotalSpots;
	private int twoWheelerStartSpot;
	private int twoWheelerEndSpot;
	private int fourWheelerStartSpot;
	private int fourWheelerEndSpot;
	private int heavyVehicleStartSpot;
	private int heavyVehicleEndSpot;
	private int totalSpots;
	
	private ParkingLot(ParkingLotBuilder builder) {
		this.parkingLotLocation = builder.parkingLotLocation;
		this.parkingSpots = builder.parkingSpots;
		
		this.twoWheelerTotalSpots = builder.twoWheelerTotalSpots;
		this.fourWheelerTotalSpots = builder.fourWheelerTotalSpots;
		this.heavyVehicleTotalSpots = builder.heavyVehicleTotalSpots;
		this.totalSpots = builder.totalSpots;
		
		this.twoWheelerStartSpot = builder.twoWheelerStartSpot;
		this.twoWheelerEndSpot = builder.twoWheelerEndSpot;
		this.fourWheelerStartSpot = builder.fourWheelerStartSpot;
		this.fourWheelerEndSpot = builder.fourWheelerEndSpot;
		this.heavyVehicleStartSpot = builder.heavyVehicleStartSpot;
		this.heavyVehicleEndSpot = builder.heavyVehicleEndSpot;
	}
	
	public ParkingTicket parkVehicle(VehicleTypes vehicleType) {
		parkingService = ParkingServiceFactory.createParkingService(Vehicle.vehicleCategoryMap.get(vehicleType));
		ParkingTicket ticket = parkingService.parkVehicle(this, vehicleType);
		if(ticket == null) {
			System.out.println("No Space Available");
		} else {
			System.out.println("Parking Ticket");
			System.out.println("\t Ticket number: " + ticket.getTicketNum());
			System.out.println("\t Spot Number: " + ticket.getSpotNo());
			System.out.println("\t Entry Date-time: " + ticket.getEntryDateTime().toString());
		}
		return ticket;
	}
	public ParkingReceipt unparkVehicle(VehicleTypes vehicleType, int ticketNo) {
		parkingService = ParkingServiceFactory.createParkingService(Vehicle.vehicleCategoryMap.get(vehicleType));
		ParkingReceipt receipt = parkingService.unparkVehicle(this, ticketNo);
		
		System.out.println("Parking Receipt");
		System.out.println("\t Receipt number: " + receipt.getReceiptNum());
		System.out.println("\t Entry Date-time: " + receipt.getEntryDateTime());
		System.out.println("\t Entry Date-time: " + receipt.getExitDateTime());
		System.out.println("\t Fees: " + receipt.getFees());
		return receipt;
	}
	
	public ParkingLotLocations getParkingLotLocation() {
		return parkingLotLocation;
	}
	public void setParkingLotLocation(ParkingLotLocations parkingLotLocation) {
		this.parkingLotLocation = parkingLotLocation;
	}
	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	public int getTwoWheelerTotalSpots() {
		return twoWheelerTotalSpots;
	}
	public void setTwoWheelerTotalSpots(int twoWheelerTotalSpots) {
		this.twoWheelerTotalSpots = twoWheelerTotalSpots;
	}
	public int getFourWheelerTotalSpots() {
		return fourWheelerTotalSpots;
	}
	public void setFourWheelerTotalSpots(int fourWheelerTotalSpots) {
		this.fourWheelerTotalSpots = fourWheelerTotalSpots;
	}
	public int getHeavyVehicleTotalSpots() {
		return heavyVehicleTotalSpots;
	}
	public void setHeavyVehicleTotalSpots(int heavyVehicleTotalSpots) {
		this.heavyVehicleTotalSpots = heavyVehicleTotalSpots;
	}

	public int getTwoWheelerStartSpot() {
		return twoWheelerStartSpot;
	}

	public void setTwoWheelerStartSpot(int twoWheelerStartSpot) {
		this.twoWheelerStartSpot = twoWheelerStartSpot;
	}

	public int getTwoWheelerEndSpot() {
		return twoWheelerEndSpot;
	}

	public void setTwoWheelerEndSpot(int twoWheelerEndSpot) {
		this.twoWheelerEndSpot = twoWheelerEndSpot;
	}

	public int getFourWheelerStartSpot() {
		return fourWheelerStartSpot;
	}

	public void setFourWheelerStartSpot(int fourWheelerStartSpot) {
		this.fourWheelerStartSpot = fourWheelerStartSpot;
	}

	public int getFourWheelerEndSpot() {
		return fourWheelerEndSpot;
	}

	public void setFourWheelerEndSpot(int fourWheelerEndSpot) {
		this.fourWheelerEndSpot = fourWheelerEndSpot;
	}

	public int getHeavyVehicleStartSpot() {
		return heavyVehicleStartSpot;
	}

	public void setHeavyVehicleStartSpot(int heavyVehicleStartSpot) {
		this.heavyVehicleStartSpot = heavyVehicleStartSpot;
	}

	public int getHeavyVehicleEndSpot() {
		return heavyVehicleEndSpot;
	}

	public void setHeavyVehicleEndSpot(int heavyVehicleEndSpot) {
		this.heavyVehicleEndSpot = heavyVehicleEndSpot;
	}

	public static ParkingLotBuilder getBuilder() {
		return new ParkingLotBuilder();
	}
	/**
	 * @return the parkingService
	 */
	public ParkingService getParkingService() {
		return parkingService;
	}

	/**
	 * @param parkingService the parkingService to set
	 */
	public void setParkingService(ParkingService parkingService) {
		this.parkingService = parkingService;
	}
	/**
	 * @return the totalSpots
	 */
	public int getTotalSpots() {
		return totalSpots;
	}

	/**
	 * @param totalSpots the totalSpots to set
	 */
	public void setTotalSpots(int totalSpots) {
		this.totalSpots = totalSpots;
	}
	public static class ParkingLotBuilder {

		private PricingModel pricingModel;
		private ParkingLotLocations parkingLotLocation;
		private List<ParkingSpot> parkingSpots;
		private int twoWheelerTotalSpots;
		private int fourWheelerTotalSpots;
		private int heavyVehicleTotalSpots;
		private int totalSpots;
		private int twoWheelerStartSpot;
		private int twoWheelerEndSpot;
		private int fourWheelerStartSpot;
		private int fourWheelerEndSpot;
		private int heavyVehicleStartSpot;
		private int heavyVehicleEndSpot;

		public ParkingLot build() {
			this.totalSpots = this.twoWheelerTotalSpots + this.fourWheelerTotalSpots +
					this.heavyVehicleTotalSpots;
			
			this.twoWheelerStartSpot = 1; // parking spots start from index 1, index 0 is reserved
			this.twoWheelerEndSpot = this.twoWheelerTotalSpots;
			
			this.fourWheelerStartSpot = this.twoWheelerTotalSpots + 1;
			this.fourWheelerEndSpot = this.twoWheelerTotalSpots + this.fourWheelerTotalSpots;
			
			this.heavyVehicleStartSpot = this.twoWheelerTotalSpots + this.fourWheelerTotalSpots;
			this.heavyVehicleEndSpot = this.totalSpots;
			
			this.parkingSpots = new ArrayList<ParkingSpot>();
			for(int i = 0; i <= this.totalSpots; i++) { // spot 0 is reserved
				this.parkingSpots.add(new ParkingSpot());
			}
			return new ParkingLot(this);
		}
		
		public PricingModel getPricingModel() {
			return pricingModel;
		}
		public ParkingLotBuilder setPricingModel(PricingModel pricingModel) {
			this.pricingModel = pricingModel;
			return this;
		}
		public ParkingLotLocations getParkingLotLocation() {
			return parkingLotLocation;
		}
		public ParkingLotBuilder setParkingLotLocation(ParkingLotLocations parkingLotLocation) {
			this.parkingLotLocation = parkingLotLocation;
			return this;
		}
		public int getTotalSpots() {
			return totalSpots;
		}
		public ParkingLotBuilder setTotalSpots(int totalSpots) {
			this.totalSpots = totalSpots;
			return this;
		}
		public List<ParkingSpot> getParkingSpots() {
			return parkingSpots;
		}
		public ParkingLotBuilder setParkingSpots(List<ParkingSpot> parkingSpots) {
			this.parkingSpots = parkingSpots;
			return this;
		}
		public int getTwoWheelerTotalSpots() {
			return twoWheelerTotalSpots;
		}
		public ParkingLotBuilder setTwoWheelerTotalSpots(int twoWheelerTotalSpots) {
			this.twoWheelerTotalSpots = twoWheelerTotalSpots;
			return this;
		}
		public int getFourWheelerTotalSpots() {
			return fourWheelerTotalSpots;
		}
		public ParkingLotBuilder setFourWheelerTotalSpots(int fourWheelerTotalSpots) {
			this.fourWheelerTotalSpots = fourWheelerTotalSpots;
			return this;
		}
		public int getHeavyVehicleTotalSpots() {
			return heavyVehicleTotalSpots;
		}
		public ParkingLotBuilder setHeavyVehicleTotalSpots(int heavyVehicleTotalSpots) {
			this.heavyVehicleTotalSpots = heavyVehicleTotalSpots;
			return this;
		}
	}
}
