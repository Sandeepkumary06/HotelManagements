package com.example.HotelManagement.service;

import com.example.HotelManagement.model.HotelRoom;
import com.example.HotelManagement.repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    IRoomRepo iRoomRepo;

    public List<HotelRoom> getAllRooms() {
        return (List<HotelRoom>) iRoomRepo.findAll();
    }

    public String addRoom(HotelRoom room) {
        if(room != null) {
            iRoomRepo.save(room);
            return "Room added is successfully";
        }
        return "not added !!!";
    }

    public Optional<HotelRoom> getRoomById(Integer id)
    {
        return iRoomRepo.findById(id);
    }

    public String updateRoomById(Integer id , HotelRoom rooms) {
        List<HotelRoom> getRoom = getAllRooms();
        for(HotelRoom room : getRoom){
            if(room.getRoomId()==id){
                room.setRoomId(rooms.getRoomId());
                room.setRoomNum(rooms.getRoomNum());
                room.setRoomType(rooms.getRoomType());
                room.setRoomPrice(rooms.getRoomPrice());
                room.setRoomStatus(rooms.getRoomStatus());
                return "Update successfully of this room ID "+id;
            }
        }
        return "Not update This room id "+id +" because not found in our database";
    }

    public String addRooms(List<HotelRoom> rooms) {
        if(rooms != null){
            iRoomRepo.saveAll(rooms);
            return "all room saved in our database";
        }
        return "Not saved !!!!";
    }
}
