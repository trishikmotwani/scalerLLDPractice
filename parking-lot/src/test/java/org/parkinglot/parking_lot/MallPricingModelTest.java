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
import org.parkinglot.parking_lot.services.MallPricingModel;
import org.parkinglot.parking_lot.services.ParkingTwoWheelerService;

public class MallPricingModelTest {

	MallPricingModel mallPricingModel;
	ParkingTicketRepository ticketRepoMock;
	
	@Before
    public void init() {
        ticketRepoMock = Mockito.mock(ParkingTicketRepository.class);
        mallPricingModel = new MallPricingModel(ticketRepoMock);
    }
	
	@Test
    public void calculateParkingFeesAndReceiptTest() {
	
		// testCase1: Motorcycle parked for 3 hours and 30 mins. Fees: 40
		LocalDateTime entryDateTime1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
		ParkingTicket ticket1 = new ParkingTicket(1, entryDateTime1, 1); 
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket1);
        
        ParkingReceipt receipt1 = this.mallPricingModel.calculateParkingFeesAndReceipt(new Vehicle(VehicleTypes.Motorcycle), ticket1.getTicketNum());
        Assert.assertEquals(40 ,receipt1.getFees());
        
        // testCase2: Car parked for 6 hours and 1 min. Fees: 140
        LocalDateTime entryDateTime2 = LocalDateTime.now().minusHours(6).minusMinutes(1);
        ParkingTicket ticket2 = new ParkingTicket(1, entryDateTime2, 1); 
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket2);
        
        ParkingReceipt receipt2 = this.mallPricingModel.calculateParkingFeesAndReceipt(new Vehicle(VehicleTypes.Car), ticket2.getTicketNum());
        Assert.assertEquals(140 ,receipt2.getFees());
        
        // testCase3: Truck parked for 1 hour and 59 mins. Fees: 100
        LocalDateTime entryDateTime3 = LocalDateTime.now().minusHours(1).minusMinutes(59);
        ParkingTicket ticket3 = new ParkingTicket(1, entryDateTime3, 1); 

        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket3);
        ParkingReceipt receipt3 = this.mallPricingModel.calculateParkingFeesAndReceipt
        		(new Vehicle(VehicleTypes.Truck), ticket3.getTicketNum());
        Assert.assertEquals(100 ,receipt3.getFees());
             
             

    }
}
