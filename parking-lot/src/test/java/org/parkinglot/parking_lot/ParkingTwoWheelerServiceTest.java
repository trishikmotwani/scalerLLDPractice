package org.parkinglot.parking_lot;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.parkinglot.parking_lot.models.ParkingLotLocations;
import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.ParkingTicket;
import org.parkinglot.parking_lot.models.Vehicle;
import org.parkinglot.parking_lot.models.VehicleCategories;
import org.parkinglot.parking_lot.models.VehicleTypes;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;
import org.parkinglot.parking_lot.services.ParkingTwoWheelerService;

public class ParkingTwoWheelerServiceTest {

	ParkingTwoWheelerService twoWheelerParkingService;
	ParkingTicketRepository ticketRepoMock;
	@Before
    public void init()
    {
        ticketRepoMock = Mockito.mock(ParkingTicketRepository.class);
        twoWheelerParkingService = new ParkingTwoWheelerService(ticketRepoMock);
    }
	
	@Test
    public void calculateRectangleAreaTest()
    {
		ParkingLot mallParkingLot = ParkingLot.getBuilder().setParkingLotLocation(ParkingLotLocations.Mall)
				.setTwoWheelerTotalSpots(100).setFourWheelerTotalSpots(80).setHeavyVehicleTotalSpots(10)
				.build();
		LocalDateTime entryDateTime = LocalDateTime.of(2020, 10, 4, 10, 20, 55);
		ParkingTicket ticket = new ParkingTicket(1, entryDateTime, 1); 
		mallParkingLot.getParkingSpots().get(1).setParkingTicket(ticket);
		mallParkingLot.getParkingSpots().get(1).setVehicle(new Vehicle(VehicleTypes.Motorcycle));
		
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket);
        ParkingReceipt receipt = this.twoWheelerParkingService.unparkVehicle(mallParkingLot, ticket.getTicketNum());
        Assert.assertEquals(20 ,receipt.getFees());

    }
}
