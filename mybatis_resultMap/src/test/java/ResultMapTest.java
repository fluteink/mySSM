import com.fluteink.mybatis.mappers.DeptMapper;
import com.fluteink.mybatis.mappers.EmpMapper;
import com.fluteink.mybatis.pojo.Dept;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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
    @Test
    public void testGetEmpAndDeptByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByEmpId = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(empAndDeptByEmpId);
    }
    @Test
    public void getDept() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept empAndDeptByStep2 = mapper.getEmpAndDeptByStep2(1);
        System.out.println(empAndDeptByStep2);
    }
    @Test
    public void testGetEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByStep = mapper.getEmpAndDeptByStep(2);
        System.out.println(empAndDeptByStep);
    }
    @Test
    public void testGetDeptAndEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);
    }
    @Test
    public void testgetEmpsByDeptId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empsByDeptId = mapper.getEmpsByDeptId(1);
        System.out.println(empsByDeptId);
    }
    @Test
    public void testGetDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepOne = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(deptAndEmpByStepOne.getDeptName());
    }
}
