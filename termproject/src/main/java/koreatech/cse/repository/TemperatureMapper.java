package koreatech.cse.repository;


import koreatech.cse.domain.Temperature;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureMapper
{
    @Insert("INSERT INTO WSC.TEMPERATURE (SENSOR_ID, TEMPERATURE, DATETIME, LOCATION)  " +
            "VALUES (#{sensorId}, #{temperature}, #{datetime}, #{location})")

    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = int.class) void insert(Temperature temperature);
    @Update("UPDATE WSC.TEMPERATURE SET TEMPERATURE = #{temperature}, DATETIME = #{datetime}, " +
            " LOCATION = #{location} WHERE ID = #{id}") void update(Temperature temperature);

    @Select("SELECT * FROM WSC.TEMPERATURE WHERE ID = #{id}")
    Temperature findOne(@Param("id") int id);

    @Delete("DELETE FROM WSC.TEMPERATURE WHERE ID = #{id}")
    void delete(@Param("id") int id);


    // ID로 받아서 객체로 리턴되는 하수 .
    @Select("SELECT * FROM WSC.TEMPERATURE WHERE SENSOR_ID = #{sensorId}")
    Temperature findOneBySensorId(@Param("sensorId") String sensorId);


    //where절을 보면 Concat 있는데 %1st%  만약 1st라고 쓰면 1st 라고 되어있는것이 다들어감.
    @Select("SELECT * FROM WSC.TEMPERATURE WHERE LOCATION LIKE CONCAT('%', #{location}, '%')")
    List<Temperature> findByLocation(@Param("location") String location);
}