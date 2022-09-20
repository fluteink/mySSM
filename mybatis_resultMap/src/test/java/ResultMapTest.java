import com.fluteink.mybatis.mappers.EmpMapper;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 明宇
 * @version 1.0
 */
public class ResultMapTest {
    @Test
    public void testGetEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println(empByEmpId);

    }
}
