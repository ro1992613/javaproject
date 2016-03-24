package test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.blog.dao.AuthorDAO;
import com.blog.entity.Author;

public class Test {

	private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader; 

    static{
        try{
            reader    = Resources.getResourceAsReader("SqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
          
        AuthorDAO authorDao = session.getMapper(AuthorDAO.class);  
        
        Author author = authorDao.getAuthor("1");
        
        System.out.println("authorname："+author.getAuthorName());  
          
        
        session.close();  
	}


}
