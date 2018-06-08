package monthlyreport.util;

import monthlyreport.conts.CustConst;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;


import java.io.InputStream;
import java.util.List;

public class DBUtil {

	private static SqlSessionFactory sqlSessFact = null;
	public static final String MY_BATIS_CONF = "/monthlyreport/conf/mybatis-config.xml";

	private static void init() throws Exception {
		Logger log = Logger.getLogger(DBUtil.class);
		log.debug("init mybatis config:"+System.getProperty("sqlConfPath"));
		InputStream inputStream = Resources.getResourceAsStream(MY_BATIS_CONF);
		sqlSessFact = new SqlSessionFactoryBuilder().build(inputStream, System.getProperties());
	}
	
	public static void reload(){
		sqlSessFact = null;
	}

	public static SqlSession getSQLSession() throws Exception {
		if (sqlSessFact == null) {
			init();
		}
		return sqlSessFact.openSession(true);
	}

	public static SqlSession getSQLSession(boolean autoCommit) throws Exception {
		if (sqlSessFact == null) {
			init();
		}
		return sqlSessFact.openSession(autoCommit);
	}

	public static List selectList(SqlSession sess, String mapperName, Object inputParam) throws Exception{
		return sess.selectList(mapperName,inputParam);
	}
	
	public static List selectList(SqlSession sess, String mapperName) throws Exception{
		return sess.selectList(mapperName);
	}
	
	public static List selectList(SqlSession sess, String mapperName, Object inputParam, RowBounds rowBounds) throws Exception{
		return sess.selectList(mapperName,inputParam,rowBounds);
	}
	
	public static List selectList(String mapperName, Object inputParam) throws Exception{
		SqlSession sess = null;
		try{
			sess = getSQLSession();
			return selectList(sess,mapperName,inputParam);
		}finally{
			if(sess != null){
				sess.close();
			}
		}
	}
	
	public static List selectList(String mapperName) throws Exception{
		SqlSession sess = null;
		try{
			sess = getSQLSession();
			return selectList(sess,mapperName);
		}finally{
			if(sess != null){
				sess.close();
			}
		}
	}
	
	public static List selectList(String mapperName, Object inputParam, RowBounds rowBounds) throws Exception{
		SqlSession sess = null;
		try{
			sess = getSQLSession();
			return selectList(sess,mapperName,inputParam,rowBounds);
		}finally{
			if(sess != null){
				sess.close();
			}
		}
	}
	
	
	
	
	public static Object selectOne(SqlSession sess, String mapperName, Object inputParam) throws Exception{
		return sess.selectOne(mapperName, inputParam);
	}
	
	public static Object selectOne(String mapperName, Object inputParam) throws Exception{
		SqlSession sess = null;
		try{
			sess = getSQLSession();
			return selectOne(sess,mapperName,inputParam);
		}finally{
			if(sess != null){
				sess.close();
			}
		}
	}
	
	
	public static int insert(SqlSession sess, String mapperName, Object inputParam) throws Exception{
		return sess.insert(mapperName, inputParam);
	}
	
	public static int insert(String mapperName, Object inputParam) throws Exception{
		SqlSession sess = null;
		try{
			sess = getSQLSession();
			return insert(sess,mapperName,inputParam);
		}finally{
			if(sess != null){
				sess.close();
			}
		}
	}
	
	public static int update(SqlSession sess, String mapperName, Object inputParam) throws Exception{
		return sess.update(mapperName, inputParam);
	}
	
	public static int update(String mapperName, Object inputParam) throws Exception{
		SqlSession sess = null;
		try{
			sess = getSQLSession();
			return update(sess,mapperName,inputParam);
		}finally{
			if(sess != null){
				sess.close();
			}
		}
		
	}
	
	public static int delete(SqlSession sess, String mapperName, Object inputParam) throws Exception{
		return sess.delete(mapperName, inputParam);
	}
	
	public static int delete(String mapperName, Object inputParam) throws Exception{
		SqlSession sess = null;
		try{
			sess = getSQLSession();
			return delete(sess,mapperName,inputParam);
		}finally{
			if(sess != null){
				sess.close();
			}
		}
	}
	
	

	public static String escapeQuote(String input) {
		return input.replace("'", "''");
	}

	public static String getSQLMapName(String name, String lang) {
		return name + (CustConst.LANG_EN.equals(lang) ? "_" + lang : "");
	}

}
