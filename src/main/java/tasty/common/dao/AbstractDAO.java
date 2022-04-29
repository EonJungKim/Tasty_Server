package tasty.common.dao;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class AbstractDAO {
    protected Log log = LogFactory.getLog(AbstractDAO.class);
     
    @Autowired
    private SqlSessionTemplate sqlSession;
     
    protected void printQueryId(String queryId) {
        if(log.isDebugEnabled()){
            log.debug("\t QueryId  \t:  " + queryId);
        }
    }
     
    public Object insert(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.insert(queryId, params);
    }
     
    public Object update(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.update(queryId, params);
    }

    public Object delete(String queryId) {
        printQueryId(queryId);
        return sqlSession.delete(queryId);
    }

    public Object delete(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.delete(queryId, params);
    }
     
    public Object selectOne(String queryId) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId);
    }
    
    public Object selectOne(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId, params);
    }
     
    public <E> List<E> selectList(String queryId) {
        printQueryId(queryId);
        return sqlSession.selectList(queryId);
    }
     
    public <E> List<E> selectList(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectList(queryId,params);
    }
    
	public <K, V> Map<K, V> selectMap(String queryId, String mapKey) {
		return sqlSession.selectMap(queryId, mapKey);
	}
	
	public <K, V> Map<K, V> selectMap(String queryId, Object parameterObject, String mapKey) {
		return sqlSession.selectMap(queryId, parameterObject, mapKey);
	}
	
	//CHECKSTYLE:OFF
  	/**
  	 * 명명규칙에 맞춰 selectList()로 변경한다.
  	 * 
  	 * @see EgovAbstractMapper.selectList()
  	 * @deprecated List<?> 메소드로 대체
  	 */
  	//CHECKSTYLE:ON
  	@Deprecated
  	public List<?> list(String queryId, Object parameterObject) {
  		return sqlSession.selectList(queryId, parameterObject);
  	}

}