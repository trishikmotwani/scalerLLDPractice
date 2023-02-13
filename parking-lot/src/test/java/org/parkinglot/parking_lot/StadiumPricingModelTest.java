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
import org.parkinglot.parking_lot.services.StadiumPricingModel;

public class StadiumPricingModelTest {

	StadiumPricingModel stadiumPricingModel;
	ParkingTicketRepository ticketRepoMock;
	
	@Before
    public void init() {
        ticketRepoMock = Mockito.mock(ParkingTicketRepository.class);
        stadiumPricingModel = new StadiumPricingModel(ticketRepoMock);
    }
	
	@Test
    public void calculateParkingFeesAndReceiptTest() {
	
		// testCase0: Motorcycle parked for 3 hours and 40 mins. Fees: 30
		LocalDateTime entryDateTime = LocalDateTime.now().minusHours(3).minusMinutes(40);
		ParkingTicket ticket = new ParkingTicket(1, entryDateTime, 1); 
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket);
        
        ParkingReceipt receipt = this.stadiumPricingModel.calculateParkingFeesAndReceipt(new Vehicle(VehicleTypes.Motorcycle), ticket.getTicketNum());
        Assert.assertEquals(30 ,receipt.getFees());
        
        // testCase1: Motorcycle parked for 14 hours and 59 mins. Fees: 390.
        LocalDateTime entryDateTime1 = LocalDateTime.now().minusHours(14).minusMinutes(59);
        ParkingTicket ticket1 = new ParkingTicket(1, entryDateTime1, 1); 
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket1);
     
        ParkingReceipt receipt1 = this.stadiumPricingModel.calculateParkingFeesAndReceipt(new Vehicle(VehicleTypes.Motorcycle), ticket1.getTicketNum());
        Assert.assertEquals(390 ,receipt1.getFees());
             
        // testCase2: Electric SUV parked for 11 hours and 30 mins. Fees: 180.
        LocalDateTime entryDateTime2 = LocalDateTime.now().minusHours(11).minusMinutes(30);
        ParkingTicket ticket2 = new ParkingTicket(1, entryDateTime2, 1); 
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket2);
        
        ParkingReceipt receipt2 = this.stadiumPricingModel.calculateParkingFeesAndReceipt(new Vehicle(VehicleTypes.Suv), ticket2.getTicketNum());
        Assert.assertEquals(180 ,receipt2.getFees());
        
        // testCase3: SUV parked for 13 hours and 5 mins. Fees: 580.
        LocalDateTime entryDateTime3 = LocalDateTime.now().minusHours(13).minusMinutes(5);
        ParkingTicket ticket3 = new ParkingTicket(1, entryDateTime3, 1); 

        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket3);
        ParkingReceipt receipt3 = this.stadiumPricingModel.calculateParkingFeesAndReceipt
        		(new Vehicle(VehicleTypes.Suv), ticket3.getTicketNum());
        Assert.assertEquals(580 ,receipt3.getFees());
             
             

    }
}
