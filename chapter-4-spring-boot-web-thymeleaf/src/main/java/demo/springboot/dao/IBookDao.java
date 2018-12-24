package demo.springboot.dao;

import demo.springboot.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IBookDao {

    @Select("SELECT * FROM book")
    List<Book> findAll();
    /**
     * 新增 Book
     *
     * @param book {@link Book}
     */
    @Insert("INSERT INTO book(name,writer,introduction) VALUES (#{name},#{writer},#{introduction})")
    int insertByBook(Book book);

    /**
     * 更新 Book
     *
     * @param book {@link Book}
     */
    @Update("UPDATE book SET name=#{name},writer=#{writer},introduction=#{introduction} WHERE id=#{id}")
    int update(Book book);

    /**
     * 删除 Book
     *
     * @param id 编号
     */
    @Delete("DELETE FROM book WHERE id=#{id}")
    int delete(Long id);

    /**
     * 获取 Book
     *
     * @param id 编号
     */
    @Select("SELECT * FROM book WHERE id=#{id}")
    Book findById(Long id);

}
