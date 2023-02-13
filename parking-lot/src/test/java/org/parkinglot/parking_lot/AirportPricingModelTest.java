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
import org.parkinglot.parking_lot.services.AirportPricingModel;
import org.parkinglot.parking_lot.services.MallPricingModel;
import org.parkinglot.parking_lot.services.ParkingTwoWheelerService;

public class AirportPricingModelTest {

	AirportPricingModel airportPricingModel;
	ParkingTicketRepository ticketRepoMock;
	
	@Before
    public void init() {
        ticketRepoMock = Mockito.mock(ParkingTicketRepository.class);
        airportPricingModel = new AirportPricingModel(ticketRepoMock);
    }
	
	@Test
    public void calculateParkingFeesAndReceiptTest() {
	
		// testCase1: Motorcycle parked for 55 mins. Fees: 0
		LocalDateTime entryDateTime1 = LocalDateTime.now().minusMinutes(55);
		ParkingTicket ticket1 = new ParkingTicket(1, entryDateTime1, 1); 
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket1);
        
        ParkingReceipt receipt1 = this.airportPricingModel.calculateParkingFeesAndReceipt(new Vehicle(VehicleTypes.Motorcycle), ticket1.getTicketNum());
        Assert.assertEquals(0 ,receipt1.getFees());
        
        // testCase2: Motorcycle parked for 14 hours and 59 mins. Fees: 60
        LocalDateTime entryDateTime2 = LocalDateTime.now().minusHours(14).minusMinutes(59);
        ParkingTicket ticket2 = new ParkingTicket(1, entryDateTime2, 1); 
        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket2);
        
        ParkingReceipt receipt2 = this.airportPricingModel.calculateParkingFeesAndReceipt(new Vehicle(VehicleTypes.Motorcycle), ticket2.getTicketNum());
        Assert.assertEquals(60 ,receipt2.getFees());
        
        // testCase3: Motorcycle parked for 1 day and 12 hours. Fees: 160
        LocalDateTime entryDateTime3 = LocalDateTime.now().minusDays(1).minusHours(12);
        ParkingTicket ticket3 = new ParkingTicket(1, entryDateTime3, 1); 

        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket3);
        ParkingReceipt receipt3 = this.airportPricingModel.calculateParkingFeesAndReceipt
        		(new Vehicle(VehicleTypes.Motorcycle), ticket3.getTicketNum());
        Assert.assertEquals(160 ,receipt3.getFees());
             
        // testCase4: Car parked for 50 mins. Fees: 60
        LocalDateTime entryDateTime4 = LocalDateTime.now().minusMinutes(50);
        ParkingTicket ticket4 = new ParkingTicket(1, entryDateTime4, 1); 

        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket4);
        ParkingReceipt receipt4 = this.airportPricingModel.calculateParkingFeesAndReceipt
        		(new Vehicle(VehicleTypes.Car), ticket4.getTicketNum());
        Assert.assertEquals(60 ,receipt4.getFees());
        
        // testCase5: SUV parked for 23 hours and 59 mins. Fees: 80
        LocalDateTime entryDateTime5 = LocalDateTime.now().minusHours(23).minusMinutes(59);
        ParkingTicket ticket5 = new ParkingTicket(1, entryDateTime5, 1); 

        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket5);
        ParkingReceipt receipt5 = this.airportPricingModel.calculateParkingFeesAndReceipt
        		(new Vehicle(VehicleTypes.Suv), ticket5.getTicketNum());
        Assert.assertEquals(80 ,receipt5.getFees());  
        
        // testCase6: Car parked for 3 days and 1 hour. Fees: 400
        LocalDateTime entryDateTime6 = LocalDateTime.now().minusDays(3).minusHours(1);
        ParkingTicket ticket6 = new ParkingTicket(1, entryDateTime6, 1);

        Mockito.when(ticketRepoMock.getTicket(1)).thenReturn(ticket6);
        ParkingReceipt receipt6 = this.airportPricingModel.calculateParkingFeesAndReceipt
        		(new Vehicle(VehicleTypes.Car), ticket6.getTicketNum());
        Assert.assertEquals(400 ,receipt6.getFees());

    }
}
