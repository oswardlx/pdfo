package generator;

import generator.Departments;
import generator.DepartmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentsDao {
    long countByExample(DepartmentsExample example);

    int deleteByExample(DepartmentsExample example);

    int deleteByPrimaryKey(String deptNo);

    int insert(Departments record);

    int insertSelective(Departments record);

    List<Departments> selectByExample(DepartmentsExample example);

    Departments selectByPrimaryKey(String deptNo);

    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}