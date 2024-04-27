package org.example.parkinglotsst.services;

import org.example.parkinglotsst.Models.Ticket;
import org.example.parkinglotsst.Models.VehicleType;
import org.example.parkinglotsst.exceptions.InvalidGateException;
import org.example.parkinglotsst.repositories.GateRepository;
import org.example.parkinglotsst.Models.Gate;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());




        return null;
    }
}