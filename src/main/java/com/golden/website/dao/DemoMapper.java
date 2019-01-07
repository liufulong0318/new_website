package dao;

import dataobject.Demo;
import java.util.List;

public interface DemoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    int insert(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    Demo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    List<Demo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Demo record);
}