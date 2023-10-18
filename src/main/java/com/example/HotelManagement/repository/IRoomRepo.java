package com.example.HotelManagement.repository;

import com.example.HotelManagement.model.HotelRoom;
import com.example.HotelManagement.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Integer> {
    List<HotelRoom> findByRoomStatus(Boolean roomStatus);
    List<HotelRoom>findByRoomStatusAndRoomType(Boolean roomStatus, Type roomType);
    List<HotelRoom>findByRoomPriceLessThanAndRoomStatus(Double roomPrice,Boolean roomStatus);
    List<HotelRoom>findByRoomTypeAndRoomPriceGreaterThanEqualAndRoomPriceLessThanEqual(Type roomType,Double GreaterPrice,Double LessPrice);
    List<HotelRoom> findByRoomTypeOrderByRoomPriceDesc(Type roomType);
}
