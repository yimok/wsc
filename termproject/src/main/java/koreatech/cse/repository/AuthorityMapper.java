package koreatech.cse.repository;


import koreatech.cse.domain.Authority;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


// autority , temperature , user mapper에  wsc.  을 붙여야함 -> h2 디비를 쓸때  즉 wsc 스키마를 추가해줘야함
@Repository
public interface AuthorityMapper {
    @Insert("INSERT INTO wsc.AUTHORITIES (USER_ID, ROLE) VALUES (#{userId}, #{role})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
    void insert(Authority authority);

    @Update("UPDATE wsc.AUTHORITIES SET USER_ID = #{userId}, ROLE = #{role} WHERE ID = #{id}")
    void update(Authority authority);

    @Select("SELECT * FROM wsc.AUTHORITIES WHERE USER_ID = #{userId}")
    List<Authority> findByUserId(@Param("userId") int userId);

    @Delete("DELETE FROM wsc.AUTHORITIES WHERE ID = #{id}")
    void delete(Authority authority);

}
