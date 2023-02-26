package mapper;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;

@Repository
//增刪改查都封裝在BaseMapper
public interface UserMapper extends BaseMapper<User>{
}
