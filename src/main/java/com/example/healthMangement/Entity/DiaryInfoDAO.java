package com.example.healthMangement.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;

@Component
public class DiaryInfoDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询全部
    public List<DiaryInfo> findAll() {
        return jdbcTemplate.query("select * from diaryinfo", new BeanPropertyRowMapper<DiaryInfo>(DiaryInfo.class));
    }

    //根据ID进行查询
    public DiaryInfo findById(String id) {
        return jdbcTemplate.queryForObject("select * from diaryinfo where diaryId=?", new Object[]{id}, new BeanPropertyRowMapper<DiaryInfo>(DiaryInfo.class));
    }

    //根据diaryID进行删除操作
    public int deleteById(String id) {
        return jdbcTemplate.update("delete from diaryinfo where diaryId=?", new Object[]{id});
    }

    //进行插入操作
    public int insert(DiaryInfo diaryInfo) {
        return jdbcTemplate.update("INSERT INTO diaryinfo (diaryId,diaryDate,diaryTitle,diaryContent,diaryState) VALUES (?,?,?,?,?)",
                new Object[]{
                        diaryInfo.getDiaryId(),
                        diaryInfo.getDiaryDate(),
                        diaryInfo.getDiaryTitle(),
                        diaryInfo.getDiaryContent(),
                        diaryInfo.getDiaryState()
                });
    }

    //根据diaryID进行更新操作
    public int update(DiaryInfo diaryInfo) {
        return jdbcTemplate.update("update diaryinfo set diaryDate=?,diaryTitle=?,diaryContent=?,diaryState=? where diaryId=?",
                new Object[]{
                        diaryInfo.getDiaryDate(),
                        diaryInfo.getDiaryTitle(),
                        diaryInfo.getDiaryContent(),
                        diaryInfo.getDiaryState(),
                        diaryInfo.getDiaryId()
                });
    }
}
