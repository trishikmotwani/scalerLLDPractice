package scaler.casestudies.design.parkinglot.controllers;

import scaler.casestudies.design.parkinglot.ObjectRegistry;
import scaler.casestudies.design.parkinglot.dtos.GenerateParkingTicketRequest;
import scaler.casestudies.design.parkinglot.dtos.GenerateParkingTicketResponse;
import scaler.casestudies.design.parkinglot.dtos.ResponseStatus;
import scaler.casestudies.design.parkinglot.models.Ticket;
import scaler.casestudies.design.parkinglot.services.TicketingService;

public class TicketController {

	private TicketingService ticketService;
	public TicketController() {
		this.ticketService = (TicketingService)ObjectRegistry.get("parkingTicketService");
	}
	public GenerateParkingTicketResponse generateParkingTicket(GenerateParkingTicketRequest generateTicketReq) {
		// generate Ticket will assign spot to vehicle and add gate and operator info in the ticket and save all
		
		Ticket ticket = this.ticketService.generateParkingTicket(generateTicketReq.getGateId()
									,generateTicketReq.getParkingLotId(), generateTicketReq.getVehicle());
		
		GenerateParkingTicketResponse generateTicketResposne = new GenerateParkingTicketResponse();
		generateTicketResposne.setStatus(ResponseStatus.Ok);
		generateTicketResposne.setParkingTicket(ticket);
		return generateTicketResposne;
	}
}
